package _02_control_statement;

import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String[] args) {
        int number = 10;
        if (number % 2 == 0) {
            System.out.println("짝수");
        } else {
            System.out.println("홀수");
        }

        /////////////////////////////////////////////////////////////////////
        // 문자열(String) 객체 비교
        System.out.println("이름을 입력해주세요 >> ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine(); // 엔터 이전까지의 문자열을 읽음
        System.out.println("name 값 확인: " + name);

//        BAD ('==' 대입 연산자 사용)
//        if (name == "김새싹") { // "김새싹"을 올바르게 입력해도 else 절로 넘어감
//        	System.out.println("환영합니다!");
//        } else {
//        	System.out.println("이름을 다시 확인해주세요!");
//        }

        // GOOD (`.equals()` 메서드 사용)
        if (name.equals("김새싹")) { // "김새싹"을 올바르게 입력해도 else 절로 넘어감
            System.out.println("환영합니다!");
        } else {
            System.out.println("이름을 다시 확인해주세요!");
        }

        // WHY?
        // - `==` 연산자: 두 객체의 참조 비교 (동일한 메모리 위치 가르키는지 확인)
        // - `.equals()` 메서드: 두 객체의 "내용"이 동일한지 비교

        // "문자열 리터럴"의 경우, Java 에서 특별한 취급. 동일한 문자열 리터럴이 사용될 경우, Java 컴파일러는 문자열 풀(string pool) 이라는 공유된 메모리 영역에 해당 문자열 저장
        // 즉, str1과 str2가 같은 문자열을 가르키고 있으므로 같은 참조를 가르킴. 따라서 `==` 연산자로 비교시 true
        String str1 = "hello";
        String str2 = "hello";

        if (str1 == str2) {
            System.out.println("같은 참조를 가리킵니다."); // 출력
        } else {
            System.out.println("서로 다른 참조를 가리킵니다.");
        }

        if (str1.equals(str2)) {
            System.out.println("내용이 같습니다."); // 출력
        } else {
            System.out.println("내용이 다릅니다.");
        }

        // 문자열 "동적 할당"의 경우, `new String(...)`을 사용해 새로운 문자열 객체를 생성하므로 서로 다른 객체를 가르킴
        // 즉, str3과 str4가 다른 객체이므로 `==` 연사자로 비교시 false. 따라서 문자열을 비교할 때는 `.equals()` 메서드로 비교하는 것이 바람직
        String str3 = new String("hi");
        String str4 = new String("hi");

        if (str3 == str4) {
            System.out.println("같은 참조를 가리킵니다.");
        } else {
            System.out.println("서로 다른 참조를 가리킵니다."); // 출력
        }

        if (str3.equals(str4)) {
            System.out.println("내용이 같습니다."); // 출력
        } else {
            System.out.println("내용이 다릅니다.");
        }

        /////////////////////////////////////////////////////////////////////
        // if ~ else if 문
        // - top down 방식으로 처음 조건 식이 참으로 평가되면 해당 식 수행 후, if 절 빠져나감
        if (number % 3 == 0) {
            System.out.println("3의 배수");
        } else if (number % 5 == 0) {
            System.out.println("5의 배수");
        } else {
            System.out.println("3의 배수도 5의 배수도 아님");
        }

        /////////////////////////////////////////////////////////////////////
        // switch ~ case 문
        // - 각 case 문의 break 문은 선택 사항으로 break 문 생략시 바로 밑의 case 문으로 넘어감. (여러 case 문으로 하나의 시행문 지정 가능)
        String dayOfWeek;
        int day = 4; // or 4

        switch (day) {
            case 1:
                dayOfWeek = "일요일";
                break;
            case 2:
                dayOfWeek = "월요일";
                break;
            case 3:
                dayOfWeek = "화요일";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                dayOfWeek = "수~일요일";
                break;
            default:
                dayOfWeek = "잘못된 입력입니다.";
                break;
        }

//        dayOfWeek = switch (day) {
//            case 1 -> "일요일";
//            case 2 -> "월요일";
//            case 3 -> "화요일";
//            case 4, 5, 6, 7 -> "수~일요일";
//            default -> "잘못된 입력입니다.";
//        };
        System.out.println(dayOfWeek + " 입니다.");
    }
}
