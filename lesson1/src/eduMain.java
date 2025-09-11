public class eduMain {
    public static void main(String[] args) {
        User student = new User.Builder()
                .firstName("Beybit")
                .age(82)
                .gender('L')
                .email("loser_beyt=ba@geymail.com0")
                .number("yo yo yo 1 4 8 3 to the 3 to the 6 to the 9 representing the ABQ\nWHAT UP BIAATCH")
                .build();
        System.out.println(student.getFirstName());
    }
}