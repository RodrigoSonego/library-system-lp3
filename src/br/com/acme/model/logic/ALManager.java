package br.com.acme.model.logic;

import br.com.acme.model.AcademicLibrary;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ALManager {

    private static AcademicLibrary library;

    static {
        newLibrary();
    }

    public static AcademicLibrary getInstance() {
        return library;
    }

    public static void newLibrary() {
        library = new AcademicLibrary("RZF Pub", "Scientific publications", "21-03-2035");
    }

    /**
     * Implemente o código deste método de forma que seja possível ler um
     * arquivo no disco rígido onde tenha sido armazenado o objeto 'library'.
     */
    public static void loadLibrary(File file) throws FileNotFoundException, IOException, ClassNotFoundException {

    }

    /**
     * Implemente o código deste método de forma que o objeto 'library' seja
     * persistido em um arquivo no disco rígido.
     */
    public static void persistLibrary(File file) throws FileNotFoundException, IOException {

    }
    
}
