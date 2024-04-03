package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Materia {
 private String nombre;
 private List <Materia> materiasCorrelativas = new ArrayList<>();

    public String getnombre() {
        return nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Materia> getMateriasCorrelativas() {
        return materiasCorrelativas;
    }
   public void agregarCorrelativas(Materia ... materiasCorrelativas){
       Collections.addAll(this.materiasCorrelativas, materiasCorrelativas);
   }

    public void setMateriasCorrelativas(List<Materia> materiasCorrelativas) {
        this.materiasCorrelativas = materiasCorrelativas;
    }

    public boolean esCorrelativaDe (List<Materia> unasMaterias){
        return unasMaterias != null && unasMaterias.stream().anyMatch(m -> m.getMateriasCorrelativas().contains(this));
    }
}

