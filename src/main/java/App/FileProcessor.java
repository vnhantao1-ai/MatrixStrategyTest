package App;

import java.nio.file.Path;
import java.nio.file.Paths;

public class FileProcessor {
    public String getFilePath() {
        // Sử dụng Paths.get để tự động thêm dấu phân cách đúng theo OS
        Path path = Paths.get("data", "config.txt");
        return path.toString();
    }
}
