package hw.ch10;

public class Student implements Comparable<Student> {
    String name;
    String id;
    int height;

    Student(String name, String id, int height) {
        this.name = name;
        this.id = id;
        this.height = height;
    }

    @Override
    public int compareTo(Student o) {
        if (this.height < o.height) {
            return -1;
        } else if (this.height > o.height) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "(이름: " + name + ", 학번: " + id + ", 키: " + height + ")";
    }

}
