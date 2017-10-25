package View;

import Model.Person;

import java.io.*;

public class PersonNativeFileReader {
    private final File file;

    public PersonNativeFileReader(File file) {
        this.file = file;
    }

    public Person read() throws IOException, ClassNotFoundException {
        FileInputStream is = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(is);
        Person person = (Person) ois.readObject();
        is.close();
        ois.close();
        return person;
    }
}
