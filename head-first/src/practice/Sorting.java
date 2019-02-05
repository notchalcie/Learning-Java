package practice;



public class Sorting {
    public static void main (String[] args) {
        int[] arr = {7,2,5,9,2,1};
        Sorting sort = new Sorting();
        sort.bubble(arr);


        sort.quick(arr);
        BubbleSort bubble = new BubbleSort();

    }

    public void bubble(int[] array) {

    }

    public void quick(int[] array) {
        int arraySize = array.length;
        for (int i = 0; i < arraySize; i++) {

        }
        System.out.println("Sorted using Quick Sort algorithm");
    }
}
