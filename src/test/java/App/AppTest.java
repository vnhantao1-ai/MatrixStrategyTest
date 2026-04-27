package App;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.File;


class AppTest {
    @Test
    void testFilePathCrossPlatform() {
        FileProcessor processor = new FileProcessor();
        String path = processor.getFilePath();

        assertTrue(path.contains(File.separator));
        System.out.println("Path running on this OS: " + path);
    }
}
