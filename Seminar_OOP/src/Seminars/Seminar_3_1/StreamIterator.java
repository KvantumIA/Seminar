package Seminars.Seminar_3_1;

import java.util.Iterator;
import java.util.List;

public class StreamIterator implements Iterator<StudentGroup> {
    private final List<StudentGroup> studyGroupsList;
    private int counter;

    public StreamIterator(List<StudentGroup> studyGroupsList, int counter) {
        this.studyGroupsList = studyGroupsList;
        this.counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < studyGroupsList.size();
    }

    @Override
    public StudentGroup next() {
        if (!hasNext()){
            return null;
        }
        return studyGroupsList.get(counter++);
    }
    public List<StudentGroup> getStudyGroupsList() {
        return studyGroupsList;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

}
