package practice19;

import java.util.Comparator;

public class SortByName implements Comparator<Student> {
    @Override
    public int compare(Student first, Student second) {
        return first.getFullName().compareToIgnoreCase(second.getFullName());
    }
}
