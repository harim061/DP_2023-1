package ch10.Q4;

import java.util.Comparator;

public class ComparatorAscending implements Comparator<String> {
    // <String>으로 주면 더 간단

    @Override
    // 오름차순으로 정렬되도록 반환값을 리턴해야함
    public int compare(String a, String b) {
        // 반환값 : 양수, 음수, 0
        // 정렬 주체(list)는 양수가 리턴되면 a와 b의 위치를 바꾼다
        // 오름차순 : 작은 것이 앞에 옴
        // 큰 게 앞에 오면 양수를 리턴

        // return ((String) a).compareTo((String) b);

        return a.compareTo(b);

        // .이 우선순위가 가장 높음 -> compateTo 먼저 실행

        // a의 문자코드 - b의 문자코드
        // a가 큰 경우 양수 리턴, 작은 경우 음수 리턴 => a와 b의 위치를 바꾼다.

    }

}
