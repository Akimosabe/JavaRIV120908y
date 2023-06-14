package lr10.Example2.XML;
import org.xml.sax.SAXException;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException {
        XML xmlCreate = new XML();
        xmlCreate.xmlCreate();

        Add xmlAddMovie = new Add();
        xmlAddMovie.getNewMovie("Ford против Ferrari", "8.2", "2019");

        Search searchMovies = new Search();
        searchMovies.searchForName("Джентельмены");
        searchMovies.searchForYear("2019");


    }
}