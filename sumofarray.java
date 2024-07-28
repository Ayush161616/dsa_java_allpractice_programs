public class sumofarray {
    static int sumprintarray(int [] arr , int idx){
        if(idx==arr.length){
            return 0;

        }
        int smallans = sumprintarray(arr,idx+1);
        return smallans + arr[idx];



    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        System.out.println(sumprintarray(arr,0));
    }
}
