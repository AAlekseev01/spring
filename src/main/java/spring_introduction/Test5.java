package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test5 {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");

        Dog myDog = context.getBean("MyPet", Dog.class);
        myDog.say();
        Dog yourDog = context.getBean("MyPet", Dog.class);
        yourDog.say();

        context.close();
    }
}