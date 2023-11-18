package Seminars.Seminar_4.task_1.controller;

import Seminars.Seminar_4.task_1.data.User;

import java.time.LocalDate;

public interface UserController<T extends User>{
    void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth);
}
