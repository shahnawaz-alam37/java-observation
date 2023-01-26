import java.util.Scanner;
class demo{
    final double pi = 3.14;
    void area(double r){
        System.out.println("Area of cirle = "+ pi*r*r);
    }
    void circumference(double r){
        System.out.println("circumference of cirle = "+ 2*pi*r);
    }
}
public class area {
    public static void main(String[] args){
        demo obj = new demo();
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the radius of circle:");
        double n = scn.nextDouble();
        obj.area(n);
        obj.circumference(n);
    }
}
