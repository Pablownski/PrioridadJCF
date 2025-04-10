package hospital;

/**
 * Clase que representa a un paciente con nombre, síntoma y código de prioridad.
 * Implementa Comparable para poder ser usada en PriorityQueue.
 */
public class Paciente implements Comparable<Paciente> {
    private String nombre;
    private String sintoma;
    private char prioridad;

    public Paciente(String nombre, String sintoma, char prioridad) {
        this.nombre = nombre;
        this.sintoma = sintoma;
        this.prioridad = prioridad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSintoma() {
        return sintoma;
    }

    public char getPrioridad() {
        return prioridad;
    }
/**
     * Método que compara dos pacientes por su prioridad.
     * @param otro Paciente a comparar.
     * @return Valor negativo si este paciente tiene mayor prioridad, cero si son iguales, y positivo si el otro paciente tiene mayor prioridad.
     */
    @Override
    public int compareTo(Paciente otro) {
        // La prioridad 'A' es más urgente que 'B', etc.
        return Character.compare(this.prioridad, otro.prioridad);
    }
/**
     * Método que devuelve una representación en cadena del paciente.
     * @return Cadena con el nombre, síntoma y prioridad del paciente.
     */
    @Override
    public String toString() {
        return nombre + ", " + sintoma + ", " + prioridad;
    }
}
