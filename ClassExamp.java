public class ClassExamp {
    void show(){
        System.out.println("This is Inheritance");
    }
    static class child extends ClassExamp{

    }
    public static void main(String[] args) {
        child c1= new child();
        c1.show();
    }
}
