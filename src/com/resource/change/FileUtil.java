package com.resource.change;

import java.io.File;
import java.io.FileInputStream;

public class FileUtil {
    public static byte[] readFile(String fileName) {
        File file = new File(fileName);
        byte[] bytes = new byte[(int) file.length()];
        try {
            FileInputStream inputStream = new FileInputStream(fileName);
            inputStream.read(bytes);
            inputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bytes;
    }
}
