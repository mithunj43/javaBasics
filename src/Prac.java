import java.util.Arrays;

public class Prac{
    public static void main(String[] args) {
        int arr [] = {45, 12, 33, 445, 867, 999, 23, 25};
        System.out.println(Arrays.toString(arr));
        selectionSort(arr,0);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int arr[] , int index){
        if(index==arr.length)return;
        else {
            int ele = arr[index];
            int swapIndex = -1;
            for (int i = index+1; i < arr.length ; i++) {
                if(arr[i]<ele){
                    swapIndex=i;
                    ele=arr[i];
                }
            }
            if(swapIndex!=-1){
                int swapHelper = arr[index];
                arr[index] = arr[swapIndex];
                arr[swapIndex] = swapHelper;
            }
            selectionSort(arr,index+1);
        }
    }
}