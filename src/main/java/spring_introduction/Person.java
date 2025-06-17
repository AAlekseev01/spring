package spring_introduction;

public class Person {
    private Pet pet;
    private String surname;
    private int age;

      //  public Person(Pet pet) {
     //   System.out.println("Person bean is created");
       // this.pet = pet;

    public Person() {
        System.out.println("Person bean is created");
    }

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
