class Animal{
    void sound(){
        System.out.println("Animal is shouting");
    }
}
class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Dog is barking");
    }

}    

public class RunTimePolymorphism {
    public static void main(String[] args) {
        Dog d1= new Dog();
        Animal a1= new Animal();
        d1.sound();
        a1.sound(); 

    }
    
}
