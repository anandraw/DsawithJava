package TestingShastra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name +"  "+ age;
    }

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Anand", 25));
        students.add(new Student("Ravi", 22));
        students.add(new Student("Neha", 28));


        Collections.sort(students, new AgeComparator());
        System.out.println(students);

    }
}


class AgeComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.age-s2.age;
    }
}

