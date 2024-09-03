package bts16;

import java.util.Scanner;

public class bt03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so");
        int number = sc.nextInt();
        int [] arr = new int[]{1,2,3,4,5,6,7};
        if(findIndex(arr,number) >= 0){
            System.out.println(findIndex(arr,number));
        }else{
            System.out.println("K tim thay");
        }
    }
    private static int findIndex(int[] arr, int number){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == number){
                return i;
            }
        }
        return -1;
    }
}
