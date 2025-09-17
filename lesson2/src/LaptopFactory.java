interface ROM {
    void informationROM();
}

interface RAM {
    void informationRAM();
}

interface CPU {
    void informationCPU();
}

interface GPU {
    void informationGPU();
}

class Terabyte_1 implements ROM {
    public void informationROM() {
        System.out.println(1 + "Terabyte");
    }
}

class Gigabyte_512 implements ROM {
    public void informationROM() {
        System.out.println(512 + "Gigabyte");
    }
}

class Gigabyte_32 implements RAM {
    public void informationRAM() {
        System.out.println(32 + "Gigabyte");
    }
}

class Gigabyte_16 implements RAM {
    public void informationRAM() {
        System.out.println(16 + "Gigabyte");
    }
}

class Intel_Core implements CPU {
    public void informationCPU(){
        System.out.println("Intel Core");
    }
}

class AMD_Ryzen implements CPU {
    public void informationCPU(){
        System.out.println("AMD Ryzen");
    }
}

class GTX implements GPU {
    public void informationGPU() {
        System.out.println("GeForce GTX");
    }
}

class RTX implements GPU {
    public void informationGPU() {
        System.out.println("GeForce RTX");
    }
}

interface LaptopFactory {
    ROM addROM();
    RAM addRAM();
    CPU addCPU();
    GPU addGPU();
}

class AsusFactory implements LaptopFactory {
    public ROM addROM(){
        return new Gigabyte_512();
    }
    public RAM addRAM(){
        return new Gigabyte_16();
    }
    public CPU addCPU(){
        return new AMD_Ryzen();
    }
    public GPU addGPU(){
        return new GTX();
    }
}

class LenovoFactory implements LaptopFactory {
    public ROM addROM(){
        return new Terabyte_1();
    }
    public RAM addRAM(){
        return new Gigabyte_32();
    }
    public CPU addCPU(){
        return new Intel_Core();
    }
    public GPU addGPU(){
        return new RTX();
    }
}
