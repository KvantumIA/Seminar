// Метод для быстрой сортировки

public static void quickSort(int[] arr, int low, int high) {
    if (low < high) {
        int pivotIndex = partition(arr, low, high);
        quickSort(arr, low, pivotIndex - 1);
        quickSort(arr, pivotIndex + 1, high);
    }
}

//---------------------------------------------------------------------

// Метод для разделения массива и выбора опорного элемента (пивота)

public static int partition(int[] arr, int low, int high) {
    int pivot = arr[high];
    int i = low - 1;

    for (int j = low; j < high; j++) {
        if (arr[j] < pivot) {
            i++;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    int temp = arr[i + 1];
    arr[i + 1] = arr[high];
    arr[high] = temp;

    return i + 1;
}

//---------------------------------------------------------------------

public class QuickSort {

    /**
    * Метод для быстрой сортировки массива.
    * @param array Массив, который нужно отсортировать.
    * @param low Начальный индекс.
    * @param high Конечный индекс.
    */
    public static void sort(int[] array, int low, int high) {
        if (low < high) {
            // Находим индекс опорного элемента.
            int pivot = partition(array, low, high);

            // Рекурсивно сортируем элементы перед и после опорного.
            sort(array, low, pivot - 1);
            sort(array, pivot + 1, high);
        }
    }

//---------------------------------------------------------------------
    
    /**
    * Метод для разделения массива относительно опорного элемента.
    * Элементы меньше опорного располагаются слева, больше - справа.
    * @param array Массив для разделения.
    * @param low Начальный индекс.
    * @param high Конечный индекс.
    * @return индекс опорного элемента.
    */
    private static int partition(int[] array, int low, int high) {
        int pivot = array[high]; // Опорный элемент
        int i = (low - 1); // Индекс меньшего элемента
        for (int j = low; j < high; j++) {
            // Если текущий элемент меньше или равен опорному
            if (array[j] <= pivot) {
                i++;

                // Обмен array[i] и array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        // Обмен array[i + 1] и array[high] (или опорным)
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
    }
}