package Seminars.Seminar_1.task_1;
import java.util.ArrayList;
import java.util.List;

public interface VendingMachine {
    Product getProduct(String name);

    Product getProduct(String name, double volume);
}