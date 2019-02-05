package practice;

public class BubbleSort {
    pubil
    int arraySize = array.length;
        for (int i = 0; i < arraySize; i++) {
        if (array[i] > array[i+1]) {
            array[i] = array[i] + array[i+1];
            array[i+1] = array[i] - array[i+1];
            array[i] = array[i] - array[i+1];
        }
        System.out.print("Current arrangement" + array);
    }
    System.out.println("Sorted using Bubble Sort algorithm\n");
}
