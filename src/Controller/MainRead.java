package Controller;

import Model.Person;
import View.PersonNativeFileReader;

import java.io.File;
import java.io.IOException;

public class MainRead {

    public static void main(String[] args) throws IOException,ClassNotFoundException {
        Person person = new PersonNativeFileReader(new File("Miguel.bin")).read();
        System.out.println(person.getName());
    }
}
