package Seminars.Seminar_3_1;

import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudentGroup> {
    private List<StudentGroup> studyGroupList;

    public List<StudentGroup> getStudyGroupList() {
        return studyGroupList;
    }

    public void setStudyGroupList(List<StudentGroup> studyGroupList) {
        this.studyGroupList = studyGroupList;
    }

    public Stream(List<StudentGroup> studyGroupList) {
        this.studyGroupList = studyGroupList;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return studyGroupList.iterator();
    }

    @Override
    public String toString() {
        return "Stream{\n"
                 +"studyGroupList= \n" + studyGroupList +
                '}';
    }
}
