package hibernate_test2.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();

        Session session = null;
        try {
            session = factory.getCurrentSession();
            Employee employee = new Employee("Misha","Sidorov","HR",850);
            Detail detail = new Detail("London","9664454567","mishanya@gmail.com");

//            employee.setEmpDetail(detail);
            detail.setEmployee(employee);

            session.beginTransaction();
            session.save(employee);

            session.getTransaction().commit();
            System.out.println("Done!");
        }

        finally {
            session.close();
            factory.close();
        }

    }
}
