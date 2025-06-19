package spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component ("personBean")
public class Person {
//@Autowired
//@Qualifier("catBean")
    private Pet pet;
    @Value("${person.surname}")
    private String surname;
    @Value("${person.age}")
    private int age;


//    @Autowired
        public Person (Pet pet) {
        System.out.println("Person bean is created");
        this.pet = pet;
    }
//    public Person() {
//        System.out.println("Person bean is created");
//    }

//@Autowired
//@Qualifier("dog")
    public void setPet(Pet pet) {
        System.out.println("Class Person : set pet");
        this.pet = pet;
    }

    public String getSurname() {
        System.out.println("Class Person : getSurname");
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        System.out.println("Class Person : getSurname");
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void callYourPet(){
        System.out.println("Helloy,my lovely Pet!");
        pet.say();
    }
}
