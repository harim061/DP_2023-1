package hw.ch10;

import java.util.Comparator;

public class ComparatorAscending implements Comparator<Student> {
    // <String>으로 주면 더 간단

    @Override
    // 오름차순으로 정렬되도록 반환값을 리턴해야함
    public int compare(Student a, Student b) {
        return a.height - b.height;

    }

}
