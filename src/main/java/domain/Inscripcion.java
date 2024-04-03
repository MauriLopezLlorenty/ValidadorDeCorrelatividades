package domain;

import java.util.Collections;
import java.util.List;

public class Inscripcion {
    private Alumno alumnoasp;



    public Alumno getAlumnoasp() {
        return alumnoasp;
    }

    public void setAlumnoasp(Alumno alumnoasp) {
        this.alumnoasp = alumnoasp;
    }

    public boolean aprobada(Alumno alumnoasp){
        return alumnoasp.puedeCursar(alumnoasp.getMateriasElegidas());
    }



}

