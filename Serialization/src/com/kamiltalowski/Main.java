package com.kamiltalowski;


import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
	    // serialization = converting an object into a byte stream. Persists (saves the state) the object after program exits
        // This byte stream can be saved as a file or sent over a network. Can be sent to a different machine.
        //Byre stream can be saved as a file (*.ser) witch is platform independent
        // (Think of this as if you're saving a file with the object's information)

        // Deserialization = reverse process of converting byte stream back into an object.
        //( Think of this as if you're loading a saved file)

        // important notes
        // 1. Children classes of a parent class that implements Serializable will do so as well
        // 2. Static fields are not serialized (they belong to the class, not an individual object)
        // 3. the class's definition ("class file") itself is not recorded, cast it as the object type
        // 4. Fields declared as "transient" aren't serialized, they're ignored
        // 5. serialVersionUID is a unique of versionID

        //SerialVersionUID
        //SerialVersionUID is a unique ID that function like a version #, verifies that the sender and receiver
        // of a serialized object, have loaded classes for that object that match, ensures object will be compatible
        // between machines. Number must match, otherwise this will cause a InvalidClassException
        // A SerialVersionUID will be calculated based on class properties, members ect.
        // A serializable class can declare its own SerialVersionUID explicitly (recommended)

        User user = new User();

        user.name = "Kamil Code";
        user.password = "abracadabra123";

        FileOutputStream fileOutputStream = new FileOutputStream("UserInfo.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOutputStream);
        out.writeObject(user);
        out.close();

        System.out.println("object info saved");

        long serialVersionUID = ObjectStreamClass.lookup(user.getClass()).getSerialVersionUID();
        System.out.println(serialVersionUID);


    }
}
