abstract class Hat {
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
        colorOfHat = "Red";  // Инициализация цвета
        diametrOfHat = 14;   // Инициализация диаметра
        typeOfHat = "Cylindrical hat";  // Инициализация типа
    }
}

class BlueHat extends Hat {
    BlueHat() {
        colorOfHat = "Blue";  // Инициализация цвета
        diametrOfHat = 27;    // Инициализация диаметра
        typeOfHat = "Cowboy hat";  // Инициализация типа
    }
}

abstract class HatFactory {
    abstract Hat createHat();
}

class RedHatFactory extends HatFactory {
    Hat createHat(){
        return new RedHat();
    }
}

class BlueHatFactory extends HatFactory {
    Hat createHat(){
        return new BlueHat();
    }
}