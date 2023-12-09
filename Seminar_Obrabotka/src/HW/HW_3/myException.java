package HW.HW_3;

public class myException {
}

class InCorrectFIO extends RuntimeException {
    public InCorrectFIO() {
        super("Вы не ввели фамилию, имя или отчество.");
    }
}

class InCorrectBirthdate extends RuntimeException {
    public InCorrectBirthdate() {
        super("Вы неправильно ввели дату рождения.");
    }
}

class InCorrectPhoneNumber extends RuntimeException {
    public InCorrectPhoneNumber() {
        super("Вы неправильно ввели номер телефона.");
    }
}

class InCorrectGender extends RuntimeException {
    public InCorrectGender() {
        super("Вы неправильно ввели свой пол.");
    }
}