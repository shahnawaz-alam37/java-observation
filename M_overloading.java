class demo {
    void area(int l, int b) {
        System.out.println("Area of rectangle is =" + l*b);
    }
    void area(double r) {
        double pi = 3.14;
        System.out.println("Area of circle is =" + pi*r*r);
    }
}
public class M_overloading {
    public static void main(String args[]) {
        demo ob = new demo();
        ob.area(5,10);
        ob.area(2);
    }
}