//Дан список ArrayList<String>. Удалить из него все строки, которые являются числами Пример: ArrayList<String> 
//list = new ArrayList<>(List.of("string", "s", "5", "10", "-12", "my_value")); ["string", "s", "my_value"]
import java.util.ArrayList;
import java.util.List;

public class HW_5 {
    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>(List.of("string", "s", "5", "10", "-12", "my_value"));
        System.out.println(stringList);
        System.out.println(replacenum(stringList));
    }

    private static ArrayList<String> replacenum(ArrayList<String> stringArrayList) {
        ArrayList<String> newString = new ArrayList<>();
        for (String s : stringArrayList) {
            if (isNumber(s) == false) {
                newString.add(s);
            }
        }
        return newString;
    }


    public static boolean isNumber(String str) {
        try {
            Integer.parseInt(str);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}