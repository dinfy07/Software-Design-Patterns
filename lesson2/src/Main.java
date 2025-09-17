public class Main {
    public static void main(String[] args) {
        // Factory pattern
        HatFactory blueHatFactory = new BlueHatFactory();
        Hat blueHat = blueHatFactory.createHat();
        blueHat.informationOfHat();

        HatFactory redHatFactory = new RedHatFactory();
        Hat redHat = redHatFactory.createHat();
        redHat.informationOfHat();

        // Abstract Factory pattern
        LaptopFactory asusFactory = new AsusFactory();
        ROM asusROM = asusFactory.addROM();
        RAM asusRAM = asusFactory.addRAM();
        CPU asusCPU = asusFactory.addCPU();
        GPU asusGPU = asusFactory.addGPU();

        asusCPU.informationCPU();
        asusGPU.informationGPU();
        asusRAM.informationRAM();
        asusROM.informationROM();

        LaptopFactory lenovoFactory = new LenovoFactory();
        ROM lenovoROM = lenovoFactory.addROM();
        RAM lenovoRAM = lenovoFactory.addRAM();
        CPU lenovoCPU = lenovoFactory.addCPU();
        GPU lenovoGPU = lenovoFactory.addGPU();

        lenovoCPU.informationCPU();
        lenovoGPU.informationGPU();
        lenovoRAM.informationRAM();
        lenovoROM.informationROM();
    }
}