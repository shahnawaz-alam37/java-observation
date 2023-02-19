import java.util.Scanner;
import addition.add;
import subtraction.sub;
import multiplication.mul;
import division.div;
public class Main {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int x = scn.nextInt();
        System.out.println("Enter the second number:");
        int y = scn.nextInt();
        add ob = new add();
        ob.add_int(x, y);
        sub obj = new sub();
        obj.sub_int(x, y);
        mul obje = new mul();
        obje.mul_int(x, y);
        div objec = new div();
        objec.div_int(x, y);
    }
}
