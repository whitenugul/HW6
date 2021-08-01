import java.util.Scanner;
public class HW4 {
    public static void main(String[] args) {
        //배열 정의
        Scanner number = new Scanner(System.in);
        System.out.print("요소 수: ");
        int num = number.nextInt();
        int[] a = new int[num];

        // 배열 값 대입
        for (int i = 0; i < num; i++){
            Scanner num2 = new Scanner(System.in);
            System.out.print("a["+i+"] = ");
            int num3 = num2.nextInt();
            a[i] = num3;
        }

        System.out.println("요소를 섞었습니다.");

        int[] b = new int[num];
        //배열 순서 섞기

        for (int j = 0; j < num; j++){
            b[(int)(Math.random()*7)] = a[j];
        }

        for (int j = 0; j < num; j++){
            System.out.println("a["+j+"] = "+b[j]);
        }

    }
}
