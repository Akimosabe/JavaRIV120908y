package lr10.Example2.Json;

public class Main {
    public static void main(String[] args) {
        Json jsonCreate = new Json();
        jsonCreate.jsonCreate();

        Add jsonAddNewMovie = new Add();
        jsonAddNewMovie.jsonAddNewMovie("Ford против Ferrari", "8.2", "2019");

        Search searchMoviesJson = new Search();
        searchMoviesJson.searchMoviesForName("Джентельмены");
        searchMoviesJson.searchMoviesForYear("2019");



    }
}