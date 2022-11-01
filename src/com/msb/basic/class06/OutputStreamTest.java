package com.msb.basic.class06;

import java.io.*;

public class OutputStreamTest {
    public static void main(String[] args) {
        File file = new File("aaa.txt");
        OutputStream fos = null;
        try {
            fos = new FileOutputStream(file);
            fos.write(99);
            fos.write("mashibing".getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
