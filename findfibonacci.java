public class findfibonacci {
    static int fib(int n){
        if(n==0 || n==1){
            return n;

        }
        int prev = fib(n-1);
        int preprev = fib(n-2);
        int ans = prev + preprev;
        return  ans;
    }

    public static void main(String[] args) {
        System.out.println(fib(8));
    }
}
