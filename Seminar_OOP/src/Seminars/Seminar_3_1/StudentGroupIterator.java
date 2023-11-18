package Seminars.Seminar_3_1;

import java.util.Iterator;
import java.util.List;

public class StudentGroupIterator implements Iterator<Student> {
    private final List<Student> studentList;
    private int counter;
    public StudentGroupIterator(StudentGroup studentGroup){
        this.studentList = studentGroup.getstudentList();
        counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < studentList.size();
    }

    @Override
    public Student next() {
        if (!hasNext())
            return null;
        if (studentList.get(counter).getStudentId() == 10){
            counter++;
            return next();
        }
        return studentList.get(counter++);
    }
    public void remove(){
        studentList.remove(--counter);
    }
}
