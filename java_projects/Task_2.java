import java.util.Arrays;

public class Task_2 {
    public static void main(String[] args) {
        /**
         * Дан массив = [3,2,2,3] и число val =3
         * Если в массиве есть числа,  равные заданному, нужно перенести эти элементы в конец массива.
         * Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного 
         * а остальные - равны ему.
         */

         int[] array = {3,2,3,4,3,5,2,3,1,3,2,};
         int val = 3;

         swap(array, val);

            System.out.println(Arrays.toString(array));
         
    }

    static void swap( int[] array, int val){
        int size = array.length;
        int shift = 1;
        for (int i = 0; i < size - shift; i++){
            while (array[size-shift] == val){
                shift++;
            }

            if (array[i] == val){
                int tmp = array[i];
                array[i] = array[size - shift];
                array[size - shift] = tmp;
                shift++;
            }
        }


    }
}
