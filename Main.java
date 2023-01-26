import java.util.Scanner;
class Demo {
    int a[][] = new int[2][2];
    int b[][] = new int[2][2];
    int c[][] = new int[2][2];
    Scanner scan = new Scanner(System.in);
    public void fun() {
        System.out.println("Enter first matrix elements:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                a[i][j] = scan.nextInt();
            }
            // System.out.println("");
        }
        System.out.println("Enter second matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                b[i][j] = scan.nextInt();
            }
        }
    }

    public void matrixadd() {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }

    }

    public void print() {
        System.out.println("Addition of matrix");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(c[i][j]+" ");
                //System.out.print("\t");
            }
            System.out.println("");
        }
    }

    public void matrixsub() {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                c[i][j] = a[i][j] - b[i][j];
            }
        }
    }

    public void print1() {
        System.out.println("subtraction of two matrix");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(c[i][j]+" ");
            }
            System.out.println("");
        }
    }

    public void transpose() {
        System.out.println("transpose of matrix a");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                c[i][j] = a[j][i];
                System.out.print(c[i][j]+" ");
            }
            System.out.println("");
        }

    }
    public void multiplyMatrix(){
        System.out.println("Multiplying matrix:");
        for(int i=0;i<2;i++){    
            for(int j=0;j<2;j++){    
                c[i][j]=0;      
                for(int k=0;k<2;k++)      
                {      
                    c[i][j]+=a[i][k]*b[k][j];      
                }//end of k loop  
                System.out.print(c[i][j]+" ");  //printing matrix element  
            }//end of j loop  
            System.out.println();//new line    
        }      
    }

}

public class Main {
    public static void main(String[] args) {
        Demo ob = new Demo();
        ob.fun();
        ob.matrixadd();
        ob.print();
        ob.matrixsub();
        ob.print1();
        ob.transpose();
        ob.multiplyMatrix();
    }
}