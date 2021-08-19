package com.jai.algorithms;

import com.jai.algorithms.SearchingAlgorithms.BinarySearchAlgorithm;
import com.jai.algorithms.SearchingAlgorithms.LinearSearchAlgorithm;
import com.jai.algorithms.ShortestPathAlgorithms.DijkstrasAlgorithm;
import com.jai.algorithms.SortingAlgorithms.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AlgorithmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlgorithmsApplication.class, args);

       //Dijkstra's Algorithm implementation
		DijkstrasAlgorithm.duplicatemain();

		//LinearSearchAlgorithm implementation
		LinearSearchAlgorithm.dulicatemain();

		//BinarySearchAlgorithm implementation
		BinarySearchAlgorithm.duplicatemain();

		//BubbleSort implementation
		BubbleSort.duplicatemain();

		//SelectionSort implementation
		SelectionSort.duplicatemain();

		//InsertionSort implementation
		InsertionSort.duplicatemain();

		//MergeSorting implementation
		MergeSorting.duplicatemain();

		//QuickSorting Implementation
		QuickSorting.duplicatemain();


	}



}
