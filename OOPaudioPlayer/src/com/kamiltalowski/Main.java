package com.kamiltalowski;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        File file = new File("How's It Supposed to Feel (Instrumental) - NEFFEX.wav");
        Scanner scanner = new Scanner(System.in);
        try {
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            long songMarker=0;

            String response = "";

            while (!response.equals("Q")){
                System.out.println("P= Play, S= Stop, R= Reset, Q= Quit, F to forward 10s, B to back 10s");
                System.out.print("Enter your choice: ");
                response = scanner.next();
                response = response.toUpperCase();
                songMarker=clip.getMicrosecondPosition();
                //System.out.println(clip.getMicrosecondPosition()/1000000+"s");

                switch (response){
                    case("P"): clip.start();
                        break;
                    case("S"): clip.stop();
                        break;
                    case("R"): clip.setMicrosecondPosition(0);
                        break;
                    case("F"): songMarker+=10000000; clip.setMicrosecondPosition(songMarker);
                        System.out.println(clip.getMicrosecondPosition()/1000000+"s");
                        break;
                    case("B"): songMarker-=10000000; clip.setMicrosecondPosition(songMarker);
                        System.out.println(clip.getMicrosecondPosition()/1000000+"s");
                        break;
                    case("Q"): clip.close();
                        System.out.println("goodbye");
                        break;
                    default: System.out.println("not valid response");
                }
                if(songMarker<0) songMarker=0;
                if(songMarker>=clip.getMicrosecondLength()) {
                    clip.stop();
                    System.out.println("Song Ended Reset (R) and then play (P) it if u want to hear it again");
                }
            }

        } catch (UnsupportedAudioFileException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (LineUnavailableException e) {
            e.printStackTrace();
        }


    }
}
