package practice19;

import java.util.Arrays;
import java.util.Comparator;

public class StudentManager {
    private Student[] students;
    private int count;

    public StudentManager(int capacity) {
        students = new Student[capacity];
        count = 0;
    }

    public void add(Student student) {
        if (count < students.length) {
            students[count] = student;
            count++;
        }
    }

    public void printAll() {
        if (count == 0) {
            System.out.println("Список студентов пуст.");
            return;
        }
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + students[i]);
        }
    }

    public void sort(Comparator<Student> comparator) {
        Arrays.sort(students, 0, count, comparator);
    }

    public Student findByName(String fullName) throws NoSuchStudentException {
        for (int i = 0; i < count; i++) {
            if (students[i].getFullName().equalsIgnoreCase(fullName)) {
                return students[i];
            }
        }
        throw new NoSuchStudentException("Студент с ФИО \"" + fullName + "\" не найден");
    }
}
