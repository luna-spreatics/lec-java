package _03_array;

import java.util.Arrays;

// 표준 배열

// 배열
// - 배열에 저장할 자료형 선언하고, 배열이름과 크기를 선언해야 함
// - 배열의 원소는 모두 같은 타입
// - 처음 선언한 배열 크기 변경 불가능 (단, ArrayList 컬렉션의 경우, 동적으로 크기 조절 가능)
public class ArrayEx {

    public static void main(String[] args) {

        // 배열 변수 선언
        // - 두 가지 방법이 있으나 관례적으로 첫 번째 방법 사용
        // 1. 타입[] 변수;
        // 2. 타입 변수[];
        int[] arr1;
        int arr2[];

        // - 배열 변수는 "참조 변수". 배열도 객체이므로 힙 영역에 생성되고, 배열 변수는 힙 영역의 배열 주소를 저장. 따라서 참조할 배열이
        // 없다면 null 로 초기화 가능
        // ex. 타입[] 변수 = null;
        // => 배열 변수가 null 값을 가진 상태에서 변수[인덱스] 로 값을 읽거나 저장하게 되면 NullPointerException 발생
        String[] temp = null;
        System.out.println(temp); // 출력: null
//		System.out.println(temp[0]); // 출력: NullPointerException

        // - 값 목록으로 배열 변수 선언과 배열 생성
        // : 중괄호({})는 나열된 값들을 항목으로 가지는 배열을 힙에 생성하고, "번지"를 리턴
        // : 즉, 배열 변수는 "리턴된 번지"를 저장함으로써 참조가 이루어짐
        int[] intArray = {16, 22, 34, 41, 59};
        System.out.println("intArray[0]: " + intArray[0]);
        System.out.println("intArray[1]: " + intArray[1]);
        System.out.println("intArray[2]: " + intArray[2]);
        System.out.println("intAray:" + intArray); // 참조값 저장

        intArray[1] = 77; // 인덱스 1번 항목 값 변경
        System.out.println("intArray[1]: " + intArray[1]);

        // - 주의. 중괄호({}) 로 감싼 목록을 배열 변수에 대임할 때, 배열 변수 미리 선언한 수에는 값 목록을 변수에 대입 불가
        char[] charArray;
//		charArray={'A','B','C'}; // 컴파일 에러
        charArray = new char[]{'A', 'B', 'C'}; // 배열 변수 선언 시점과 값 목록 대입 시점이 다르다면 "new 타입[]"을 중괄호 앞에 붙여주여야 함.
        System.out.println("charArray[0]: " + charArray[0]);
        System.out.println("charArray[1]: " + charArray[1]);
        System.out.println("charArray[2]: " + charArray[2]);
        System.out.println();

        // - new 연산자로 배열 선언과 배열 생성
        // : new 연산자로 배열 처음 생성하면 배열 항목은 기본 값으로 초기화됨
        // (https://hongong.hanbit.co.kr/java-%EC%9E%90%EB%B0%94-%EB%B0%B0%EC%97%B4array-%EC%84%A0%EC%96%B8%ED%95%98%EA%B3%A0-%EC%83%9D%EC%84%B1%ED%95%98%EA%B8%B0/)
        double[] doubleArray = new double[3];
        System.out.println("new 연자로 초기화된 값: " + doubleArray[0]);
        doubleArray[0] = 0.1;
        doubleArray[1] = 2.4;
        doubleArray[2] = 1.8;
        System.out.println("doubleArray[0]: " + doubleArray[0]);
        System.out.println("doubleArray[1]: " + doubleArray[1]);
        System.out.println("doubleArray[2]: " + doubleArray[2]);
        System.out.println();

        /////////////////////////////////////////////////////////////////////////
        // 배열 길이
        // - 배열변수.length;
        // - length 필드는 읽기만 가능하므로 값 변경 불가능
        System.out.println("doubleArray 배열 길이: " + doubleArray.length);
//		doubleArray.length = 5; // 컴파일 에러

        // - 배열 길이는 반복문에서 자주 사용됨
        // ex. 총합과 평균 구하기
        int sum = 0;
        for (int i = 0; i < intArray.length; i++) {
            sum += intArray[i];
        }
        System.out.println("총합: " + sum);
        double avg = (double) sum / 3;
        System.out.println("평균: " + avg);
        System.out.println();

        // - 배열 길이를 벗어난다면?
//		System.out.println(doubleArray[doubleArray.length]); // ArrayIndexOutOfBoundsException

        /////////////////////////////////////////////////////////////////////////
        // 배열 출력
        // - toString(): 배열 내용을 문자열로 변환하여 반환
        // - 배열 주소값이 아닌 배열 내부 값을 모두 보고 싶다면!
        System.out.println("intArray: " + Arrays.toString(intArray));
        System.out.println("charArray: " + Arrays.toString(charArray));
        System.out.println("doubleArray: " + Arrays.toString(doubleArray));
        System.out.println();

        /////////////////////////////////////////////////////////////////////////
        // 다차원 배열
        // - 배열 안에 또 다른 배열이 존재하는 배열
        // 2x3 배열 생성 및 초기화
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};

        // 3x2 배열 생성 및 초기화
        int[][] matrix2 = new int[3][2];
        matrix2[0][0] = 1;
        matrix2[0][1] = 2;
        matrix2[1][0] = 3;
        matrix2[1][1] = 4;
        matrix2[2][0] = 5;
        matrix2[2][1] = 6;

        // 3차원 배열 생성 및 초기화
        int[][][] threeDimensionalArray = {{{1, 2}, {3, 4}}, {{5, 6}, {7, 8}}};

