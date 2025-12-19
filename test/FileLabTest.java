import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileLabTest {

    // Helper: create a temp file with content
    private File createTempFile(String name, String data) throws IOException {
        File temp = File.createTempFile(name, ".tmp");
        FileWriter fw = new FileWriter(temp);
        fw.write(data);
        fw.close();
        temp.deleteOnExit();
        return temp;
    }

    // -----------------------------
    // fileExists(File f)
    // -----------------------------
    @Test
    public void testFileExists_True() throws IOException {
        File temp = createTempFile("existsTest", "hello");
        assertTrue(FileLab.fileExists(temp));
    }

    // -----------------------------
    // fileIsReadable(File f)
    // -----------------------------
    @Test
    public void testFileIsReadable_True() throws IOException {
        File temp = createTempFile("readTest", "abc");
        assertTrue(FileLab.fileIsReadable(temp));
    }

    // -----------------------------
    // fileSize(File f)
    // -----------------------------
    @Test
    public void testFileSize_Correct() throws IOException {
        File temp = createTempFile("sizeTest", "123456"); // 6 bytes
        assertEquals(6, FileLab.fileSize(temp));
    }

    // -----------------------------
    // fileName(File f)
    // -----------------------------
    @Test
    public void testFileName_ExistingFile() throws IOException {
        File temp = createTempFile("nameTest", "text");
        assertEquals(temp.getName(), FileLab.fileName(temp));
    }

    // -----------------------------
    // deleteFile(File f)
    // -----------------------------
    @Test
    public void testDeleteFile() throws IOException {
        File temp = createTempFile("deleteTest", "data");
        assertTrue(temp.exists());

        assertTrue(FileLab.deleteFile(temp));
        assertFalse(temp.exists());
    }

    // -----------------------------
    // renameFile(File source, File target)
    // -----------------------------
    @Test
    public void testRenameFile() throws IOException {
        File source = createTempFile("renameSource", "abc");

        File target = new File(source.getParent(), "renamed_output.tmp");
        if (target.exists()) target.delete();

        boolean success = FileLab.renameFile(source, target);
        assertTrue(success);

        assertFalse(source.exists());
        assertTrue(target.exists());

        target.deleteOnExit();
    }
}
