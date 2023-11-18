package Seminars.Seminar_5.task_1.service;

import java.util.ArrayList;
import java.util.List;
import Seminars.Seminar_5.task_1.model.Student;
import Seminars.Seminar_5.task_1.model.Teacher;
import Seminars.Seminar_5.task_1.model.User;
import Seminars.Seminar_5.task_1.model.Type;
public class DataService {
    private List<User> userList;

    public DataService() {
        this.userList = new ArrayList<>();
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    private int getFreeId(Type type) {
        int lastId = 1;
        boolean itsStudent = Type.STUDENT == type;
        for (User user : userList) {
            if (user instanceof Teacher && !itsStudent)
                lastId = ((Teacher) user).getTeacherId() + 1;
            if (user instanceof Student && itsStudent)
                lastId = ((Student) user).getStudentId() + 1;
        }
        return lastId;
    }

    public void create(String firstName, String secondName, String lastName, Type type) {
        int id = getFreeId(type);
        if (type == Type.STUDENT) {
            Student student = new Student(firstName, secondName, lastName, id);
            userList.add(student);
        }
        if (type == Type.TEACHER) {
            Teacher teacher = new Teacher(firstName, secondName, lastName, id);
            userList.add(teacher);
        }
    }

    public User getUserBuId(Type type, int id){
        boolean itsStudent = Type.STUDENT == type;
        for (User user : userList){
            if(user instanceof Teacher && ((Teacher) user).getTeacherId() == id)
                return user;
            if(user instanceof Student && ((Student) user).getStudentId() == id)
                return user;
        }
        return null;
    }
    public List<User> getAllStudent(){
        List<User> studentList = new ArrayList<>();
        for(User user : userList){
            if (user instanceof Student)
                studentList.add(user);
        }
        return studentList;
    }
    public List<User> getAllTeacher(){
        List<User> teacherList = new ArrayList<>();
        for(User user : userList){
            if (user instanceof Teacher)
                teacherList.add(user);
        }
        return teacherList;
    }
}
