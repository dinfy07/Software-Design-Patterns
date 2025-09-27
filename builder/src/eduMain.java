public class eduMain {
    public static void main(String[] args) {
        User studentBeybitYeshimkul = new User.Builder()
                .firstName("Beybit")
                .number("87754002576")
                .age(82)
                .email("fsjhjfekjb@mail.ru")
                .gender("Male")
                .lastName("Yeshimkul")
                .build();
        studentBeybitYeshimkul.print();
    }
}