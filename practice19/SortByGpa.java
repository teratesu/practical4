package practice19;

import java.util.Comparator;

public class SortByGpa implements Comparator<Student> {
    @Override
    public int compare(Student first, Student second) {
        return Double.compare(second.getAverageMark(), first.getAverageMark());
    }
}
