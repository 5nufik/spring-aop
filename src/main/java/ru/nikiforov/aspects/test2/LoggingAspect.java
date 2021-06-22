package ru.nikiforov.aspects.test2;

import ru.nikiforov.book.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;

/**
 * todo Document type LoggingAspect
 */

//@Component
//@Aspect
//@Order(10)
public class LoggingAspect {

    @Before("ru.nikiforov.aspects.test2.MyPointcuts.allAddMethods()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();

        System.out.println("beforeAddLoggingAdvice: логирование попытки добавить книгу/журнал");
        System.out.println("methodSignature = " + methodSignature);
        System.out.println("methodSignature.getMethod() = " + methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType() = " + methodSignature.getReturnType());
        System.out.println("methodSignature.getName() = " + methodSignature.getName());

        if (methodSignature.getName().equals("addBook")) {
            Object[] arguments = joinPoint.getArgs();

            for(Object obj : arguments) {
                if (obj instanceof String) {
                    System.out.println("Книгу в библиотеку добавляет " + obj);
                }
                else if (obj instanceof Book) {
                    Book book = (Book) obj;

                    System.out.println("Информация о книге: название - " + book.getName() +
                                        ", автор - " + book.getAuthor() +
                                        ", год издания - " + book.getYearOfPublication());
                }
            }
        }

        System.out.println("-----------------------------");
    }
}