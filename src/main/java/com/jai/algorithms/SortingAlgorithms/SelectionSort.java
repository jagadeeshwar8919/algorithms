package com.jai.algorithms.SortingAlgorithms;

public class SelectionSort {
    public static void duplicatemain(){
        int arr[]={7,4,5,2,9,8,1,0,3,6};
        System.out.println("Before Selection sort : ");
        printArray(arr);
        sort(arr);
        System.out.println("After Selection sort : ");
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
        for(int i=0;i<arr.length-1;i++){
            int min=arr[i];
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;

                }
            }
        }

    }
}
