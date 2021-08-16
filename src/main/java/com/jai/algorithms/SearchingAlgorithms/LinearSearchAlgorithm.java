package com.jai.algorithms.SearchingAlgorithms;

import java.util.ArrayList;

public class LinearSearchAlgorithm {


    static public void dulicatemain(){
        ArrayList list=new ArrayList();
        list.add(2);
        list.add(5);
        list.add(8);
        list.add(6);
        list.add(3);
        list.add(9);
        list.add(1);
        System.out.println("LinearSearch array is : "+list);
        search(list,3);

    }

    private static void search(ArrayList list, int ele) {
        for(int i=0;i<list.size();i++){
            if(list.get(i).equals(ele)){
                System.out.println("The element "+ele+" is found at the index of : "+i);
                return ;
            }
        }
        System.out.println("The element "+ele+" didn't found in the LinearSearch array");
    }
}
