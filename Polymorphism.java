class Student{

    public Student() {
    }

    public void printInfo(String name){
        System.out.println("Name:"+name);
    }
    public void printInfo(int age){
        System.out.println("Age: "+age);
    }
    public void printInfo(String name , int rollno){
        System.out.println("Name: "+name);
        System.out.println("Roll No.: "+rollno);
    }
    
}
public class Polymorphism {
     public static void main(String[]args){
         Student s1= new Student();
         s1.printInfo("Kshitij");
         s1.printInfo(23);
         s1.printInfo("Kshitij",12);
     }
    
}
