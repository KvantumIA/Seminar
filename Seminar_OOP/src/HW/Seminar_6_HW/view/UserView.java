package HW.Seminar_6_HW.view;

import HW.Seminar_6_HW.data.User;

import java.util.List;

public interface UserView<T extends User>{           //интерфейс UserView наследуется от класса User
    void sendOnConsole(List<T> list);
}
