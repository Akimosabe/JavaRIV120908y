package lr10.Example2.Json;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

public class Del {
    public void deleteMovie(String movie) {
        try {
            JSONParser jsonParser = new JSONParser();
            Object object = jsonParser.parse(new FileReader("src/lr10/Example2/Json/Json.json"));
            JSONObject jsonObject = (JSONObject) object;
            Object movies = jsonObject.get("movies");

            JSONArray jsonArray = (JSONArray) movies;
            Iterator<Object> iterator = jsonArray.iterator();
            boolean isFind = false;
            while (iterator.hasNext()) {
                JSONObject film = (JSONObject) iterator.next();
                if (film.get("title").equals(movie)) {
                    iterator.remove();
                    isFind = true;
                    break;
                }
            }

            if (!isFind) {
                System.err.println("Error");
            }

            if (isFind) {
                jsonObject.put("movies", jsonArray);
                FileWriter fileWriter = new FileWriter("src/lr10/Example2/Json/Json.json");
                fileWriter.write(jsonObject.toString());
                fileWriter.flush();
                fileWriter.close();

                System.out.println("Фильм " + movie + " удален");
            }
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }
}