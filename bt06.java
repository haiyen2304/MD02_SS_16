package bts16;

public class bt06 {
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};
        System.out.print("Mảng ban đầu: ");
        printArray(arr);

        insertionSortAndPrint(arr);
    }
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void insertionSortAndPrint(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            // Di chuyển các phần tử của mảng đã sắp xếp về phía sau
            // cho đến khi tìm được vị trí thích hợp để chèn key
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
            // In ra mảng sau mỗi bước sắp xếp
            System.out.print("Bước " + i + ": ");
            printArray(arr);
        }
    }
}
