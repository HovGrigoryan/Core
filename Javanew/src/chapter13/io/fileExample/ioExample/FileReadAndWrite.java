package chapter13.io.fileExample.ioExample;

import java.io.*;

public class FileReadAndWrite {

    private static final String FILE_PATH = "E:\\Java\\src\\classwork\\corona05I04_IO\\fileExample\\ioExample\\file\\example.txt";

    public static void main(String[] args) throws IOException {

        write();
        read();

    }


    private static void write(){
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_PATH))){
            bw.write("HELLO JAVA \r\n");
            bw.write("Hello valoooooood.!!!!!!!!!!!!");
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    private static void read() {

        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {

            // print line by line
            String line = "";
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }


            // print symbol by symbol
//            int c;
//            while ((c = br.read()) != -1){
//                System.out.print((char) c);
//            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
