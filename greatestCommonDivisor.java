import java.util.Scanner;

public class greatestCommonDivisor {
    static int GCD(int x , int y){
        while(x%y!=0){
            int rem = x%y;
            x=y;
            y=rem;

        }
        return y;

    }

    public static void main(String[] args) {
        System.out.println("Enter the value of x and y");
        Scanner sc= new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(GCD(x,y));

    }
}
