public class Main {
    public static void main(String[] args) {
        Dragon dragon = new Dragon();
        System.out.println(dragon);
        int attackAmt = dragon.attack();
        System.out.println(attackAmt);
        dragon.takeDamage(20);
    }
}