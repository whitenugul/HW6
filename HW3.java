import java.util.Scanner;
public class HW3 {
    public static void main(String[] args) {
        // 배열 요소 수 설정
        Scanner number = new Scanner(System.in);
        System.out.print("요소 수: ");
        int num = number.nextInt();
        int[] a = new int[num];

        // 배열에 서로 다른 난수 대입
        for (int i = 0; i < num; i++){
            a[i] = (int)(Math.random()*10+1);

            for (int j = 0; j < i; j++){
                if (a[i] == a[j]){
                    i--;
                    break;
                }
            }
        }

        // 배열 출력
        for(int x = 0; x < num; x++){
            System.out.println("a["+x+"] = "+a[x]);
        }

    }
}
