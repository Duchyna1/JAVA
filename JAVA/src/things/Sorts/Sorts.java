package things.Sorts;

import java.util.Random;

class randomNumber {
    public static int getRandomNumberInRange(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
}

class sorts {
    static int[] selectionSort(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n-1; i++) {

            int min_idx = i;
            for (int j = i+1; j < n; j++){
                if (arr[j] < arr[min_idx]){
                    min_idx = j;
                }
            }
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    static int[] bubbleSort(int arr[]){
        for (int i = 1; i<arr.length; i++)
            for (int j = arr.length - 1; j >= i; j--)
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
        return arr;
    }

    public static void main(String[] args) {
        int[] array = new int[100];
        for (int i = 0; i<array.length; i++) {
            array[i] = randomNumber.getRandomNumberInRange(1, 100);
        }
        for (int i = 0; i<array.length; i++) {
            System.out.print(array[i] + " ");
        }
        array = bubbleSort(array);
        System.out.println(" ");
        for (int i = 0; i<array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
