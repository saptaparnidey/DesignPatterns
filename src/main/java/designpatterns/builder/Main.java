package designpatterns.builder;

public class Main {
    public static void main(String[] args) {
        Student student = Student.builder()
                .id(18)
                .age(20)
                .batch("LLD")
                .email("ved@gmail.com")
                .name("Ved Sharma")
                .gradYear(2013)
                .psp(100)
                .phoneNumber("9888466374")
                .universityName("NIT")
                .build();

        System.out.println(student.toString());
    }
}
