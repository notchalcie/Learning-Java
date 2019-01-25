package practice;



public class Sorting {
    public static void main (String[] args) {
        int[] arr = {7,2,5,9,2,1};
        Sorting sort = new Sorting();
        sort.bubble(arr);


        sort.quick(arr);


    }

    public void bubble(int[] array) {
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

    public void quick(int[] array) {
        int arraySize = array.length;
        for (int i = 0; i < arraySize; i++) {

        }
        System.out.println("Sorted using Quick Sort algorithm");
    }
}
