public class Main {
    public static void main(String[] args) {
        Fighter fighter1 = new Fighter("X Adam",10,120,100,80);
        Fighter fighter2 = new Fighter("Y Adam",9,85,85,10);

        Match match = new Match(fighter1,fighter2,85,100);
        match.run();
    }
}