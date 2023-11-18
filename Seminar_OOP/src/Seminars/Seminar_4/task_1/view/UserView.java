package Seminars.Seminar_4.task_1.view;

import Seminars.Seminar_4.task_1.data.User;

import java.util.List;

public interface UserView<T extends User>{
    void sendOnConsole(List<T> list);
}
