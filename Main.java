abstract class Person{
    private String name;
    private String contact;
    private int age;
    private int id;

    public void setName(String name){
        this.name = name;
    }
    public void setContact(String contact){
        this.contact = contact;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setId(int id){
        this.id = id;
    }


    public String getName(){
        return name;
    }
    public String getContact(){
        return contact;
    }
    public int getAge(){
        return age;
    }
    public int getId(){
        return id;
    }
    
    abstract void feedPet(Animal animal);
    abstract void playWithPet(Animal animal);
    abstract void groomPet(Animal animal);
    
}

class Owner extends Person{
    public void adoptPet(Animal animal){
        System.out.println("Adapting " + getName() + ", " + getAge() + " years old");
    }

    @Override
    public void feedPet(Animal animal){
        System.out.println("Feeding Pet");
    }
    @Override
    void playWithPet(Animal animal){
        System.out.println("Playing with pet");
    }
    @Override
    void groomPet(Animal animal){
        System.out.println("Grooming the pet");
    }

}


abstract class Animal{
    private String name;
    private String breed;
    private int age;

    public void setName(String name){
        this.name = name;
    }

    public void setBreed(String breed){
        this.breed = breed;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public String getBreed(){
        return breed;
    }
    public int getAge(){
        return age;
    }

    abstract void makeSound();
    abstract void eat();
    abstract void sleep(); 
}

class Cat extends Animal{

    @Override
    public void makeSound(){
        System.out.println("Meow... Meow");
    }
    @Override
    public void eat(){
        System.out.println(getName() + " is Eating");
    }
    @Override
    public void sleep(){
        System.out.print(getName() + "is Sleeping");
    }
}

class Dog extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Arff... Arff");
    }
    @Override
    public void eat(){
        System.out.println(getName() + " is Eating");
    }
    @Override
    public void sleep(){
        System.out.print(getName() + "is Sleeping");
    }
}

import java.util.Scanner

class Main{

    public static void main(String[] args){
    Scanner input = new Scanner (System.in);
        
    System.out.println("Hello world!");

    }

}
