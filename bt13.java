package bts16;

import static bts16.bt06.printArray;

public class bt13 {
    public static void main(String[] args) {
        int[] arr = getArr();
        bubbleSort(arr);
        selectionSort(arr);
        insertionSort(arr);
    }
    private static int[] getArr(){
        int arr[] = new int[20];
        for (int i = 0; i < 20; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        printArray(arr);
    }
    public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            // Tìm phần tử nhỏ nhất trong đoạn chưa được sắp xếp
            for (int j = i + 1; j < arr.length;j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Hoán đổi phần tử nhỏ nhất với phần tử đầu tiên của đoạn chưa được sắp xếp
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        printArray(arr);
    }
    public static void insertionSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        printArray(arr);
    }
}
