import java.util.Scanner;
public class HW5 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("요소 수: ");
        int num = number.nextInt();
        int[] a = new int[num];

        for (int i = 0; i < num; i++){
            Scanner num1 = new Scanner(System.in);
            System.out.print("a["+i+"] = ");
            int num2 = num1.nextInt();
            a[i] = num2;
        }


        for (int i = 0; i < a.length/2; i++){
            int tmp = a[i];
            a[i] = a[a.length-1-i];
            a[a.length-1-i] = tmp;
        }

        System.out.println("a의 모든 요소를 역순으로 복사했습니다.");
        for (int j = 0; j < num; j++){
            System.out.println("a["+j+"] = "+a[j]);
        }
    }
}
