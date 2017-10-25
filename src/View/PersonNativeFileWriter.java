package View;

import Model.Person;

import java.io.*;

public class PersonNativeFileWriter {
    private final File file;

    public PersonNativeFileWriter(File file) {
        this.file = file;
    }

    public void write(Person person) throws IOException {
        try(FileOutputStream os = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(os)){
            oos.writeObject(person); //Pasa la instancia del objeto pasado a binario
        }
        /**oos.writeObject(person); //Pasa la instancia del objeto pasado a binario
        os.flush(); //Vacía el stream
        oos.close();
        os.close();
        Esto lo que hace es que el try permite gestionar de forma automatica los close y flush.
         **/
    }
}
