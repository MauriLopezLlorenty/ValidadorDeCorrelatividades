package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Alumno {
    private String nombre;
    private Integer legajo;
    private List<Materia> materiasAprobadas = new ArrayList<>();

    private List<Materia> materiasElegidas = new ArrayList<>();


    public List<Materia> getMateriasElegidas() {
        return materiasElegidas;
    }

    public void setMateriasElegidas(List<Materia> materiasElegidas) {
        this.materiasElegidas = materiasElegidas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getLegajo() {
        return legajo;
    }

    public void setLegajo(Integer legajo) {
        this.legajo = legajo;
    }

    public List<Materia> getMateriasAprobadas() {
        return materiasAprobadas;
    }


    public void setMateriasAprobadas(List<Materia> materiasAprobadas) {
        this.materiasAprobadas = materiasAprobadas;
    }

    /*public List<Materia> puedeCursar(List<Materia> materias) {
       return this.materiasAprobadas.stream().filter(m->m.esCorrelativaDe(materias)).collect(Collectors.toList());
    }*/
    public boolean  puedeCursar(List<Materia> materias){
        return this.materiasAprobadas.stream().anyMatch(m->m.esCorrelativaDe(this.materiasElegidas));
    }

    public void agregarMateriasAprobadas (Materia ... materiasAprobadas){
        Collections.addAll(this.materiasAprobadas, materiasAprobadas);
    }



}
