package ru.nikiforov;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.nikiforov.student.Student;
import ru.nikiforov.university.University;

import java.util.List;

/**
 * todo Document type TestUniversity
 */
public class TestUniversity {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        University university = context.getBean("university", University.class);

        university.addStudents();

        try {
            List<Student> students = university.getStudents();
            System.out.println(students);
        } catch (Exception e) {
            System.out.println("Было поймано исключение " + e);
        }

        context.close();
    }
}