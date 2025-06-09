    class Complex {
    int real;
    int imag;

    Complex(int r, int i) {
        real = r;
        imag = i;
    }

    Complex add(Complex c) {
        return new Complex(real + c.real, imag + c.imag);
    }

    void show() {
        System.out.println(real + " + " + imag + "i");
    }
}

public class AddComplexnum {
    public static void main(String[] args) {
        Complex c1 = new Complex(5, 3);
        Complex c2 = new Complex(2, 7);

        Complex result = c1.add(c2);

        System.out.print("First number: ");
        c1.show();

        System.out.print("Second number: ");
        c2.show();

        System.out.print("Sum: ");
        result.show();
    }
}

    
