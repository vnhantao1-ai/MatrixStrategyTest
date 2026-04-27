package App;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void testFilePath() {
        FileProcessor processor = new FileProcessor();

        assertTrue(processor.getFilePath().contains("\\"));
    }
}
