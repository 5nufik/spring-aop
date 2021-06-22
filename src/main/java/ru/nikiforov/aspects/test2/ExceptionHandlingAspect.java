package ru.nikiforov.aspects.test2;

import org.aspectj.lang.annotation.Before;

/**
 * todo Document type ExceptionHandlingAspect
 */

//@Component
//@Aspect
//@Order(30)
public class ExceptionHandlingAspect {

    @Before("ru.nikiforov.aspects.test2.MyPointcuts.allAddMethods()")
    public void beforeAddExceptionHandlingAdvice() {
        System.out.println("beforeAddExceptionHandlingAdvice: ловим/обрабатываем исключение при попытке добавить книгу/журнал");
        System.out.println("-----------------------------");
    }
}