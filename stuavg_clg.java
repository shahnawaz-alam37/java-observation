import java.util.Scanner;
class university{
    float avg;
    void grades(float avg){
        if(avg >= 95){
            System.out.println("A grade");
        }
        else if(avg >= 80 && avg <= 90){
            System.out.println("B grade");
        }
        else if(avg >= 72 && avg <= 79){
            System.out.println("C grade");
        }
        else if(avg >= 60 && avg <= 71){
            System.out.println("D grade");
        }
        else{
            System.out.println("fail");
        }
    }
}
class collage1 extends university{
    void grades(float avg){
        if(avg >= 90){
            System.out.println("A grade");
        }
        else if(avg >= 75 && avg <= 90){
            System.out.println("B grade");
        }
        else if(avg >= 50 && avg <= 74){
            System.out.println("C grade");
        }
        else{
            System.out.println("fail");
        }
    }
}
class collage2 extends university{
    void grades(float avg){
        if(avg >=80){
            System.out.println("A grade");
        }
        else if(avg >= 65 && avg <= 79){
            System.out.println("B grade");
        }
        else if(avg >= 40 && avg <= 64){
            System.out.println("C grade");
        }
        else{
            System.out.println("fail");
        }
    }
}
public class stuavg_clg {
    public static void main(String []args){
        collage1 ob = new collage1();
        Scanner scn = new Scanner(System.in);
        float []marks = new float[5];
        float sum=0,avg;
        System.out.println("Enter marks of 5 subjects:");
        for(int i=0;i<5;i++){
            marks[i]=scn.nextFloat();
        }
        for(int i=0;i<5;i++){
            sum = sum+marks[i];
        }
        avg=sum/5;
        System.out.println("average = " + avg);
        ob.grades(avg);
    }
}
