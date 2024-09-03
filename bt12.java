package bts16;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class bt12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhap so ");
        int number = sc.nextInt();
        Integer[] arr = getArr();
        System.out.println(binarySearch(arr,number));
    }
    private static Integer[] getArr(){
        Integer arr[] = new Integer[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        Arrays.sort(arr, Collections.reverseOrder());
        return arr;
    }
    private static int binarySearch(Integer[] arr,int number){
        int start = 0;
        int end = arr.length-1;
        while (start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == number){
                return mid;
            }else if(arr[mid] < number){
                start = mid +1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
}
