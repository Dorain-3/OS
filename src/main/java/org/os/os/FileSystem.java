package org.os.os;

import lombok.Data;
import org.os.os.entity.Directory;
import org.os.os.util.PermissionManager;
import org.os.os.util.PrintUtil;

/**
 * @author 31749
 */
@Data
public class FileSystem {

    private CommandParser parser;

    private static FileSystem fileSystem;

    private FileSystem() {
    }

    public static FileSystem getFileSystem() {
        if (fileSystem == null) {
            fileSystem = new FileSystem();
        }
        return fileSystem;
    }

    public void init(){
        System.out.println("(base) home>输入help获取帮助");
        PrintUtil.print("请登录");
    }


    public void executeCommand(String input) {
    }

    public void printCommandHelp(String substring) {
    }

    public void printHelp() {
    }
}
