package hw.ch10;

import java.util.Comparator;

public class ComparatorDesending implements Comparator<Student> {

    public int compare(Student a, Student b) {

        return b.height - a.height;

    }

}
