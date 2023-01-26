class Demo {
    int a;
    float b;
    char c;
    Demo() {}
    Demo(int x, float y, char z) {
        a = x;
        b = y;
        c = z;
    }
    void print() {
        System.out.println("a=" + a);
        System.out.println("b=" + b);
        System.out.println("c=" + c);
    }
}

public class C_overloading {
    public static void main(String args[]) {
        Demo ob = new Demo();
        System.out.println("default constructor");
        ob.print();
        Demo ob1 = new Demo(1, 3.14f, 'a');
        System.out.println("parameterised constructor");
        ob1.print();
    }
}
