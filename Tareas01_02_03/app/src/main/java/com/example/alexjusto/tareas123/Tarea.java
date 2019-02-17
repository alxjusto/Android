package com.example.alexjusto.tareas123;

public class Tarea {

    private String nombre;
    private String fecha;
    private String hora;

    public Tarea(String nombre, String fecha, String hora) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.hora = hora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
}
