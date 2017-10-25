package Controller;

import Model.Person;
import View.PersonNativeFileWriter;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) throws IOException {
        Person person = new Person("Miguel",LocalDate.of(1996,10,3));
        File file = new File("miguel.bin");
        PersonNativeFileWriter pnfw = new PersonNativeFileWriter(file);
        pnfw.write(person);
    }
}
