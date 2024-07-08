package map;

import model.Student;

import java.util.*;

public class HashMapMain {
    public static void main(String[] args) {

        TreeMap<Student, String> studentCourses = new TreeMap<>();

        Student student1 = new Student(49, "Alice", 90);
        Student student2 = new Student(45, "Bob", 84);
        Student student3 = new Student(45, "Mario", 91);
        Student student4 = new Student(45, "Sonic", 99);

        studentCourses.put(student1, "Computer Science");
        studentCourses.put(student2, "Mathematics");
        studentCourses.put(student3, "Biology");
        studentCourses.put(student4, "Chemistry");

       studentCourses.forEach((student, s) -> {
           System.out.println(student + s);
       });
    }
}
