package org.hechao.os;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        FileSystem fileSystem = FileSystem.getFileSystem();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            //初始化
            fileSystem.init();
            System.out.print(">");

            String input = scanner.nextLine();
            if ("exit".equals(input)) {
                break;
            } else if (input.startsWith("help")) {
                if ("help".equals(input)) {
                    fileSystem.printHelp();
                } else {
                    fileSystem.printCommandHelp(input.substring(5));
                }
            } else {
                fileSystem.executeCommand(input);
            }
        }
        scanner.close();
    }
}
