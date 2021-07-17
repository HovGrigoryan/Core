package chapter13.io.fileExample.ioExample;

import java.io.*;

public class  DataIOStream {

    private static final String FILE_PATH = "E:\\Java\\src\\classwork\\corona05I04_IO\\fileExample\\ioExample\\file\\example.txt";

    public static void main(String[] args) throws IOException {

        write();
        read();

    }

    private static void write() throws IOException {
        DataOutputStream outputStream = new DataOutputStream(new FileOutputStream(FILE_PATH));
//        outputStream.writeInt(33);
//        outputStream.writeBoolean(false);
        outputStream.writeUTF("hello valod.");
        outputStream.close();
    }

    private static void read() throws IOException {
        DataInputStream inputStream = new DataInputStream(new FileInputStream(FILE_PATH));
//        System.out.println(inputStream.readInt());
//        System.out.println(inputStream.readBoolean());
        System.out.println(inputStream.readUTF());
        inputStream.close();
    }


}
