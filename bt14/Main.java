package bts16.bt14;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        SortingStudent sortingStudent = new SortingStudent();
        Student[] sortedByScoreAsc = sortingStudent.insertionSort(students.toArray(new Student[0]));
        for (Student student: sortedByScoreAsc){
            System.out.println(student);
        }
        Student[] sortedByScoreDesc  = sortingStudent.selectionSort(students.toArray(new Student[0]));
        for (Student student: sortedByScoreDesc){
            System.out.println(student);
        }
        Student[] sortedByScoreBuble = sortingStudent.bubbleSort(students.toArray(new Student[0]));
        for (Student student: sortedByScoreBuble){
            System.out.println(student);
        }
    }
}
