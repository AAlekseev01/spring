package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        UniLibrary uniLibrary = context.getBean("UniLibrary", UniLibrary.class);
        Book book = context.getBean("book", Book.class);

        uniLibrary.getBook();
        uniLibrary.addBook("Андрей",book);
        uniLibrary.addMagazine();
//        uniLibrary.returnMagazine();
//        uniLibrary.addBook();

        //uniLibrary.returnBook();

//SchoolLibrali schoolLibrali = context.getBean("schoolLibrali", SchoolLibrali.class);
//schoolLibrali.getBook();

        context.close();

    }
}
