package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");

        Dog myDog = (Dog) context.getBean("dog", Dog.class);
        myDog.say();

        //        Dog yourDog = (Dog) context.getBean("dog", Dog.class);
//
//        System.out.println("Переменные ссылаются на один и тот же объект?" + (myDog == yourDog));
//        System.out.println(myDog);
//        System.out.println(yourDog);
        context.close();
    }

}
