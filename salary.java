import java.util.Scanner;
class demo1{
    public double HRA,DA,GS,basicsalary,incometax,netsalary; 
    void ask(){
        Scanner snc = new Scanner(System.in);
        System.out.println("Enter the basic salary: ");
        basicsalary = snc.nextDouble();
    }
}
class demo2 extends demo1{
    void calculate()  //calculating all the parameters
    {
        HRA=0.1*basicsalary;
        DA=0.12*basicsalary;
        GS=basicsalary+DA+HRA;
        incometax=0.15*GS;
        netsalary=GS-incometax;
    }
}
class demo3 extends demo2{
    void disp(){
        System.out.println("Employee basic salary:"+basicsalary);
        System.out.println("HRA:"+HRA);
        System.out.println("DA:"+DA);
        System.out.println("GS:"+GS);
        System.out.println("Incometax:"+incometax);
        System.out.println("netsalary:"+netsalary);
    }
}
public class salary {
    public static void main(String[] args){
        demo3 ob = new demo3();
        ob.ask();
        ob.calculate();
        ob.disp();
    }
}
// import java.util.*;

// public class salary
// {
//   public static void main(String args[])
//    {
//        double basic,HRA,DA,PF,netsalary;

//        Scanner sc=new Scanner(System.in);
//       System.out.println("Enter The Basic salary:");
//       basic=sc.nextInt();

//       HRA=basic*0.1;
//       DA=basic*0.05;
//       PF=basic*0.12;  
//       netsalary=basic+HRA+DA-PF;
	
//       System.out.println("The Basic Pay Is:"+basic);
//       System.out.println("The HRA Is:"+HRA);
//       System.out.println("The DA Is:"+DA);
//       System.out.println("The PF Is:"+PF);
//       System.out.println("The NETSALARY Is:"+netsalary);

//    }
// } 
// class Parent {
//     public final void display() {
//         System.out.println("This is the Parent class");
//     }
// }

// class Child extends Parent {
//     // This will give a compile error because the display()
//     // method in the Parent class is marked as final
//      public void display() {
//         System.out.println("This is the Child class");
//     } 
// }

// public class Main {
//     public static void main(String[] args) {
//         Child ob = new Child();
//         ob.display(); 
//     }
// }