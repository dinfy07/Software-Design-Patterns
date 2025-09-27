public class User {
    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private String course;
    private String email;
    private String number;

    private User(Builder builder){
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.gender = builder.gender;
        this.course = builder.course;
        this.email = builder.email;
        this.number = builder.number;
    }

    public void print(){
        System.out.println(" First name:" + (this.firstName != null ? this.firstName : "None")
                + "\n Last name: " + (this.lastName != null ? this.lastName : "None")
                + "\n Age:" + (this.age != 0 ? this.age : "None")
                + "\n Gender:" + (this.gender != null ? this.gender : "None") +
                "\n Course:" + (this.course != null ? this.course : "None") +
                "\n Email:" + (this.email != null ? this.email : "None")
                + "\n Number:" + (this.number != null ? this.number : "None"));
    }

    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public int getAge() { return age; }
    public String getGender() { return gender; }
    public String getCourse() { return course; }
    public String getEmail() { return email; }
    public String getNumber() { return number; }

    public static class Builder {
        private String firstName;
        private String lastName;
        private int age;
        private String gender;
        private String course;
        private String email;
        private String number;

        public Builder firstName(String firstName){
            this.firstName = firstName;
            return this;
        }
        public Builder lastName(String lastName){
            this.lastName = lastName;
            return this;
        }
        public Builder age(int age){
            this.age = age;
            return this;
        }
        public Builder gender(String gender){
            this.gender = gender;
            return this;
        }
        public Builder course(String course){
            this.course = course;
            return this;
        }
        public Builder email(String email){
            this.email = email;
            return this;
        }
        public Builder number(String number){
            this.number = number;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }


}
