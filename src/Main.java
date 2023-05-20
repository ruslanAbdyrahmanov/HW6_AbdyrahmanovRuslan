public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setName("Король драконов");
        boss.setHealth(1000);
        boss.setLevel(50);
        System.out.print("Boss " + boss.getName() +" \nHealth " +boss.getHealth()+"\n Level " + boss.getLevel());
    }
}