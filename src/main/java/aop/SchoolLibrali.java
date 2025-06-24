package aop;

import org.springframework.stereotype.Component;

@Component
public class SchoolLibrali extends AbstractLibary {


    public void getBook() {
        System.out.println("Мы берем книгу из SchoolLibrali");
    }
}
