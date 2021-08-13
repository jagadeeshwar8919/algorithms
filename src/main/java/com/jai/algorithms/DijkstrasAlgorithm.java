package com.jai.algorithms;

import java.util.Scanner;

public class DijkstrasAlgorithm {

public static int size=9;

    static public void duplicatemain(){
        Scanner scan=new Scanner(System.in);
        int v=scan.nextInt();
        int e=scan.nextInt();
        int graph[][]=new int[v][v];
        for(int i=0;i<e;i++){
            int v1=scan.nextInt();
            int v2=scan.nextInt();
            int weight=scan.nextInt();
            graph[v1][v2]=weight;
            graph[v2][v1]=weight;
        }


//        int graph[][] = new int[][] { { 0, 4, 0, 0, 0, 0, 0, 8, 0 },
//                { 4, 0, 8, 0, 0, 0, 0, 11, 0 },
//                { 0, 8, 0, 7, 0, 4, 0, 0, 2 },
//                { 0, 0, 7, 0, 9, 14, 0, 0, 0 },
//                { 0, 0, 0, 9, 0, 10, 0, 0, 0 },
//                { 0, 0, 4, 14, 10, 0, 2, 0, 0 },
//                { 0, 0, 0, 0, 0, 2, 0, 1, 6 },
//                { 8, 11, 0, 0, 0, 0, 1, 0, 7 },
//                { 0, 0, 2, 0, 0, 0, 6, 7, 0 } };


        dijkstra(graph, 0);

    }

    private static void dijkstra(int[][] graph, int src) {
        int v=graph.length;
        boolean visited[]=new boolean[v];
        int distance[] =new int[v];
        for(int i=0;i<v;i++){
            distance[i]=Integer.MAX_VALUE;
        }
        distance[src]=0;
        for(int i=0;i<v-1;i++){
            int minVertex=fineMinVertex(distance,visited);
            visited[minVertex]=true;
            for(int j=0;j<v;j++){
                if(graph[minVertex][j]!=0 && !visited[j] && distance[minVertex]!=Integer.MAX_VALUE){
                    int newDist=distance[minVertex]+graph[minVertex][j];
                    if(newDist<distance[j]){
                            distance[j]=newDist;
                    }
                }
            }
        }

       for(int i=0;i<v;i++){
           System.out.println(i+"  "+distance[i]);
       }
    }

    private static int fineMinVertex(int[] distance, boolean[] visited) {
        int minVertex=-1;
        for(int i=0;i<distance.length;i++){
            if(!visited[i] && (minVertex== -1 || distance[i]<distance[minVertex])){
                minVertex =i;
            }
        }
        return minVertex;
    }


}
