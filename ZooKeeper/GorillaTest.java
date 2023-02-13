public class GorillaTest {
    public static void main(String[] args) {
        //? need to instantiate the Gorilla class
        Gorilla g = new Gorilla();
        //? Have Gorilla throw three things, eat bananas twice, and climb once.
        g.throwSomething(); // invoke method from Gorila which has a sysout so it will print out
        g.throwSomething(); 
        g.throwSomething(); 
        //? should see the updated value of energyLevel
        g.displayEnergy();

        g.eatBananas();
        //? should see the updated value of energyLevel
        g.eatBananas();
        g.displayEnergy();

        g.climb();
        //? should see the updated value of energyLevel
        g.displayEnergy();

    }
}