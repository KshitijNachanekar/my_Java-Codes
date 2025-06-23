public class Shape {
    void area() {
        System.out.println("Display Area");
    }

    static class Triangle extends Shape {
        double area;

        public void CalcArea(double length, double breadth) {
            area = 0.5 * length * breadth;
            System.out.println("Area: " + area);
        }
    }

    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.CalcArea(12, 4); 
        t.area();          
    }
}
