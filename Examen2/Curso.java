package Examen2;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nombreCurso;
    private int cupo;
    private float notaAprobacion;
    private List<Inscripcion> inscripciones;
    
    public Curso(float nota, int cupo){
        this.inscripciones = new ArrayList<Inscripcion>();
    }
    public void setNombreCurso(String n){
        this.nombreCurso = n;
    }
    public String getNombreCurso(){
        return nombreCurso;
    }  
    public List<Inscripcion> getInscripciones() {
        return inscripciones;
    }
    public float getNotaAprobacion(){
        return notaAprobacion;
    }
}
