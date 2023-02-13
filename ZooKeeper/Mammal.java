public class Mammal {

    private int energyLevel = 100;
    // public b/c will access from one of it's child classes
    public int displayEnergy() {
        System.out.println(this.energyLevel);
        return this.energyLevel;
    }

//? allow us to manipulate energy level in child -> Gorilla

    public int getEnergyLevel() {
        return this.energyLevel;
    }

    public void setEnergyLevel(int energyLevel) {
        this.energyLevel = energyLevel;
    }

    //? Energy level for Bats

    private int batEnergyLevel = 300;
        // public b/c will access from one of it's child classes
        public int displayBatEnergy() {
            System.out.println(this.batEnergyLevel);
            return this.batEnergyLevel;
        }
    //? allow us to manipulate energy level in child -> Bat

    public int getBatEnergyLevel() {
        return this.batEnergyLevel;
    }

    public void setBatEnergyLevel(int batEnergyLevel) {
        this.batEnergyLevel = batEnergyLevel;
    }


}