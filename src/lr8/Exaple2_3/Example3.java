package lr8.Exaple2_3;
import java.io.*;

public class Example3 {
        public static void main(String[] args) throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("D:\\L.Demon.txt"), "UTF-8"));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("D:\\L.Demon_v2.txt"), "UTF-8"));

            String line;
            int lineNumber = 1;
            while ((line = reader.readLine()) != null)
            {
                if (line.isEmpty()) continue;

                String[] words = line.split(" ");
                int count = 0;
                for (String word : words) {
                    if (mainWord(word)) { // проверяем согласные буквы
                        writer.write(word + " ");
                        count++;
                    }
                }

                // записываем номер строки и количество выбранных слов
                writer.write("(№ строки: " + lineNumber + ", количество слов: " + count + ")");
                writer.newLine();
                lineNumber++;
            }

            // закрываем файлы
            reader.close();
            writer.close();
        }
        private static boolean mainWord(String word) {
            // согласные буквы
            String consonants = "бвгджзклмнпрстфхцчшщБВГДЖЗКЛМНПРСТФХЦЧШЩ";
            return consonants.indexOf(word.charAt(0)) != -1;
        }
}
