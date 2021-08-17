package com.jai.algorithms.SortingAlgorithms;

public class InsertionSort {
    public static void duplicatemain(){
        int arr[]={7,4,5,2,9,8,1,0,3,6};
        System.out.println("Before Insertion sort : ");
        printArray(arr);
        sort(arr);
        System.out.println("After Insertion sort : ");
        printArray(arr);
    }

    private static void printArray(int[] arr) {
        System.out.print("The array is: ");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }

    private static void sort(int[] arr) {
        for(int i=1;i<arr.length;i++){
            for(int j=i;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }

    }
}
