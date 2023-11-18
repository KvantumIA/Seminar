package HW.Seminar_6_HW.view;

import HW.Seminar_6_HW.data.Student;
import HW.Seminar_6_HW.data.StudentGroup;

import java.util.List;
import java.util.logging.Logger;

public class StudentView implements UserView<Student>{          //класс StudentView имплементирует интерфейс UserView

    Logger logger = Logger.getLogger(StudentView.class.getName());

    @Override
    public void sendOnConsole(List<Student> students) {          //переопределение метода
        for(Student user: students){
            logger.info(user.toString());
        }
    }

    public void sendOnConsoleUserGroup(StudentGroup studentGroup){
        logger.info(studentGroup.toString());
    }

}
