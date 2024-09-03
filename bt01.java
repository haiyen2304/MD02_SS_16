package bts16;

public class bt01 {
    public static void main(String[] args) {
        int[] arr = getArr();
        int max = arr[0];
        for(int i =1; i < arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("So lon nhat: "+max);
    }
    private static int[] getArr(){
        int arr[] = new int[20];
        for(int i =0; i< arr.length; i++){
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }
}
