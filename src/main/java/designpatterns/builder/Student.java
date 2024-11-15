package designpatterns.builder;

public class Student {

    private int id;
    private String name;
    private int age;
    private double psp;
    private String batch;
    private String universityName;
    private int gradYear;
    private String email;
    private String phoneNumber;

    private Student(int id, String name, int age, double psp, String batch, String universityName, int gradYear, String email, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.psp = psp;
        this.batch = batch;
        this.universityName = universityName;
        this.gradYear = gradYear;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", psp=" + psp +
                ", batch='" + batch + '\'' +
                ", universityName='" + universityName + '\'' +
                ", gradYear=" + gradYear +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    public static Builder builder(){
        return new Builder();
    }

    public static class Builder{
        private int id;
        private String name;
        private int age;
        private double psp;
        private String batch;
        private String universityName;
        private int gradYear;
        private String email;
        private String phoneNumber;

        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder psp(double psp) {
            this.psp = psp;
            return this;
        }

        public Builder batch(String batch) {
            this.batch = batch;
            return this;
        }

        public Builder universityName(String universityName) {
            this.universityName = universityName;
            return this;
        }

        public Builder gradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        private void validate() {
            if(gradYear >= 2023){
                throw new InvalidGradYearException();
            }
            if(age < 18){
                throw new InvalidAgeException();
            }
            if(phoneNumber == null){
                throw new InvalidPhoneNumberException();
            }
            if(universityName == null){
                throw new InvalidUnivertyNameException();
            }
        }

        public Student build(){
            validate();
            return new Student(this.id, this.name, this.age, this.psp, this.batch, this.universityName,
                    this.gradYear, this.email, this.phoneNumber);
        }
    }
}


