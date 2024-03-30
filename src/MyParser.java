import java.io.*;

public class MyParser {
    /**
     * Метод парсит текст с файла в массив, делит слова по пробелам между ними, не зависимо от к-ства пробелов.
     *
     * @param file_name Принимает путь к файлу
     * @return возвращает массив слов
     * @throws IOException в слочае выброса исключения пир работе сс файлом
     */
    public String[] pars(String file_name) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();

        try (BufferedReader br = new BufferedReader(new FileReader(file_name))) {
            String line;

            while ((line = br.readLine()) != null) {
                stringBuilder.append(line);
                stringBuilder.append('\n');

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        String result = stringBuilder.toString();
        return result.split("\\s+");
    }
}

