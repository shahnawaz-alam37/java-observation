import java.util.Scanner;
class demo{
    static int a=12;
    static void set(int s){
        a=s;
    }
    static void print(){
        System.out.println("a="+a);
    }
}
public class staticvar{
public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter static variable value:");
    int s=scan.nextInt();
    demo.set(s);
    demo.print();
   }
}
