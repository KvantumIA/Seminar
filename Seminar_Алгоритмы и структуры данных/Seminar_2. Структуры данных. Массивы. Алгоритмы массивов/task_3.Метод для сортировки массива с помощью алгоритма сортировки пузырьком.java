public class BubbleSort {

    /**
    * Метод для сортировки массива с помощью алгоритма сортировки пузырьком.
    * @param array Массив, который нужно отсортировать.
    */
    public static void sort(int[] array) {
    int n = array.length;                       // Длина массива
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            // Сравниваем соседние элементы.
            if (array[j] > array[j + 1]) {
                // Если текущий элемент больше следующего, меняем их местами.
                int temp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = temp;
                }
            }
        }
    }
}