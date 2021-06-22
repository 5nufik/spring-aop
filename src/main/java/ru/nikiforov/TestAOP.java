package ru.nikiforov;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.nikiforov.book.Book;
import ru.nikiforov.library.UniLibrary;

/**
 * todo Document type TestAOP
 */
public class TestAOP {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class);

        Book book = context.getBean("book", Book.class);

        uniLibrary.getBook();
        uniLibrary.addBook("Max", book);
        uniLibrary.addMagazine();

        context.close();
    }
}