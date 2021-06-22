package ru.nikiforov;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.nikiforov.library.UniLibrary;

/**
 * todo Document type TestUniLibrary
 */
public class TestUniLibrary {
    public static void main(String[] args) {
        System.out.println("Main start");

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class);

        System.out.println("В библиотеку вернули книгу " + uniLibrary.returnBook());

        context.close();

        System.out.println("Main ends");
    }
}