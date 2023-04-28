package java_oop.HW_3;

import java.util.Comparator;

public class StudentComporator implements Comparator<Human> {
    public int compare(Human human, Human anotherHuman) {
        if (human instanceof Students && anotherHuman instanceof Students) {
            Students student = (Students) human;
            Students anotherStudent = (Students) anotherHuman;
            if (student.getAverage() > anotherStudent.getAverage())
                return -1;
            if (student.getAverage() < anotherStudent.getAverage())
                return 1;
            if (student.getLastName().length() > anotherStudent.getLastName().length())
                return -1;
            if (student.getLastName().length() < anotherStudent.getLastName().length())
                return 1;
        }
        return 0; 
    }
}