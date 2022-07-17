public class Main {
    public static void main(String[] args) {

        Fighter f1 = new Fighter ("A", 15, 125, 45, 43);
        Fighter f2 = new Fighter("B", 21, 134, 52, 36);

        Match newMatch = new Match(f1,f2,35,70);
        newMatch.start();


    }
}
