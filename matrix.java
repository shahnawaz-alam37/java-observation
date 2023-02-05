import java.util.Scanner;

class Demo {
    Scanner scan = new Scanner(System.in);
    int m, n, p, q;
    int a[][];
    int b[][];
    int c[][];
    void inputmatrix() {
        System.out.println("Enter the number of rows and columns of first matrix:");
        m = scan.nextInt();
        n = scan.nextInt();
        a = new int[m][n];
        System.out.println("Enter the number of rows and columns of second matrix:");
        p = scan.nextInt();
        q = scan.nextInt();
        b = new int[p][q];
        c = new int[m][q];
        if (n != p) {
            System.out.println("The matrices can't be multiplied with each other.");
        }
        else{
            System.out.println("Enter elements of first matrix:");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j] = scan.nextInt();
                }
            }
            System.out.println("Enter elements of second matrix:");
            for (int i = 0; i < p; i++) {
                for (int j = 0; j < q; j++) {
                    b[i][j] = scan.nextInt();
                }
            }
        }
    }
    public void matrixadd() {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println("Addition of two matrix:");
        print1(c);
    }
    public void matrixsub() {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                c[i][j] = a[i][j] - b[i][j];
            }
        }
        System.out.println("subtraction of two matrix:");
        print1(c);
    }
    public void transpose() {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                c[i][j] = a[j][i];
            }
        }
        System.out.println("Transpose of first matrix:");
        print1(c);
    }
    public void multiplyMatrix() {
        int sum = 0;
        System.out.println("Multiplication of two matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < q; j++) {
                // c[i][j]=0;
                for (int k = 0; k < p; k++) {
                    // c[i][j]+=a[i][k]*b[k][j];
                    sum = sum + a[i][k] * b[k][j];
                }
                // System.out.print(c[i][j]+" ");
                c[i][j] = sum;
                sum = 0;
            }
            // System.out.println(); // new line
        }
        print1(c);
    }

    public void print1(int[][] a) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < q; j++) {
                System.out.print(a[i][j]);
                System.out.print("\t");
            }
            System.out.println("");
        }
    }

    void main1() {
        inputmatrix();
        matrixadd();
        matrixsub();
        transpose();
        multiplyMatrix();
    }
}
public class matrix {
    public static void main(String[] args) {
        Demo ob = new Demo();
        ob.main1();
    }
}
