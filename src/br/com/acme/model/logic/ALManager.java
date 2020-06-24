package br.com.acme.model.logic;

import br.com.acme.model.AcademicLibrary;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ALManager implements Serializable{

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
        try{
        FileInputStream fin = new FileInputStream("c:\\library.exe");
        ObjectInputStream ois = new ObjectInputStream(fin);
        library = (AcademicLibrary)ois.readObject();
        ois.close();
            System.out.println(library);
        }catch(FileNotFoundException ex){
            System.out.println("Não foi encontrado arquivo!!");
        }
        
}
        

    /**
     * Implemente o código deste método de forma que o objeto 'library' seja
     * persistido em um arquivo no disco rígido.
     */
    public static void persistLibrary(File file) throws FileNotFoundException, IOException {
        try{
        FileOutputStream fout = new FileOutputStream("c:\\library.exe");
        ObjectOutputStream oos = new ObjectOutputStream(fout);
        oos.writeObject(library);
        oos.close();
        System.out.println("👍");
        }catch(IOException ex){
            System.out.println();
        }

    }
    
}
