public class Bat extends Mammal{
    //? For the fly() method, print the sound of a bat taking off and decrease its energy by 50.
    public void fly() {
        this.setBatEnergyLevel(getBatEnergyLevel() -50);

        System.out.printf("SSSWWOWWOOOOSSSSHHHH.  Wow just from taking flight  my energy level is: %d%n", this.displayBatEnergy());
    }

    //? For the eatHumans() method, print the so- well, never mind, just increase its energy by 25.
    public void eatHumans() {
        this.setBatEnergyLevel(getBatEnergyLevel() +25);
        System.out.printf("Let's not discuss the intricacies of my meal preference shall we... but my energy level is now: %d%n", this.displayBatEnergy());
    }

    public void attackTown() {
        //? For the attackTown() method, print the sound of a town on fire and decrease its energy by 100.
        this.setBatEnergyLevel(getBatEnergyLevel() -100);
        System.out.printf("AAAHHHHH THE SWARM IS HEADING THIS WAY...NOOOO...SSSAAVVVEEE MNMMMEEEE....HELP USSSS!!!. Homes engulfed in flames...SHATTER!!!....CRASH!!!...BUILDINGS CRUMBLING TO ASH...UTTER DISTRUCTION. Energy level is now: %d%n", this.displayBatEnergy());
    }
}