package ru.nikiforov.aspects.test4;

import ru.nikiforov.student.Student;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * todo Document type UniversityLoggingAspect
 */

@Component
@Aspect
public class UniversityLoggingAspect {

    @Pointcut("execution(* ru.nikiforov.university.University.getStudents())")
    private void getStudentsUniversity() {}


    @Before("getStudentsUniversity()")
    public void beforeGetStudentsLogging() {
        System.out.println("beforeGetStudentsLoggingAdvice: логируем получение списка студентов перед методом getStudents()");
        System.out.println("------------------------------------");
    }

    @AfterReturning(
        pointcut = "getStudentsUniversity()",
        returning = "students"
    )
    public void afterReturningGetStudentsLogging(List<Student> students) {
        System.out.println("afterReturningGetStudentsLoggingAdvice: логируем получение списка студентов после работы метода getStudents и изменяем его");

        for (Student student : students)
            student.setNameSurname("Mr. " + student.getNameSurname());

        System.out.println("------------------------------------");
    }

    @AfterThrowing(pointcut = "getStudentsUniversity()", throwing = "exception")
    public void afterThrowingGetStudentsLogging(Throwable exception) {
        System.out.println("afterThrowingGetStudentsLogging: логируем выброс исключения " + exception);

        System.out.println("------------------------------------");
    }

    @After("getStudentsUniversity()")
    public void afterGetStudentsLogging() {
        System.out.println("afterGetStudentsLogging: логируем нормальное окончание метода или выброс исключения");

        System.out.println("------------------------------------");
    }
}