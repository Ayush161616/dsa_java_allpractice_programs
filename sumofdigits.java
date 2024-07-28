public class sumofdigits {
    static int Sod(int n){
        if(n>=0 && n<=9){
            return n;

        }
        int smallans = Sod(n/10);
        return smallans + n%10;

    }

    public static void main(String[] args) {
        System.out.println(Sod(12345));
    }
}
