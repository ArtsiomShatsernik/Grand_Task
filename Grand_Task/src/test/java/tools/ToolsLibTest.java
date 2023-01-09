package tools;

import org.junit.*;

import java.nio.file.Path;

public class ToolsLibTest {

    @Test
    public void getFileNameWithoutPath() {
        String testName = "test.txt";
        Assert.assertEquals("test", ToolsLib.getFileName(testName));
    }
    @Test
    public void getFileNameWithPath() {
        String testName = "C:\\Users\\User\\AppData\\Local\\Temp\\tmp11562600244765466445\\test.txt";
        Assert.assertEquals("test", ToolsLib.getFileName(testName));
    }
    @Test
    public void formPathToTmpDirWithContainedPath() {
        String tmpDir = "C:\\Users\\User\\AppData\\Local\\Temp\\tmp11562600244765466445";
        String fileName = "C:\\Users\\User\\AppData\\Local\\Temp\\tmp11562600244765466445\\input.xml";
        Assert.assertEquals(fileName, ToolsLib.formPathToTmpDir(Path.of(tmpDir), fileName));
    }
    @Test
    public void formPathToTmpDirWithoutContainedPath() {
        String tmpDir = "C:\\Users\\User\\AppData\\Local\\Temp\\tmp11562600244765466445";
        String fileName = "input.xml";
        Assert.assertEquals(tmpDir + "\\" + fileName, ToolsLib.formPathToTmpDir(Path.of(tmpDir), fileName));
    }
}