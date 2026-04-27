package App;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void testFilePathCrossPlatform() {
        FileProcessor processor = new FileProcessor();
        String path = processor.getFilePath();

        // Kiểm tra xem đường dẫn có chứa dấu phân cách chuẩn của hệ thống đang chạy không
        // File.separator sẽ là \ trên Windows và / trên Linux
        assertTrue(path.contains(File.separator));
        System.out.println("Path running on this OS: " + path);
    }
}
