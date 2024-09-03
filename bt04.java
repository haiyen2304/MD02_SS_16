package bts16;

import java.util.Arrays;
import java.util.Scanner;

public class bt04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so can tim");
        int number = sc.nextInt();
        int[] arr = new int[]{8,6,5,7,4,3,1};
        Arrays.sort(arr);
        if(binarySearch(arr,number) >= 0){
            System.out.println(binarySearch(arr,number));
        }else{
            System.out.println("K tim thay");
        }
    }
    private static int binarySearch(int[] arr, int number){
        int start = 0;
        int end = arr.length-1;
        while (start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == number){
                return mid;
            }else if( arr[mid] < number){
                start = mid +1;
            }else{
                end = mid -1;
            }
        }
        return -1;
    }
}
