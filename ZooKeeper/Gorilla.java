public class Gorilla extends Mammal {
    //? For the throwSomething() method, have it print out a message indicating that the gorilla has thrown something, as well as decrease the energy level by 5
    //? %d is for an int
    // child of mammal can just call the method from mammal
    public void throwSomething() {
        // System.out.printf("throwSomething: %d", this.displayEnergy() );
        this.setEnergyLevel(getEnergyLevel()-5);
        // System.out.printf("throwSomething, energy level is now: %d%n", this.displayEnergy() - 5);
        System.out.printf("Thanks to throwing that tire, my energy level is now: %d%n", this.displayEnergy());

    }


    //? For the eatBananas() method, have it print out a message indicating the gorilla's satisfaction and increase its energy by 10
    public void eatBananas() {
        this.setEnergyLevel(getEnergyLevel() +10);
        System.out.printf("Happy food time, my energy level is now: %d%n", this.displayEnergy());

    }
    //? For the climb() method, have it print out a message indicating the gorilla has climbed a tree and decrease its energy by 10
    public void climb() {
        this.setEnergyLevel(getEnergyLevel() -10);
        System.out.printf("Boy I bit off more than I could chew climbing this tree, now my energy level is: %d%n", this.displayEnergy());
    }
}