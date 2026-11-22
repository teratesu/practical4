package practice19;

public class Student implements Comparable<Student> {
    private String fullName;
    private String group;
    private double averageMark;

    public Student(String fullName, String group, double averageMark) {
        this.fullName = fullName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public String getFullName() {
        return fullName;
    }

    public String getGroup() {
        return group;
    }

    public double getAverageMark() {
        return averageMark;
    }

    @Override
    public int compareTo(Student other) {
        return Double.compare(other.averageMark, averageMark);
    }

    @Override
    public String toString() {
        return fullName + " (" + group + ", средний балл " + averageMark + ")";
    }
}
