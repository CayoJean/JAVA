package RegistroDeEstudiantes;

public class Estudiante {
    private String documento;
    private String nombre;
    private Integer edad;

    public Estudiante(String documento, String nombre, Integer edad) {
        this.documento = documento;
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getDocumento() {
        return documento;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return "Documento: " + documento + ", Nombre: " + nombre + ", Edad: " + edad;
    }
}
