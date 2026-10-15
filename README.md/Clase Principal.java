/**
 * Clase Principal
 * Contiene el método main donde se crean (instancian) tres objetos
 * de tipo Estudiante y se muestra su información.
 *
 * Grupo 7 - POO Tema 1
 */
public class Principal {
 
    public static void main(String[] args) {
 
        System.out.println("========================================");
        System.out.println("  SISTEMA ACADÉMICO - UTA");
        System.out.println("  Registro básico de estudiantes");
        System.out.println("========================================");
 
        // Instanciación del primer objeto
        Estudiante estudiante1 = new Estudiante();
        estudiante1.nombre = "Ana";
        estudiante1.apellido = "Torres";
        estudiante1.edad = 19;
        estudiante1.carrera = "Software";
        estudiante1.semestre = 2;
 
        // Instanciación del segundo objeto
        Estudiante estudiante2 = new Estudiante();
        estudiante2.nombre = "Carlos";
        estudiante2.apellido = "Mena";
        estudiante2.edad = 21;
        estudiante2.carrera = "Telecomunicaciones";
        estudiante2.semestre = 4;
 
        // Instanciación del tercer objeto
        Estudiante estudiante3 = new Estudiante();
        estudiante3.nombre = "María";
        estudiante3.apellido = "Paredes";
        estudiante3.edad = 20;
        estudiante3.carrera = "Ingeniería Industrial";
        estudiante3.semestre = 3;
 
        // Presentación de la información de cada estudiante
        System.out.println("Estudiante 1:");
        estudiante1.mostrarInformacion();
 
        System.out.println("Estudiante 2:");
        estudiante2.mostrarInformacion();
 
        System.out.println("Estudiante 3:");
        estudiante3.mostrarInformacion();
    }
}
