
import java.io.IOException;

public class App {
    public void start(String file_path) {
        MyParser parser= new MyParser();
       Counter counter= new Counter();
        String[]arrFruits;
        try {
             arrFruits=parser.pars(file_path);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(counter.countWords(arrFruits));
        System.out.println(counter.mapWords(arrFruits));
        System.out.println(counter.longerWord(counter.mapWords(arrFruits)));

    }
}
