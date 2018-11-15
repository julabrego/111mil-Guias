package Examen2;

public class Inscripcion {
    private Curso curso;
    private Alumno alumno;
    private float nota;
   
    public Inscripcion(){}
    
    public void setAlumno(Alumno a){
        this.alumno = alumno;
    }

    public Alumno getAlumno() {
        return alumno;
    }
    
    public void setCurso(Curso curso){
        this.curso = curso;
    }
    
    public Curso getCurso(){
        return curso;
    }
    
    public void setNota(float n){
        this.nota = n;
    }
    
    public float getNota(){
        return nota;
    }
}
