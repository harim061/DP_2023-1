package hw.ch10;

import java.util.*;

class Main {
    public static void main(String[] args) {

        System.out.println("학번 : 20210985, 이름 : 노하림");
        List<Student> list = new ArrayList<>();

        list.add(new Student("최승훈", "12345678", 200));
        list.add(new Student("노하림", "20210985", 160));
        list.add(new Student("채형원", "20210115", 183));
        list.add(new Student("임창균", "20210126", 175));
        list.add(new Student("이민혁", "20211103", 177));

        list.sort(new ComparatorAscending());
        System.out.println("** (1) 정렬 결과 (오름차순)");
        System.out.println(list);
        list.sort(new ComparatorDesending());
        System.out.println("** (2) 정렬 결과 (내림차순)");
        System.out.println(list);
    }
}
