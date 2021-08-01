import java.util.Scanner;
public class HW2 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("요소 수: ");
        int num1 = number.nextInt();
        int[] a = new int[num1];

        // 배열에 난수 대입
        for (int i = 0; i < num1; i++){
            a[i] = (int)(Math.random()*10)+1;
        }

        // 인접한 배열 값이 있을 경우 수정
        for (int i = 1; i < num1; i++){
            if(a[i] == a[i-1]){
                a[i] += 1;
            }
        }



        // 배열 출력
        for (int j = 0; j < num1; j++){
            System.out.println("a["+j+"] = "+a[j]);
        }
        

        
    }

}
