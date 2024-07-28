public class factrecu {
    static int factoreal(int n) {
        if (n == 0) {
            return 1;
        }


        int smallans = factoreal(n - 1);
        int ans = n * smallans;
        return ans;

    }

    public static void main(String[] args) {
        System.out.println(factoreal(4));
    }
}





