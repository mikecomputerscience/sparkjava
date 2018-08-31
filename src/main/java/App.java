import static spark.Spark.get;

public class App {
    public static void main(String[] args) {
        get("/", (req, res) -> "index page");
        get("/hello", (req, res) -> "Hello World");
    }
}