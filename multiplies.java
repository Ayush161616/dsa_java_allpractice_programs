import java.util.Scanner;

public class multiplies
{
    static void printmultiplies(int n,int k){
        if(k==1){
            System.out.println(n);
            return;

        }
        printmultiplies(n,k-1);
        System.out.println(n*k);

}

    public static void main(String[] args) {
        System.out.println("Enter the value of n and k");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int k = sc.nextInt();
        printmultiplies(n,k);
    }
}
