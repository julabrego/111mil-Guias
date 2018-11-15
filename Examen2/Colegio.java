package Examen2;

import java.util.ArrayList;
import java.util.List;

public class Colegio {
    private List<Curso> cursos;
    
    public Colegio(){
        this.cursos = new ArrayList<Curso>();
    }
     
    // 2.a) Cantidad de alumnos por curso
    public int cantidadPorCurso(String nombreCurso){
        int cantidadAlumnos = 0;
        for (Curso curso:cursos){
            if (curso.getNombreCurso().equals(nombreCurso)){
                cantidadAlumnos = curso.getInscripciones().size();
            }   
        }
        return cantidadAlumnos;
    }
    
    // 2.b) Cantidad de aprobados por curso
    public int cantidadAprobadosPorCurso(String nombreCurso){
        
        int cantidadAprobados = 0;
        boolean cursoEncontrado = false;
        
        for (int i=0; i<=cursos.size() && !cursoEncontrado; i++){
            Curso curso = cursos.get(i);
            String nombre = curso.getNombreCurso();
            
            if(nombre.equals(nombreCurso)){
                Inscripcion inscripciones = curso.getInscripciones();
                for (Inscripcion insc : inscripciones){
                    if (insc.getNota()>=insc.curso.getNotaAprobacion()){
                        cantidadAprobados += inscripciones.cantAprobados();
                    }
                }
                
            }
        }
        return cantidadAprobados;
    }
}
