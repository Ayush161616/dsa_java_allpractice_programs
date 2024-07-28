public class arraydisplay {
    static void printarray(int [] arr , int idx){
        if(idx == arr.length){
            return;
        }
        System.out.println(arr[idx]);
        printarray(arr,idx+1);

    }

    public static void main(String[] args) {
        int[] arr = {6,8,7,6,5};
        printarray(arr,0);
    }
}
