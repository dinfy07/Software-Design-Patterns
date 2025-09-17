public class Main {
    public static void main(String[] args) {
        HatFactory blueHatFactory = new BlueHatFactory();
        Hat blueHat = blueHatFactory.createHat();
        blueHat.informationOfHat();

        HatFactory redHatFactory = new RedHatFactory();
        Hat redHat = redHatFactory.createHat();
        redHat.informationOfHat();
    }
}