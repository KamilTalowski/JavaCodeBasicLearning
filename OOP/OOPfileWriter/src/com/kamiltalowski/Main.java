package com.kamiltalowski;

import javax.imageio.IIOException;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("poem.txt");
            writer.write("Roses are red \nviolets are blue \nlets go \nthe end \n");
            writer.append("(A poem by Kamil)");
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
