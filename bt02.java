package bts16;

import java.util.Arrays;
import java.util.Scanner;

public class bt02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so can tim");
        int number = sc.nextInt();

        int[][] arr = getArr();
        System.out.println(findIndex(arr,number));
    }
    private static int[][] getArr(){
        int arr[][] = new int[20][20];
        for (int i =0; i < arr.length; i++){
            for(int j = 0; j< arr[i].length;j++){
                arr[i][j] = (int) (Math.random() * 100);
            }
        }
        return arr;
    }
    private static boolean findIndex(int[][] arr, int number){
        boolean check = false;
        for (int i =0; i < arr.length; i++){
            for(int j = 0; j< arr[i].length;j++){
                if(arr[i][j] == number){
                    System.out.println("Vi tri " + arr[i][j]+ ": "+ "["+i+"]"+"["+j+"]");
                    check = true;
                }
            }
        }
        return check;
    }
}
