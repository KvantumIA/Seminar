package HW.Seminar_6_HW.service;

import java.time.LocalDate;
import java.util.List;

public interface UserService<T> {               //этот интерфейс добавляет список getAll и метод create, он соответствует ISP, т.к. содержит только необходимые методы
    List<T> getAll();
    void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth);
}
