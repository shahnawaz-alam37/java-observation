package question24;//remove the package name and question24 in import statement
import question24.pac.access;
class demo{
    int a=1;
    public int b = 2;
    private String str = "hello";
    protected int c = 3;
    void print(){
        System.out.println("\nInside the same class");
        System.out.println("default a: " + a);
        System.out.println("public b: " + b);
        System.out.println("private str: " + str);
        System.out.println("protected c: " + c);
    }
}
class demo2 extends demo{
    void print2(){
        System.out.println("\nInside the subclass");
        System.out.println("default a: " + a);
        System.out.println("public b: " + b);
        System.out.println("protected c: " + c);
        // System.out.println("protected str: " + str);
    }
    
}
class demo3 {
    void print3(){
        access ob = new access();
        System.out.println("\nimporing from different package");
        //System.out.println("default a: " +ob.a);
        System.out.println("public b: " + ob.b);
    }
}
public class Main {
    public static void main(String[] args){
        demo2 ob = new demo2();
        ob.print();
        ob.print2();
        demo3 obj = new demo3();
        System.out.println("\nsame package, different class");
        System.out.println("default a: "+ob.a);
        System.out.println("public b: "+ob.b);
        System.out.println("protected c: "+ob.c);
        obj.print3();
    }
}
