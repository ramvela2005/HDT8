package uvg.ed.gt;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.PriorityQueue;
import java.util.Scanner;

// Clase principal que ejecuta el programa
public class Main {
    public static void main(String[] args) {
        // Leer el archivo de pacientes
        PriorityQueue<Paciente> pacientes = leerPacientes("Pacientes.txt");

        // Atender a los pacientes en orden de prioridad
        while (!pacientes.isEmpty()) {
            Paciente paciente = pacientes.poll();
            System.out.println(paciente);
        }
    }

    // Método para leer los pacientes desde un archivo
    public static PriorityQueue<Paciente> leerPacientes(String nombreArchivo) {
        PriorityQueue<Paciente> pacientes = new PriorityQueue<>();
        try {
            File archivo = new File(nombreArchivo);
            Scanner scanner = new Scanner(archivo);
            while (scanner.hasNextLine()) {
                String[] datos = scanner.nextLine().split(",");
                if (datos.length == 3) {
                    Paciente paciente = new Paciente(datos[0].trim(), datos[1].trim(), datos[2].trim().charAt(0));
                    pacientes.add(paciente);
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado: " + nombreArchivo);
            e.printStackTrace();
        }
        return pacientes;
    }
}

