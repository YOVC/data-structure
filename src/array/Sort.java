package array;

public class Sort {
    public static void main(String[] args) {
        int[] arr = {2,5,3,1,7,5};
        arr = sort1(arr);
        for (int i : arr) {
            System.out.print(i);
        }
    }
    //选择排序
    public static int[] sort1(int[] arr){
        if(arr==null || arr.length<2){
            return arr;
        }
        for(int i=0;i<arr.length-1;i++){
            int minIndex = i;
            for(int j = i;j<arr.length;j++){
                minIndex = arr[j] < arr[minIndex] ? j:minIndex;
            }
            swap(arr,i,minIndex);
        }
        return arr;
    }

    public static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    //冒泡排序


    //插入排序

}
