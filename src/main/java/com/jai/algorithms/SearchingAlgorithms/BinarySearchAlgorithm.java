package com.jai.algorithms.SearchingAlgorithms;

public class BinarySearchAlgorithm {





    public static void duplicatemain(){
        int arr[]={5,6,8,9,12,23,34,41,56};
        int max=arr.length-1;
        int ele=41;
        int result=search(arr,0,max,ele);
        if(result>=1){
            System.out.println("The element "+ele+" is found at the index of : "+result);
        }else{
            System.out.println("The element "+ele+"didn't found");
        }
    }

    private static int search(int[] arr, int min, int max, int target) {
        if(max>=min){
            int mid=min+(max-min/2);
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]>=target){
                return search(arr,min,mid-1,target);
            }else{
                return search(arr,mid+1,max,target);
            }
        }
        return -1;
    }
}
