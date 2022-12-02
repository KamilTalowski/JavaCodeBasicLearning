package com.kamiltalowski;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {


        User user = null;

        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Kamil\\Desktop\\JavaProjects\\Serialization\\UserInfo.ser");
        ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);

        user = (User) inputStream.readObject();
        inputStream.close();
        fileInputStream.close();

        System.out.println(user.name);
        System.out.println(user.password);
        user.sayHello();

        long serialVersionUID = ObjectStreamClass.lookup(user.getClass()).getSerialVersionUID();
        System.out.println(serialVersionUID);


    }
}
