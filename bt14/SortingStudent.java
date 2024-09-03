package bts16.bt14;

public class SortingStudent {
    public Student[] insertionSort(Student[] students) {
        int n = students.length;

        for (int i = 1; i < n; i++) {
            Student key = students[i];
            int j = i - 1;

            while (j >= 0 && students[j].getScore() > key.getScore()) {
                students[j + 1] = students[j];
                j--;
            }

            students[j + 1] = key;
        }

        return students;
    }

    // Sắp xếp Selection Sort theo điểm giảm dần
    public Student[] selectionSort(Student[] students) {
        int n = students.length;

        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (students[j].getScore() > students[maxIndex].getScore()) {
                    maxIndex = j;
                }
            }

            Student temp = students[maxIndex];
            students[maxIndex] = students[i];
            students[i] = temp;
        }

        return students;
    }

    // Sắp xếp Bubble Sort theo điểm giảm dần
    public Student[] bubbleSort(Student[] students) {
        int n = students.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (students[j].getScore() < students[j + 1].getScore()) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }

        return students;
    }
}
