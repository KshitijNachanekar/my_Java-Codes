public class MultilevelInheritance {

        public static void main(String[] args) {
        Shape s1 = new Shape();
        Triangle t1 = new Triangle();
        EquilateralTriangle e1 = new EquilateralTriangle();

        s1.area();
        t1.area();
        e1.area();
    }
}
    
class Shape{
        void area(){
            System.out.println("Display area");
        }
    }
class Triangle extends Shape{

    }
class EquilateralTriangle extends Triangle{

    }

