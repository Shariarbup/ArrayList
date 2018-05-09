import java.util.*;
public class studentController {

    public ArrayList<student>getStudentList(){
        ArrayList<student> students=new ArrayList<>();
        student student1=new student();
        student student12=new student();
        student1.setStudentId(1);
        student1.setStudentName("Al shariar");
        student1.setSection("sec-b");
        student12.setStudentId(2);
        student12.setStudentName("salamn AKondo Sohel");
        student12.setSection("sec-a");
        students.add(student1);
        students.add(student12);
        return students;

    }
}
