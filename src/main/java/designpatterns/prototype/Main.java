package designpatterns.prototype;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Student s = new Student(1,"Arav",99,"May23","LLD","BE",2023,
                "Naman",2023,"Razorpay",70);
        List<Student> studentList = new ArrayList<>();

        for(int i=0;i<10;i++){
            studentList.add(s.clone());
        }
    }
}
