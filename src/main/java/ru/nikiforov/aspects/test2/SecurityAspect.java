package ru.nikiforov.aspects.test2;

import org.aspectj.lang.annotation.Before;

/**
 * todo Document type SecurityAspect
 */

//@Component
//@Aspect
//@Order(20)
public class SecurityAspect {

    @Before("ru.nikiforov.aspects.test2.MyPointcuts.allAddMethods()")
    public void beforeAddSecurityAdvice() {
        System.out.println("beforeAddSecurityAdvice: проверка прав на добавление книги/журнала");
        System.out.println("-----------------------------");
    }
}