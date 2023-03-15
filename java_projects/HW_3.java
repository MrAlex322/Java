//Создать файл с названием file.txt. Если файл уже есть, то создавать не надо Записать в него Слово "TEXT" 100 раз

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class HW_3 {
    public void writing() {
        try {
            File statText = new File("C:/Users/danil/OneDrive/Рабочий стол/Java/file.txt");
            FileOutputStream is = new FileOutputStream(statText);
            OutputStreamWriter osw = new OutputStreamWriter(is);    
            Writer w = new BufferedWriter(osw);
            String text = "TEXT";
            text =  text.repeat(100);
            w.write(text);
            w.close();
        } catch (IOException e) {
            System.err.println("Error");
        }
    }
    public static void main(String[]args) {
        HW_3 write = new HW_3();
        write.writing();
    }
}