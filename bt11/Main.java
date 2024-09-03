package bts16.bt11;

import java.util.ArrayList;



public class Main {
    public static void main(String[] args) {
        ArrayList<FootballTeam> footballTeams = new ArrayList<>();
        footballTeams.add(new FootballTeam(1,2,4,"Quang"));
        footballTeams.add(new FootballTeam(2,3,8,"Duc"));
        footballTeams.add(new FootballTeam(3,4,6,"Vien"));
        bubbleSortArr(footballTeams);
        selectionSort(footballTeams);
        insertSort(footballTeams);
    }
    //BubbleSort
    private static void bubbleSortArr(ArrayList<FootballTeam> arr) {
        boolean swapped;
        for (int i = 0; i < arr.size() - 1; i++) {
            swapped = false;
            for (int j = 0; j < arr.size() - i - 1; j++) {
                if (arr.get(j).getScore() > arr.get(j + 1).getScore()) {
                    FootballTeam temp  =  arr.get(j);
                    arr.set(j,arr.get(j + 1));
                    arr.set(j+1,temp);
                    swapped = true;
                }
            }
            // Nếu không có phần tử nào được hoán đổi trong vòng lặp bên trong, dừng sắp xếp
            if (!swapped) {
                break;
            }
        }
        for (FootballTeam fb: arr){
            System.out.println(fb.getName() + " | Score: "+fb.getScore());
        }
    }
    //Selection Sort
    private static void selectionSort(ArrayList<FootballTeam> arr) {

        for (int i = 0; i < arr.size() - 1; i++) {
            int minIndex = i;
            // Tìm phần tử nhỏ nhất trong đoạn chưa được sắp xếp
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(j).getScore() < arr.get(minIndex).getScore()) {
                    minIndex = j;
                }
            }

            // Hoán đổi phần tử nhỏ nhất với phần tử đầu tiên của đoạn chưa được sắp xếp
            FootballTeam temp = arr.get(minIndex);
            arr.set(minIndex, arr.get(i));
            arr.set(i, temp);
        }
        for (FootballTeam fb: arr){
            System.out.println(fb.getName() + " | Score: "+fb.getScore());
        }
    }
    //Insert sort
    private static void insertSort(ArrayList<FootballTeam> arr){

        for (int i = 1; i < arr.size(); i++) {
            FootballTeam key = arr.get(i);
            int j = i - 1;

            while (j >= 0 && arr.get(j).getScore() > key.getScore()) {
                arr.set(j+1,arr.get(i));;
                j--;
            }

            arr.set(j+1,key);
        }
        for (FootballTeam fb: arr){
            System.out.println(fb.getName() + " | Score: "+fb.getScore());
        }
    }
}
