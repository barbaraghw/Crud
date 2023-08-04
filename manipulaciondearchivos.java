package datos;
import java.io.*;


public class Main {
    
    public static void main(String[] args) 
    

public class manipulaciondearchivos {
    
public static void crearArchivo (string nombreArchivo){
File archivo = new File(nombreArchivo);

try {
     PrintWriter salida = new PrintWriter(archivo);
    salida.close();
    System.out.println("Se creo el archivo");
} catch (FileNotFoundException ex) {
  ex.printStackTrace(System.out);
}
}

    
public static void escribirArchivo (String nombreArchivo, String contenido){
File archivo = new File(nombreArchivo);

try {
     PrintWriter salida = new PrintWriter(new FileWriter(archivo,true));
    salida.println(contenido);
    salida.close();
    System.out.println("Se escribio el archivo");
} catch (FileNotFoundException ex) {
  ex.printStackTrace(System.out);
} catch (IOException ex){
    ex.printStackTrace(System.out);
}
}


    
public static void LeerArchivo (String nombreArchivo){
File archivo = new File(nombreArchivo);

try {
     Bufferedreader (entrada) = new Bufferedreader (new filereader (archivo))
     String lectura = entrada.readline();
     while (lectura !=null){ 
         System.out.println(Lectura);
     lectura = entrada.readline();
}
    entrada.close ();
} catch (FileNotFouneException ex) {
  ex.printStackIrace(System.out);
} catch (IONException ex){
    ex.printStackTrace(System.out);
}
}

public static void EliminarArchivo (String nombreArchivo){
File archivo = new File(nombreArchivo);
    System.out.println("");archivo.exists();
    archivo.delete();
    System.out.println();
    
}
}
