package com.kamiltalowski;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        // FileReader = read the contents of a file as a stream of characters. One by one.
        //              read() returns an int value which contains the byte value(0-255)
        //              when read() returns -1, there is no more data to be read

        try {
            FileReader reader = new FileReader("ASCIIart.txt");

            int data= reader.read();

            while(data!=-1){
                char intDatatoChar = (char)data;
                System.out.print(intDatatoChar/*or (char)data*/);
                data=reader.read();
                //reader.skip(1);
            }
            reader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
