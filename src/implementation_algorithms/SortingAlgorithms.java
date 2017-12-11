/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementation_algorithms;

import java.util.Arrays;
import inf_algorithms.ISortingAlgorithms;

/**
 *
 * @author Milos Dragovic
 */
public class SortingAlgorithms implements ISortingAlgorithms {

    /**
     * In this method we have ilustration of how selection sort algorithms
     * actually works, input parametar is simple array of integer @param arr and
     * return value is itselg but previously sorted
     *
     * @param arr
     * @return int[]
     *
     */
    @Override
    public int[] selectionSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int smallest = arr[i];
            int position = i;
            System.out.println("Smallest value is " + smallest + " witch postition is " + position);
            for (int j = i; j < arr.length; j++) {
                System.out.println(j + " " + (arr[j] < smallest) + "");
                if (arr[j] < smallest) {
                    //Here we storege position and value of min num
                    smallest = arr[j];
                    position = j;
                    System.out.println("New smallest value has changed and its value is " + smallest + " and its " + position + ". position");
                }
            }
            //swaping position 
            int temp = arr[i];
            arr[i] = smallest;
            arr[position] = temp;
            System.out.println("On " + i + ". iterations, array looks like this: " + Arrays.toString(arr) + "\n");

        }
        return arr;
    }

    
    @Override
    public int[] bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }

  
//    @Override
//    public int[] mergeSort(int[] arr) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
  // Merges two subarrays of arr[].
    // First subarray is arr[l..m]
    // Second subarray is arr[m+1..r]
    void mergeSort(int arr[], int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;
 
        /* Create temp arrays */
        int L[] = new int [n1];
        int R[] = new int [n2];
 
        /*Copy data to temp arrays*/
        for (int i=0; i<n1; ++i)
            L[i] = arr[l + i];
        for (int j=0; j<n2; ++j)
            R[j] = arr[m + 1+ j];
 
 
        /* Merge the temp arrays */
 
        // Initial indexes of first and second subarrays
        int i = 0, j = 0;
 
        // Initial index of merged subarry array
        int k = l;
        while (i < n1 && j < n2)
        {
            if (L[i] <= R[j])
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
 
        /* Copy remaining elements of L[] if any */
        while (i < n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }
 
        /* Copy remaining elements of R[] if any */
        while (j < n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
 
    // Main function that sorts arr[l..r] using
    // mergeSort()
    void sort(int arr[], int l, int r)
    {
        if (l < r)
        {
            // Find the middle point
            int m = (l+r)/2;
 
            // Sort first and second halves
            sort(arr, l, m);
            sort(arr , m+1, r);
 
            // Merge the sorted halves
            mergeSort(arr, l, m, r);
        }
    }
 
    /* A utility function to print array of size n */
   	// Merges two subarrays of arr[].
	// First subarray is arr[l..m]
	// Second subarray is arr[m+1..r]
	void mergeSort(int arr[], int l, int m, int r)
	{
		// Find sizes of two subarrays to be merged
		int n1 = m - l + 1;
		int n2 = r - m;

		/* Create temp arrays */
		int L[] = new int [n1];
		int R[] = new int [n2];

		/*Copy data to temp arrays*/
		for (int i=0; i<n1; ++i)
			L[i] = arr[l + i];
		for (int j=0; j<n2; ++j)
			R[j] = arr[m + 1+ j];


		/* Merge the temp arrays */

		// Initial indexes of first and second subarrays
		int i = 0, j = 0;

		// Initial index of merged subarry array
		int k = l;
		while (i < n1 && j < n2)
		{
			if (L[i] <= R[j])
			{
				arr[k] = L[i];
				i++;
			}
			else
			{
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		/* Copy remaining elements of L[] if any */
		while (i < n1)
		{
			arr[k] = L[i];
			i++;
			k++;
		}

		/* Copy remaining elements of R[] if any */
		while (j < n2)
		{
			arr[k] = R[j];
			j++;
			k++;
		}
	}

	// Main function that sorts arr[l..r] using
	// mergeSort()
	void sort(int arr[], int l, int r)
	{
		if (l < r)
		{
			// Find the middle point
			int m = (l+r)/2;

			// Sort first and second halves
			sort(arr, l, m);
			sort(arr , m+1, r);

			// Merge the sorted halves
			mergeSort(arr, l, m, r);
		}
	}

	/* A utility function to print array of size n */
	// Merges two subarrays of arr[].
	// First subarray is arr[l..m]
	// Second subarray is arr[m+1..r]
	void mergeSort(int arr[], int l, int m, int r)
	{
		// Find sizes of two subarrays to be merged
		int n1 = m - l + 1;
		int n2 = r - m;

		/* Create temp arrays */
		int L[] = new int [n1];
		int R[] = new int [n2];

		/*Copy data to temp arrays*/
		for (int i=0; i<n1; ++i)
			L[i] = arr[l + i];
		for (int j=0; j<n2; ++j)
			R[j] = arr[m + 1+ j];


		/* Merge the temp arrays */

		// Initial indexes of first and second subarrays
		int i = 0, j = 0;

		// Initial index of merged subarry array
		int k = l;
		while (i < n1 && j < n2)
		{
			if (L[i] <= R[j])
			{
				arr[k] = L[i];
				i++;
			}
			else
			{
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		/* Copy remaining elements of L[] if any */
		while (i < n1)
		{
			arr[k] = L[i];
			i++;
			k++;
		}

		/* Copy remaining elements of R[] if any */
		while (j < n2)
		{
			arr[k] = R[j];
			j++;
			k++;
		}
	}

	// Main function that sorts arr[l..r] using
	// mergeSort()
	void sort(int arr[], int l, int r)
	{
		if (l < r)
		{
			// Find the middle point
			int m = (l+r)/2;

			// Sort first and second halves
			sort(arr, l, m);
			sort(arr , m+1, r);

			// Merge the sorted halves
			mergeSort(arr, l, m, r);
		}
	}

	/* A utility function to print array of size n */
	static void printArray(int arr[])
	{
		int n = arr.length;
		for (int i=0; i<n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
   
        }
