import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {

        studentController studentController =new studentController();
        for(student student : studentController.getStudentList()){
            System.out.println(student.getStudentId());
            System.out.println(student.getStudentName());
            System.out.println(student.getSection());
        }


    }
}

