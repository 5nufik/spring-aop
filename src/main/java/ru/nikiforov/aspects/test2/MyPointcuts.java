package ru.nikiforov.aspects.test2;

import org.aspectj.lang.annotation.Pointcut;

/**
 * todo Document type MyPointcuts
 */

public class MyPointcuts {
    @Pointcut("execution(* add*(..))")
    public void allAddMethods() {}
}