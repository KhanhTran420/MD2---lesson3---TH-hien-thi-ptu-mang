import java.util.Scanner;

public class TH2 {
    public static void main(String[] args) {
        // Khai báo mảng
        String[] students = {"khanh","tuan","dat","giang","long"};
        // Khai báo biến lưu tên
        Scanner scanner = new Scanner(System.in);
        // gán giá trị nhập vào
        System.out.println("Enter a name's student: ");
        String inputName = scanner.nextLine();
        boolean Exit = false;
        for (int i = 0; i < students.length ; i++) {
            if(students[i].equals(inputName)){
                System.out.println("Position of the students in the list " + inputName + " is: " +i);
                Exit = true;
                break;
            }
        }
        if (!Exit) {
            System.out.println("Not found " + inputName + " in the list.");
        }
    }
}
