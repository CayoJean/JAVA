package RegistroDeEstudiantes;

public class Tarea {
    private static int contador = 0;
    private int idTarea;
    private String descripcion;
    private boolean completada;

    public Tarea(String descripcion) {
        this.idTarea = ++contador;
        this.descripcion = descripcion;
        this.completada = false;
    }

    public int getIdTarea() {
        return idTarea;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void marcarComoCompletada() {
        this.completada = true;
    }

    @Override
    public String toString() {
        return "ID: " + idTarea + ", Descripción: " + descripcion + ", Estado: " + (completada ? "Completada" : "Pendiente");
    }
}
