package ru.nikiforov.aspects.test3;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * todo Document type UniLibraryAspect
 */

@Component
@Aspect
public class UniLibraryAspect {

    @Around("execution(public String ru.nikiforov.library.UniLibrary.returnBook())")
    public Object aroundReturnBookLogging(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("--- В библиотеку пытаются вернуть книгу ---");

        Object targetMethodResult;

        try {
            targetMethodResult = proceedingJoinPoint.proceed();
        } catch (Exception e) {
            System.out.println("aroundReturnBookLogging: было выброшено исключение " + e);
            throw e;
        }

//        targetMethodResult = "Преступление и наказание";

        System.out.println("--- В библиотеку успешно вернули книгу ---");

        return targetMethodResult;
    }
}