import java.util.Scanner;
class demo{
    double math, phy , chem;
    void details(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter marks for physics,maths and chems out of 40:");
        phy = sc.nextDouble();
        math = sc.nextDouble();
        chem = sc.nextDouble();
        System.out.println("phy="+phy+" chem="+chem+" math="+math);
    }
}
class demo2 extends demo{
    double sum;
    void disp(){
        sum = ((math+phy+chem)/120)*100;
        System.out.println("Total persentage = "+sum);
    }
}
public class percent {
    public static void main(String[] args){
        demo2 ob = new demo2();
        ob.details();
        ob.disp();
    }
}
