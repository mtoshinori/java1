public class Hero {
    private int hp;
    String name;
    Sword sword;
    static int money;
    
    void sleep() {
        this.hp = 100;
        System.out.println(this.name + "は、眠って回復した！");
    }
}