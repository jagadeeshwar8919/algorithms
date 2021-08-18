package com.jai.algorithms.SortingAlgorithms;

public class MergeSorting {


    public static void duplicatemain(){
        int arr[]={7,4,5,2,9,8,1,0,3,6};
        System.out.println("Before Merge sort : ");
        printArray(arr);
        sort(arr,0,arr.length-1);
        System.out.println("After Merge sort : ");
        printArray(arr);


    }

    private static void sort(int[] arr, int l, int r) {
        if(l<r){
            int m =l+ (r-l)/2;
            sort(arr, l, m);
            sort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    private static void merge(int[] arr, int l, int m, int r) {
        int n1=m-l+1;
        int n2=r-m;

        int Left[]=new int[n1];
        int Right[]=new int[n2];

        for(int i=0;i<n1;i++){
            Left[i]=arr[l+i];
        }
        for(int i=0;i<n2;i++){
            Right[i]=arr[m+1+i];
        }
        int i=0,j=0,k=l;

        while(i<n1&&j<n2){
            if(Left[i]<=Right[j]){
                arr[k]=Left[i];
                i++;
            }else{
                arr[k]=Right[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = Left[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = Right[j];
            j++;
            k++;
        }
    }

    private static void printArray(int[] arr) {
        System.out.print("The array is: ");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();


    }

}
