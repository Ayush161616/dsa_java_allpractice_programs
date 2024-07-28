import java.util.Scanner;

public class seriessum {
    static  int  seriessum1(int n) {
        if (n == 0) return 0;
        if (n % 2 == 0) {
            return seriessum1(n - 1) + n;
        } else {
            return seriessum1(n - 1) + n;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n = sc.nextInt();
        System.out.println(seriessum1(n));
    }}
