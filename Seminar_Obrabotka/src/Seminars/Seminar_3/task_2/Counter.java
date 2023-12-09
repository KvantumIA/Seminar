package Seminars.Seminar_3.task_2;

import java.io.IOException;

public class Counter implements AutoCloseable {
    private Integer count = 0;

    public void add() throws IOException {
        isClose();
        count += 1;
    }

    @Override
    public void close(){
        count = null;
        System.out.println("метод закрыт");
    }

    public void isClose() throws IOException {
        if (count == null) {
            throw new IOException("Экземпляр закрыт");
        }
    }

    public Integer getCount() throws IOException {
        isClose();
        return count;
    }
}
