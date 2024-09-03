package bts16;

import java.util.Arrays;
import java.util.Scanner;

public class bt05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao max");
        int max = sc.nextInt();
        System.out.println("Nhap vao min");
        int min = sc.nextInt();
        Integer[] arr = getArr();
        findNumber(arr,min,max);
    }
    private static Integer[] getArr(){
        Integer arr[] = new Integer[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        Arrays.sort(arr);
        return arr;
    }
    private static void findNumber(Integer[] arr,int min, int max){
        int indexMin = 0;
        int indexMax = 0;
        for(int i = 0; i< arr.length;i++){
            if (arr[i] > min){
                min = arr[i];
                indexMin =i;
            }
        }
        for (int i =0; i<arr.length; i++){
            if(arr[i]<max){
                max = arr[i];
                indexMax = i;
            }
        }
        System.out.println("So lon hon gan nhat cua min: " +min +" vị tri: "+indexMin);
        System.out.println("So be hon gan nhat của max: "+max + " vi tri: "+indexMax);
    }
}
