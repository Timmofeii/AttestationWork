import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Counter {
    /**
     * @param arrWord Принимает массив слов
     * @return Возвращает к-ство слов в этом массиве
     */
    public int countWords(String[] arrWord) {
        return arrWord.length;
    }
//    public Map<String, Integer> mapWords(String[] arrWords) {
//        return Arrays.stream(arrWords)
//                .map(String::toLowerCase)
//                .collect(Collectors.groupingBy(Function.identity(), Collectors.summingInt(e -> 1)));
//    }

    /**
     * Метод проходит по массиву и сверят по нижнему регистру наличее слова в HashMap, если этого слова нет,
     * записавает его в Мар и в значение записывает 1, если слово в Мар есть, меняет значение ключа на +1.
     *
     * @param arrWords Принимает массив слов
     * @return Возвращает Map<String,Integer> слово, сколько раз встречается.
     */
    public Map<String, Integer> mapWords(String[] arrWords) {
        Map<String, Integer> result = new HashMap<>();
        for (String word : arrWords) {
            word = word.toLowerCase();
            if (result.containsKey(word)) {
                int count = result.get(word);
                result.put(word, count + 1);
            } else {
                result.put(word, 1);
            }
        }
        return result;
    }


    /**
     * Метод проходит по ключам Мар в поисках слова с самым большим к-ством
     *
     * @param maps Принимает Мар
     * @return Возвращает самое длинное слово.
     */

    public String longerWord(Map<String, Integer> maps) {
        String result = "";

        for (String word : maps.keySet()) {
            if (word.length() > result.length()) {
                result = word;
            }
        }
        return result;
    }
}

