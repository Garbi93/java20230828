package ch12api.lecture;

import java.util.Arrays;

public class C24arrays {
    public static void main(String[] args) {
        // Arrays : 배열을 다루는 메소드들 있음
        // equals : 두 배열이 같은지
        // fill : 배열을 특정 값으로 채우기
        // sort : 배열 정렬
        // binarySearch : 특정 원소의 위치 찾기
        // toString : 문자열로 변환

        int[] arr1 = new int[5];
        System.out.println(arr1);
        System.out.println(Arrays.toString(arr1));  // 배열의 내용을 보고싶을 때

        Arrays.fill(arr1, 5);
        System.out.println(Arrays.toString(arr1));

        // sort
        int[] arr2 = {3, -2, 10, 0, -1};
        System.out.println(Arrays.toString(arr2));
        Arrays.sort(arr2);  // 배열내 인덱스를 작은순서부터 정렬한다.
        System.out.println(Arrays.toString(arr2));

        // equals
        int[] arr3 = {3,4,5};
        int[] arr4 = {3,4,5};
        int[] arr5 = {4,3,5};

        System.out.println(arr3 == arr4); // false  주소값을 비교
        System.out.println(Arrays.equals(arr3,arr4));  // true 안의 값을 비교
        System.out.println(Arrays.equals(arr4,arr5));  // false 안의 값을 비교

        Arrays.sort(arr4);
        Arrays.sort(arr5);
        System.out.println(Arrays.equals(arr4,arr5));   // 정렬후 안의 값을 비교 하므로 true

        // binarySearch : 이진 탐색
        // 배열이 이미 정렬되어 있다는 전제하에 중간에서 부터 크면 오른쪽 작으면 왼쪽에서 값을 찾는식으로
        // 빠르게 답을 구할 수 있는 방식
        int[] arr6 = {5,3,1,7,9};
        int i = Arrays.binarySearch(arr6,3);    // 정렬 안된 것을 탐색해서 음수 전달
        System.out.println(i);

        Arrays.sort(arr6); // 1,3,5,7,9 로 정렬되므로
        int i1 = Arrays.binarySearch(arr6, 3);  // 1을 전달
        System.out.println(i1);

    }
}
