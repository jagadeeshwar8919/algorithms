package com.jai.algorithms.SortingAlgorithms;

public class BubbleSort {

    public static void duplicatemain(){
        int arr[]={8,5,6,3,9,1,0,2,4,7};
        System.out.println("Before Bubble sort : ");
        printArray(arr);
        sort(arr);
        System.out.println("After Bubble sort : ");
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
        boolean swapped;
        for(int i=0;i<arr.length-1;i++){
            swapped=false;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
            }
            if(swapped==false){
                break;
            }
        }
    }
}
