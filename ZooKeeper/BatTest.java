public class BatTest {
    public static void main(String[] args) {
        //? need to instantiate the Bat class
        Bat b = new Bat();
        b.fly();
        b.fly();
        b.displayBatEnergy();
        System.out.println();

        b.eatHumans();
        b.eatHumans();
        b.displayBatEnergy();
        System.out.println();

        b.attackTown();
        b.attackTown();
        b.attackTown();
        b.displayBatEnergy();
        System.out.println();
    }
}