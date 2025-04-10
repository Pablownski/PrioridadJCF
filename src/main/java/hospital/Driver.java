package hospital;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.PriorityQueue;

/**
 * Programa que simula la atención de pacientes en una sala de emergencias usando PriorityQueue de Java.
 */
public class Driver {
    public static void main(String[] args) {
        PriorityQueue<Paciente> pacientes = new PriorityQueue<>();

        try (BufferedReader br = new BufferedReader(new FileReader("pacientes.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                if (partes.length == 3) {
                    String nombre = partes[0].trim();
                    String sintoma = partes[1].trim();
                    char prioridad = partes[2].trim().charAt(0);
                    pacientes.add(new Paciente(nombre, sintoma, prioridad));
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }

        System.out.println("Atendiendo pacientes en orden de prioridad:");
        while (!pacientes.isEmpty()) {
            System.out.println(pacientes.poll());
        }
    }
}

