import java.util.Scanner;
public class HW1{
    public static void main(String[] args) {
        // 배열 요소 수
        Scanner num = new Scanner(System.in);
        System.out.print("요소 수: ");
        int num1 = num.nextInt();
        int[] a = new int[num1];

        // 배열 값 대입
        for (int i = 0; i < num1; i++){
            Scanner num2 = new Scanner(System.in);
            System.out.print("a["+i+"] = ");
            int num3 = num2.nextInt();
            a[i] = num3;
        }

        // 숫자 찾기
        Scanner num4 = new Scanner(System.in);
        System.out.print("찾을 숫자: ");
        int num5 = num4.nextInt();

        // 가장 앞에 있는 경우

        // for (int x = 0; x < a.length; x++){
        //     for (int y = x+1; y < a.length; y++){
        //         if(a[x] == a[y]){
        //             if(x < y){
        //                 System.out.println("그 값은 a["+x+"]에 있습니다.");
        //             }else{
        //                 System.out.println("그 값은 a["+y+"]에 있습니다.");
        //             }
        //         }
        //     }
        // }

        // 가장 뒤에 있는 경우
        for (int x = 0; x < a.length; x++){
            for (int y = x+1; y < a.length; y++){
                if(a[x] == a[y]){
                    if(x > y){
                        System.out.println("그 값은 a["+x+"]에 있습니다.");
                    }else{
                        System.out.println("그 값은 a["+y+"]에 있습니다.");
                    }
                }
            }
        }


    }
}