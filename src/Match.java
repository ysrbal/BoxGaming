public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    void start() {
        if (isWeight()) {
            while (f1.health > 0 && f2.health > 0) {
                System.out.println("==== NEW ROUND ====");
                int chance = Math.round((float) Math.random());
                System.out.println("Chance : " + chance);
                if (chance == 0) {
                    f2.health = f1.hit(f2);
                    if (isWin()) {
                        break;
                    }
                    f1.health = f2.hit(f1);
                    if (isWin()) {
                        break;
                    }
                }
                if (chance == 1) {
                    f1.health = f2.hit(f1);
                    if (isWin()) {
                        break;
                    }
                    f2.health = f1.hit(f2);
                    if (isWin()) {
                        break;
                    }
                }
                print();
            }
        } else {
            System.out.println("Sporcularin sikletleri uymuyor.");
        }

    }

    boolean isWeight() {
        return (f1.weight >= minWeight && f1.weight <= maxWeight) && (f2.weight >= minWeight && f2.weight <= maxWeight);
    }

    boolean isWin() {
        if (f1.health == 0) {
            System.out.println(f2.name + " KAZANDI !! ");
            return true;
        }
        if (f2.health == 0) {
            System.out.println(f1.name + "KAZANDI !!");
            return true;
        }
        return false;
    }

    void print() {
        System.out.println("===============");
        System.out.println(f1.name + " Kalan Saglik : " + f1.health);
        System.out.println(f2.name + " Kalan Saglik : " + f2.health);
    }
}
