public class HierarchicalInheritance {
    
        public static void main(String[] args) {
        Shape s1 = new Shape();
        Triangle t1 = new Triangle();
        Circle c1 = new Circle();

        s1.area();
        t1.area();
        c1.area();
    }
}
    
class Shape{
        void area(){
            System.out.println("Display area");
        }
    }
class Triangle extends Shape{
    @Override
    void area(){
        System.out.println("0.5* length *breadth");
    }

    }
class Circle extends Shape{
    @Override
    void area(){
        System.out.println("2* 3.142 * radius");
    }

}
