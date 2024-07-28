import java.util.Arrays;
public class quickSort {
static void display(int []arr){
    for (int val: arr){
        System.out.print(val+"  ");
    }
}
    static void sort(int[] nums,int low,int hi){
        if(low>=hi){
            return;
        }
        int s = low;
        int e = hi;
        int m = s+(e-s)/2;
        int pivot= nums[m];
        while (s<=e){
            while (nums[s]<pivot){
                s++;
            }
            while (nums[e]>pivot){
                e--;

            }
            if(s<=e){
                int temp = nums[s];
                nums[s]=nums[e];
                nums[e]=temp;
                s++;
                e--;
                //System.out.println(sort());

            }
        }
        sort(nums,low,e);
        sort(nums,s,hi);
    }
    public static void main(String[] args) {


        int [] arr = {5,4,3,2,1};
       int n = arr.length;
        System.out.println("Array before sorting:");
        display(arr);
        sort(arr,0,n-1);
        System.out.println();
        System.out.println("Arry after Sorting:");

        Arrays.sort(arr);
        display(arr);

    }

}
