package App;

import java.nio.file.Path;
import java.nio.file.Paths;

public class FileProcessor {
    public String getFilePath() {
        return java.nio.file.Paths.get("data", "config.txt").toString();
    }
}
