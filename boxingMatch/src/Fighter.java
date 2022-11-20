public class Fighter {
    private String name;
    private int damage;
    private int health;
    private int weight;
    private int dodge;


    public Fighter(String name, int damage, int health, int weight,int dodge) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
    }

    int hit(Fighter fighter){
        System.out.println(this.getName()+" => "+fighter.getName()+" "+this.getDamage()+" struck damage.");
        int remainderHealt = fighter.getHealth()-this.getDamage();
        if (fighter.isDodge()){
            System.out.println(fighter.getName()+" dodge!!");
            return fighter.getHealth();
        }
        if (remainderHealt<0){
            return 0;
        }else{
            fighter.setHealth(remainderHealt);
        }

        return fighter.getHealth();
    }

    boolean isDodge(){
        double randomNumber = Math.random()*100;
        return randomNumber <= this.getDodge();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getDodge() {
        return dodge;
    }

    public void setDodge(int dodge) {
        this.dodge = dodge;
    }
}
