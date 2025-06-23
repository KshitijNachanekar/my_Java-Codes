// class Student{
//     static String college = "DYP"; 
//     String name;
//     int age;

//     public Student(String name, int age) {
//         this.name = name;
//         this.age = age;
//     }
//     void display() {
//         System.out.println(this.name);
//         System.out.println(this.age);
//     }
// }
// public class StaticClass {
//     public static void main(String[] args) {
//         Student s1 = new Student("Kshitij", 23);
//         Student s2 = new Student("Mrunal", 20);
        
//         s1.display();
//         s2.display();
//     }
// }
public class StaticClass {
    static{
        System.out.println("Static block executed");
    }
    public static void main(String[] args) {
        System.out.println("Main method executed");
    }
}