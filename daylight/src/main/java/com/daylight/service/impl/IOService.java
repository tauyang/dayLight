package com.daylight.service.impl;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.*;
@RunWith(SpringJUnit4ClassRunner.class)
public class IOService {

    public static void main(String[] args){
        //useIOInputStream();
    }


    @Test
    public  void useIOInputStream(){
        //  InputStream 一个字节一个字节读取  然后一个字节 一个字节输出
        //  如果使用read 字节数组
        InputStream in = null;
        OutputStream out = null;
        try {
            in = new FileInputStream("src/test.txt");
            out = new FileOutputStream("src/test1.txt");
            byte[] a = new byte[2];
            while( in.read(a)!= -1){
                out.write(a);
            }
//            int read = in.read();
//            out.write(read);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                in.close();
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
