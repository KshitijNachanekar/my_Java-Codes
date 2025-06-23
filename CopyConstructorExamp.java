public class CopyConstructorExamp {
    String name;
    int age;
    public CopyConstructorExamp(String name , int age){
        this.name= name;
        this.age= age;
    }
    public CopyConstructorExamp(CopyConstructorExamp obj){
        this.name= obj.name;
        this.age= obj.age;
    }
    void display(){
        System.out.println("Name is "+name+", " +"Age is "+age);
    }
public class Student{
        public static void main(String[] args) {
             CopyConstructorExamp c1= new CopyConstructorExamp("Kshitij",23);   
             c1.display(); 
             CopyConstructorExamp c2= new CopyConstructorExamp(c1);
             System.out.println(c2.name);
        }
    }
}
