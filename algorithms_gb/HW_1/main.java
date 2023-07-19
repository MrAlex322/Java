package algorithms_gb.HW_1;

// Урок 2. Структуры данных. Массивы. Алгоритмы массивов.
// Реализовать алгоритм пирамидальной сортировки (сортировка кучей).
import java.util.Arrays;

class Main {
    private static int LEFT(int i) {
        return (2 * i + 1);
    }

    private static int RIGHT(int i) {
        return (2 * i + 2);
    }

    private static void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    // Рекурсивный алгоритм heapify-down. Узел с индексом i и два его прямых потомка
    // нарушают свойство кучи
    private static void heapify(int[] A, int i, int size) {

        int left = LEFT(i);
        int right = RIGHT(i);

        int largest = i;

        if (left < size && A[left] > A[i]) {
            largest = left;
        }

        if (right < size && A[right] > A[largest]) {
            largest = right;
        }

        if (largest != i) {
            swap(A, i, largest);
            heapify(A, largest, size);
        }
    }

    public static int pop(int[] A, int size) {
        if (size <= 0) {
            return -1;
        }

        int top = A[0];

        A[0] = A[size - 1];

        heapify(A, 0, size - 1);

        return top;
    }

    // Функция для выполнения пирамидальной сортировки массива `A` размера `n`
    public static void heapsort(int[] A) {

        int n = A.length;

        int i = (n - 2) / 2;
        while (i >= 0) {
            heapify(A, i--, n);
        }

        while (n > 0) {
            A[n - 1] = pop(A, n);
            n--;
        }
    }

    public static void main(String[] args) {
        int[] A = { 14, 9, 2, 25, 91, -23 };

        heapsort(A);

        System.out.println(Arrays.toString(A));
    }
}