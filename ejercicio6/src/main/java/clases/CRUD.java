package clases;

import java.io.*;

import java.nio.file.Files;
import java.nio.file.Path;

import java.util.*;

public class CRUD {
    public String file;

    public CRUD(String archivo) throws IOException {
        this.file = archivo;
    }

    public String search(String name) throws IOException {
        String linea;
        BufferedReader br = new BufferedReader(new FileReader(this.file));
        while((linea = br.readLine()) != null){
            if (linea.contains("Nombre: " + name+",")) {
                return linea;
            }
        }
        return null;
    }

    public void create(String nombre, String genero, String artista, int duracion) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(this.file,true));
        // Scanner input = new Scanner(System.in);
        // System.out.println("El documento del contacto no podrá ser editado luego ");
        // String doc = Doc();
        // String repertorio = Repertorio(doc);
        // if(repertorio != null){
        //     System.out.println("Se encontro un contacto con el documento:  "+doc);
        //     Exis(repertorio);
        //     return;
        // }
        // System.out.println("Digite el nombre: ");
        // String nom = input.nextLine().strip();
        // System.out.println("Digite el apellido: ");
        // String ape = input.nextLine().strip();
        bw.write(new Canciones(nombre,genero,artista,duracion).toString());
        bw.newLine();
        bw.close();
    }

    public void delete(String name) throws IOException {
        String cancion = this.search(name);
        editFile(cancion,"");
    }

    public void edit(String old_name, String nombre, String genero, String artista, int duracion) throws IOException {
        String repertorio = this.search(old_name);
        String cambio = new Canciones(nombre, genero, artista, duracion).toString();
        editFile(repertorio,cambio);
    }

    public void editFile(String registro, String cambio) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(this.file));
        StringBuilder antiguo = new StringBuilder();
        String linea = br.readLine();
        while (linea != null) {
            antiguo.append(linea).append(System.lineSeparator());
            linea = br.readLine();
        }
        String content = antiguo.toString();
        String nuevo = content.replaceAll(registro,cambio);
        try (FileWriter writer = new FileWriter(this.file)) {
            writer.write(nuevo);
        }
    }

    public Canciones read(String name) throws IOException {
        String cancion = this.search(name);
        String[] datos = cancion.split(",?\\s*[\\wáéíóú]+:\\s");
        System.out.println("Datos:");
        for (int i=0; i<datos.length; i++) {
            System.out.println("- "+String.valueOf(datos[i]));
        }
        return new Canciones(datos[1], datos[2], datos[3], Integer.parseInt(datos[4]));
    }
}
