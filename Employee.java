public class Employee {
     protected int id;
    protected int age;
    protected String name;
    protected boolean isPermanent;

    public static void main(String[] args) {

        Employee emp = new Employee();

        emp.age = (int)35.5;//did type cassting to fix the error

        System.out.println("Successfully started");
    }
}
