package org.hechao.os;

import lombok.Data;

/**
 * @author 31749
 */
@Data
public class FileSystem {

    private Directory root;

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

    }


    public void executeCommand(String input) {
    }

    public void printCommandHelp(String substring) {
    }

    public void printHelp() {
    }
}
