public class Match {
    private Fighter fighter1;
    private Fighter fighter2;
    private int minWeight;
    private int maxWeight;

    public Match(Fighter fighter1, Fighter fighter2, int minWeight, int maxWeight) {
        this.fighter1 = fighter1;
        this.fighter2 = fighter2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    void run() {
        if (isCheck()) {
            int i = 1;
            while (this.getFighter1().getHealth() > 0 && this.getFighter2().getHealth() > 0) {
                System.out.println("====== Round : "+i+" ======");
                double chance = Math.random()*2;
                System.out.println(chance);
                if (chance<=1){
                    this.getFighter2().setHealth(this.getFighter1().hit(this.getFighter2()));
                    System.out.println("Fighter 2 : "+this.getFighter2().getHealth());
                    if (isWin()) break;
                    this.getFighter1().setHealth(this.getFighter2().hit(this.getFighter1()));
                    System.out.println("Fighter 1 : "+this.getFighter1().getHealth());
                    if (isWin())break;
                }
                if (chance>=1){
                    this.getFighter1().setHealth(this.getFighter2().hit(this.getFighter1()));
                    System.out.println("Fighter 1 : "+this.getFighter1().getHealth());
                    if (isWin())break;
                    this.getFighter2().setHealth(this.getFighter1().hit(this.getFighter2()));
                    System.out.println("Fighter 2 : "+this.getFighter2().getHealth());
                    if (isWin()) break;
                }
                i++;
            }
        } else {
            System.out.println("The weights of the athletes do not match for this match");
        }
    }

    boolean isCheck() {
        return (this.getFighter1().getWeight() >= minWeight && this.getFighter1().getWeight() <= maxWeight) && (this.getFighter2().getWeight() >= this.getMinWeight() && this.getFighter2().getWeight() <= this.getMaxWeight());
    }

    boolean isWin(){
        if (this.getFighter1().getHealth()==0){
            System.out.println(this.getFighter2().getName() + " Win!!!");
            return true;
        }
        if (this.getFighter2().getHealth()==0){
            System.out.println(this.getFighter1().getName()+" Win!!!");
        }
        return false;
    }

    public Fighter getFighter1() {
        return fighter1;
    }

    public void setFighter1(Fighter fighter1) {
        this.fighter1 = fighter1;
    }

    public Fighter getFighter2() {
        return fighter2;
    }

    public void setFighter2(Fighter fighter2) {
        this.fighter2 = fighter2;
    }

    public int getMinWeight() {
        return minWeight;
    }

    public void setMinWeight(int minWeight) {
        this.minWeight = minWeight;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }
}
