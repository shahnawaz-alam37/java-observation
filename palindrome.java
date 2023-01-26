import java.util.Scanner;

class check {
    int num, reversedNum = 0, remainder;

    public void checknum(int usr_num) {
        num = usr_num;
        int originalNum = num;
        while (num != 0) {
            remainder = num % 10;
            reversedNum = reversedNum * 10 + remainder;
            num /= 10;
        }
        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is Palindrome.");
        } else {
            System.out.println(originalNum + " is not Palindrome.");
        }
    }
}

public class palindrome {
    public static void main(String[] args) {
        System.out.println("enter the number:");
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        check ob = new check();
        ob.checknum(n);

    }
}