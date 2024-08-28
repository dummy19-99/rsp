import java.util.*;

public class rsp {
    public static void main(String[] args) {
        String str[] = {"가위", "바위", "보"};
        String my, str_com;

        Scanner sc = new Scanner(System.in);
        System.out.printf("(가위/바위/보)입력: ");
        my = sc.next(); //가위
        int com = (int)(Math.random() * str.length); //
        str_com = str[com];
        System.out.printf("컴퓨터는 %s를 냈습니다. \n", str_com);

        if (my.equals("가위")){
            if(str_com.equals("가위")){
                System.out.printf("비겼습니다 \n");
            }
            else if(str_com.equals("보")){
                System.out.printf("이겼습니다 \n");
            }
            else if(str_com.equals("바위")){
                System.out.printf("졌습니다 \n");
            }
        }

        if (my.equals("바위")){
            if(str_com.equals("가위")){
                System.out.printf("이겼습니다 \n");
            }
            else if(str_com.equals("보")){
                System.out.printf("졌습니다 \n");
            }
            else if(str_com.equals("바위")){
                System.out.printf("비겼습니다 \n");
            }
        }

        if (my.equals("보")){
            if(str_com.equals("가위")){
                System.out.printf("졌습니다 \n");
            }
            else if(str_com.equals("보")){
                System.out.printf("비겼습니다 \n");
            }
            else if(str_com.equals("바위")){
                System.out.printf("이겼습니다 \n");
            }
        }
    }
}
