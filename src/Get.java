import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Get {
    public static void main(String[] args) {
        Path ignore =  Paths.get(".gitignore");
        System.out.println(Files.exists(ignore));
    }
}
