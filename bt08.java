package bts16;

import java.util.Arrays;
import java.util.Scanner;

public class bt08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập chuỗi từ người dùng
        System.out.print("Nhập vào chuỗi: ");
        String input = scanner.nextLine();

        // Chuyển chuỗi thành mảng các ký tự
        char[] charArray = input.toCharArray();

        // Sắp xếp mảng các ký tự theo thứ tự tăng dần
        Arrays.sort(charArray);

        // Xây dựng chuỗi kết quả chứa các ký tự duy nhất
        StringBuilder result = new StringBuilder();
        result.append(charArray[0]); // Thêm ký tự đầu tiên vào chuỗi kết quả
        for (int i = 1; i < charArray.length; i++) {
            // Nếu ký tự hiện tại khác ký tự trước đó, thêm vào chuỗi kết quả
            if (charArray[i] != charArray[i - 1]) {
                result.append(charArray[i]);
            }
        }
        // Hiển thị chuỗi kết quả đã sắp xếp và chứa các ký tự duy nhất
        System.out.println("Chuỗi tăng dần lớn nhất: " + result.toString());
        scanner.close();
    }
}
