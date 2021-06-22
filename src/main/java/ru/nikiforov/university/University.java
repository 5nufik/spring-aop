package ru.nikiforov.university;

import org.springframework.stereotype.Component;
import ru.nikiforov.student.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * todo Document type University
 */

@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudents() {
        Student st1 = new Student("Ivan Ivanov", 3, 5);
        Student st2 = new Student("Mishel Ivanov", 5, 4.2);
        Student st3 = new Student("Pavel Ivanov", 1, 3.9);

        students.add(st1);
        students.add(st2);
        students.add(st3);
    }

    public List<Student> getStudents() {
        System.out.println("Начало работы getStudents()");
        System.out.println("Вывод студента в методе getStudents() - " + students);
//        students.get(10);
        System.out.println("Конец работы getStudents()");

        return students;
    }
}