        System.out.println("matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nmatrix2:");
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }

        // 3차원 배열의 값 출력
        System.out.println("\nmatrix3:");
        for (int i = 0; i < threeDimensionalArray.length; i++) {
            for (int j = 0; j < threeDimensionalArray[i].length; j++) {
                for (int k = 0; k < threeDimensionalArray[i][j].length; k++) {
                    System.out.print(threeDimensionalArray[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        /////////////////////////////////////////////////////////////////////////
        // 객체를 참조하는 배열
        // - 기본 타입 배열은 각 항목에 값을 직접 저장
        // - 참조 타입 (클래스, 인터페이스) 배열은 각 항목에 객체의 번지를 저장
        String[] langs = new String[3];
        langs[0] = "Java";
        langs[1] = "Java";
        langs[2] = new String("Java");

        System.out.println(langs[0] == langs[1]); // 같은 객체 참조
        System.out.println(langs[1] == langs[2]); // 다른 객체 참조
        System.out.println(langs[0].equals(langs[2])); // 문자열이 동일
        System.out.println();

        /////////////////////////////////////////////////////////////////////////
        // 배열 복사
        // - 배열은 크기가 고정되어 있음
        // -> 더 많은 저장 공간 필요하다면 더 큰 길이의 배열을 새로 만들어 기존 배열을 복사해야 함

        // ver1. 반복문으로 요소 하나씩 복사
        int[] originArray = {1, 2, 3};
        int[] newArray = new int[5];
        System.out.println(Arrays.toString(originArray)); // 기존 배열 출력: [1, 2, 3]

        for (int i = 0; i < originArray.length; i++) {
            newArray[i] = originArray[i];
        }
        System.out.println(Arrays.toString(newArray)); // 복사 배열 출력: [1, 2, 3, 0, 0]

        // ver2. arraycopy() 사용
        // : System.arraycopy(Object src, int srcPos, Object dest, int destPos, int length);
        // - Object src: 원본 배열
        // - int srcPos: 원본 배열 복사 시작 인덱스
        // - Object dest: 새 배열
        // - int destPos: 새 배열 붙여넣기 시작 인덱스
        // - int length: 복사 항목 수
        String[] originFruits = {"apple", "banana", "kiwi"};
        String[] newFruits = new String[5];

//    System.arraycopy(originFruits, 0, newFruits, 1, originFruits.length - 1);
        System.arraycopy(originFruits, 1, newFruits, 0, originFruits.length - 1);
        System.out.println(Arrays.toString(originFruits));
        System.out.println(Arrays.toString(newFruits));
        System.out.println();

        /////////////////////////////////////////////////////////////////////////
        // Arrays 메소드
        // copyOf(arr, copyArrayLength) 메소드 예제
        int[] originalArray = {1, 2, 3, 4, 5};
        int[] copiedArray = Arrays.copyOf(originalArray, 3);
        System.out.println("Original Array: " + Arrays.toString(originalArray)); // 출력: [1, 2, 3, 4, 5]
        System.out.println("Copied Array: " + Arrays.toString(copiedArray)); // 출력: [1, 2, 3]

        // copyOfRange(arr, sIdx, eIdx) 메소드 예제
        int[] rangeArray = Arrays.copyOfRange(originalArray, 1, 4);
        System.out.println("Range Array: " + Arrays.toString(rangeArray)); // 출력: [2, 3, 4]

        // fill(arr, n) 메소드 예제
        int[] filledArray = new int[5];
        System.out.println("Filled Array (before): " + Arrays.toString(filledArray)); // 출력: [0, 0, 0, 0, 0]
        Arrays.fill(filledArray, 7);
        System.out.println("Filled Array (after): " + Arrays.toString(filledArray)); // 출력: [7, 7, 7, 7, 7]

        // sort(arr) 메소드 예제
        int[] unsortedArray = {5, 3, 1, 4, 2};
        Arrays.sort(unsortedArray);
        System.out.println("Sorted Array: " + Arrays.toString(unsortedArray)); // 출력: [1, 2, 3, 4, 5]

        // equals(arr1, arr2) 메소드 예제
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        int[] array3 = {4, 2, 3};
        
        boolean arraysEqual = Arrays.equals(array1, array2);
        boolean arraysEqual2 = Arrays.equals(array1, array3);

        System.out.println("Arrays Equal (1 vs 2): " + arraysEqual); // 출력: true
        System.out.println("Arrays Equal (1 vs 3): " + arraysEqual2); // 출력: false

        // == 비교
        System.out.println("Arrays == (1 vs 2): " + (array1 == array2)); // 출력: false
        System.out.println("Arrays == (1 vs 3): " + (array1 == array3)); // 출력: false

        // deepEquals(arr1, arr2) 메소드 예제
        int[][] deepArray1 = {{1, 2}, {3, 4}};
        int[][] deepArray2 = {{1, 2}, {3, 4}};
        int[][] deepArray3 = {{1, 2}, {3, 5}};
        boolean deepArraysEqual = Arrays.deepEquals(deepArray1, deepArray2);
        boolean deepArraysEqual2 = Arrays.deepEquals(deepArray1, deepArray3);
        System.out.println("Deep Arrays Equal (1 vs 2): " + deepArraysEqual); // 출력: true
        System.out.println("Deep Arrays Equal (1 vs 3): " + deepArraysEqual2); // 출력: false

        // binarySearch(arr, val) 메소드 예제 (단, 배열은 정렬된 상태여야 함)
        int[] sortedArray = {10, 30, 50, 70, 90};
        int index = Arrays.binarySearch(sortedArray, 50);
        System.out.println("Index of 5: " + index); // 출력: 2

    }

}