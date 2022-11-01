package com.msb.basic.class06;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputStreamTest {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("StreamTest.java");
            int read = 0;

            // 每次只能读取一个字节
            while((read = fis.read()) != -1)
                System.out.println((char)read);

            // 添加缓冲区
            byte[] buffer = new byte[1024];
            int length = 0;
            while((length = fis.read(buffer)) != -1)
                System.out.println(new String(buffer, 0, length));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
