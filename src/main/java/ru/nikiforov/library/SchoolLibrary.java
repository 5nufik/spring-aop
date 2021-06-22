package ru.nikiforov.library;

import org.springframework.stereotype.Component;

/**
 * todo Document type SchoolLibrary
 */

@Component
public class SchoolLibrary extends AbstractLibrary {
//    @Override
    public void getBook() {
        System.out.println("Мы берём книгу из SchoolLibrary");
    }
}