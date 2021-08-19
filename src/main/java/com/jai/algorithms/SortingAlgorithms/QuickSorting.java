package com.jai.algorithms.SortingAlgorithms;

public class QuickSorting {

    public static void duplicatemain(){
        int arr[]={7,4,5,2,9,8,1,0,3,6};
        System.out.println("Before Quick sort : ");
        printArray(arr);
        sort(arr,0,arr.length-1);
        System.out.println("After Quick sort : ");
        printArray(arr);

    }

    private static void sort(int[] arr, int low, int high) {
        if(low<high){
            int piv=partition(arr,low,high);
            sort(arr,low,piv-1);
            sort(arr,piv+1,high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot=arr[high];
       int i=low-1;
        for(int j=low;j<=high-1;j++){
            if(arr[j]<pivot){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);

    }

    private static void printArray(int[] arr) {
        System.out.print("The array is: ");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
