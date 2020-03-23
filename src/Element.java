import java.util.Scanner;

public class Element {
    public static void main(String[] args) {
        int [] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 0};
        for (int value : array) {
            System.out.print(value + "\t");
        }
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Nhập số cần xóa: ");
        int delNumber = sc.nextInt();
        int index = checkNum(array, delNumber);
        if(index == -1) {
            System.out.println("Số không nằm trong mảng.");
        } else {
            deleteNumber(array, index);
        }
    }
    public static int checkNum (int[] array, int number) {
        int index = -1;
        for ( int i = 0; i < array.length; i++) {
            if (number == array[i]) {
                index = i;
            }
        }
        return index;
    }
    public static void deleteNumber (int[] array, int indexNumber) {
        for (int i = indexNumber; i < array.length -1 ; i++) {
            array[i] = array[i+1];
        }
        array[array.length - 1] = 0;
        for (int value : array) {
            System.out.print(value + "\t");
        }
    }
}
