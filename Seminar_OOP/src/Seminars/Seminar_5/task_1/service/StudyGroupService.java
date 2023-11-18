package Seminars.Seminar_5.task_1.service;

import Seminars.Seminar_5.task_1.model.*;
import Seminars.Seminar_5.task_1.model.StudyGroup;
import java.util.List;

public class StudyGroupService {
    private StudyGroup studyGroup;

    public StudyGroup getStudyGroup() {
        return studyGroup;
    }

    public void setStudyGroup(StudyGroup studyGroup) {
        this.studyGroup = studyGroup;
    }

    @Override
    public String toString() {
        return "StudyGroupService{" +
                "studyGroup=" + studyGroup +
                '}';
    }

    public void create(Teacher teacher, List<Student> students) {
        this.studyGroup = new StudyGroup(teacher, students);
    }
}
