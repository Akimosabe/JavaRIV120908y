package lr8.Example2_3;
import java.io.*;

public class Example2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        BufferedWriter bw = null;

        try { // Создание потоков для чтения и записи с нужной кодировкой
            br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream("D:\\MyFile1.txt"),"cp1251"));
            bw = new BufferedWriter(
                    new OutputStreamWriter(
                            new FileOutputStream("D:\\MyFile2.txt"),"cp1251")); // Переписывание информации из одного файла в другой
            int lineCount = 0; // счетчик строк
            String s;
            br.readLine(); // пропуск первой строки
            while ((s = br.readLine()) != null) {
                lineCount++;
                String[] parts = s.split(" "); // разбиваем строку на отдельные части
                for (String part : parts) {
                    try {
                        double num = Double.parseDouble(part);
                        if (num > 0) { // записываем только положительные числа
                            bw.write(part + " ");
                        }
                    } catch (NumberFormatException e) { // если не число, просто записываем строку как есть
                        bw.write(part + " ");
                    }
                }
                bw.newLine(); // принудительный переход на новую строку
            }
        } catch (IOException e) {
            System.out.println("Ошибка!!!!!!!!");
        }
        finally{
            br.close();
            bw.flush();
            bw.close();
        }
    }
}