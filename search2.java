public class search2 {
    static void findallindices(int []a, int n, int target, int idx){
        if(idx>=n){
            return;
        }
        if(a[idx]==target){
            System.out.print(idx);

        }
        findallindices(a,n,target,idx+1);

    }

    public static void main(String[] args) {
        int [] a = { 1,2,4,5,4,4,8};
        int target = 4;
        int n = a.length;
        int idx = 0;
        findallindices(a,n,target,idx);
    }
}
