public class Task_1 {
    // Данн массив двоичных чисел, выdести  максимальное количество подряд идущих чисел 1.
    public static void main(String[] args) {
        int [] array = {1,1,0,1,1,1};

        int curr = 0;
        int best = 0;

        for (int i = 0; i < array.length; i++){
            int a = array[i];
            if (a == 1) {
                curr++;
            }else {
                if (curr > best){   
                    best = curr;
                }
                curr = 0;
             } 
        }
        if (curr > best){   
            best = curr;
        }
        System.out.println(best);
    }
    
}