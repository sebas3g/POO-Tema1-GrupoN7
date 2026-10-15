/**
 * Clase Estudiante
 * Representa la información básica de un estudiante de la
 * Universidad Técnica de Ambato.
 *
 * Grupo 7 - POO Tema 1
 */
public class Estudiante {
 
    // Atributos de la clase
    String nombre;
    String apellido;
    int edad;
    String carrera;
    int semestre;
 
    // Método para mostrar la información del estudiante
    void mostrarInformacion() {
        System.out.println("Nombre   : " + nombre);
        System.out.println("Apellido : " + apellido);
        System.out.println("Edad     : " + edad + " años");
        System.out.println("Carrera  : " + carrera);
        System.out.println("Semestre : " + semestre);
        System.out.println("----------------------------------------");
    }
}
