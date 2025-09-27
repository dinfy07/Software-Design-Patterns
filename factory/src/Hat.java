public abstract class Hat {
    String colorOfHat;
    int diametrOfHat;
    String typeOfHat;
    void informationOfHat(){
        System.out.println(
                "Type:" + typeOfHat +
                "\nColor:" + colorOfHat +
                "\nDiameter:" + diametrOfHat);
    }
}

class RedHat extends Hat {
    RedHat() {
        colorOfHat = "Red";
        diametrOfHat = 14;
        typeOfHat = "Cylindrical hat";
    }
}

class BlueHat extends Hat {
    BlueHat() {
        colorOfHat = "Blue";
        diametrOfHat = 27;
        typeOfHat = "Cowboy hat";
    }
}

interface HatFactory {
    Hat createHat();
}

class RedHatFactory implements HatFactory {
    public Hat createHat(){
        return new RedHat();
    }
}

class BlueHatFactory implements HatFactory {
    public Hat createHat(){
        return new BlueHat();
    }
}