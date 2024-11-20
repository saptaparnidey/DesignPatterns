package designpatterns.registry;

public class Main {
    public static void main(String[] args) throws Exception {
        RegistryStudent registryStudent = new RegistryStudent();

        Student aug23 = new Student(0,"",0,"Aug23","LLD","BE",2023,
                "Naman",2023,"Razorpay",70);
        Student may23 = new Student(0,"",0,"May23","DSA","FS",2023,
                "Mohit",2023,"Razorpay",70);

        registryStudent.addToRegistry(aug23.getBatchName(), aug23);
        registryStudent.addToRegistry(may23.getBatchName(), may23);

        Student kiranAug23 = registryStudent.getFromRegistry("Aug23").clone();
        kiranAug23.setId(18);
        kiranAug23.setName("Kiran");
        kiranAug23.setPsp(98);

    }
}
