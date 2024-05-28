package Generics.Comparing;

public class Student implements Comparable<Student> {
    int rollNo;
    float marks;

    public Student(int rollNo, float marks) {
        this.rollNo = rollNo;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return marks + " -> " + rollNo;
    }

    @Override
    public int compareTo(Student other) {
        int diff = (int) (this.marks - other.marks);

        //If diff == 0: means both are equal
        // If diff < 0: means other is bigger else other is smaller
        return diff;
    }
}
