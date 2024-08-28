import java.util.*;

public class rsp_2 {
    public static void main(String[] args) {
        String str[] = {"가위", "바위", "보"};
        Scanner sc = new Scanner(System.in);
        
        System.out.printf("(가위/바위/보)입력: ");
        String my = sc.next().trim();  // 입력된 문자열의 앞뒤 공백 제거
        int com = (int)(Math.random() * str.length);
        String str_com = str[com];

        System.out.printf("컴퓨터는 %s를 냈습니다. \n", str_com);

        if (my.equals(str_com)) {
            System.out.printf("비겼습니다 \n");
        } else if (
            (my.equals("가위") && str_com.equals("보")) ||
            (my.equals("바위") && str_com.equals("가위")) ||
            (my.equals("보") && str_com.equals("바위"))
        ) {
            System.out.printf("이겼습니다 \n");
        } else if (
            (my.equals("가위") && str_com.equals("바위")) ||
            (my.equals("바위") && str_com.equals("보")) ||
            (my.equals("보") && str_com.equals("가위"))
        ) {
            System.out.printf("졌습니다 \n");
        } else {
            System.out.println("잘못된 입력입니다. 가위, 바위, 보 중 하나를 입력하세요.");
        }
    }
}
