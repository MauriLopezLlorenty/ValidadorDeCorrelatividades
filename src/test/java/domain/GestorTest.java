package domain;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class GestorTest {
    @Test
    public void testGestor() {

        Materia inglesII = new Materia();
        Materia inglesI = new Materia();
        inglesII.setNombre("Ingles II");
        inglesI.setNombre("Ingles I");
        List<Materia> correlativasInglesII = new ArrayList<>();
        correlativasInglesII.add(inglesI);
        inglesII.setMateriasCorrelativas(correlativasInglesII);


        Inscripcion inscripcion = new Inscripcion();
        inscripcion.setAlumnoasp(new Alumno());
        inscripcion.getAlumnoasp().setNombre("Juan");
        inscripcion.getAlumnoasp().setLegajo(1778080);
        List<Materia> materiasAprobadas = new ArrayList<>();
        materiasAprobadas.add(inglesI);
        inscripcion.getAlumnoasp().setMateriasAprobadas(materiasAprobadas);
        inscripcion.getAlumnoasp().setMateriasElegidas(correlativasInglesII);


        List<Materia> materiasEnInscripcion = new ArrayList<>();
        materiasEnInscripcion.add(inglesII);

        Assert.assertEquals(1, inscripcion.getAlumnoasp().getMateriasElegidas().size());

    }

    @Test
    public void testGestor2() {

        Materia inglesII = new Materia();
        Materia inglesI = new Materia();
        inglesII.setNombre("Ingles II");
        inglesI.setNombre("Ingles I");
        List<Materia> correlativasInglesI = new ArrayList<>();
        inglesI.setMateriasCorrelativas(correlativasInglesI);
        List<Materia> correlativasInglesII = new ArrayList<>();
        correlativasInglesII.add(inglesI);
        inglesII.setMateriasCorrelativas(correlativasInglesII);


        Inscripcion inscripcion = new Inscripcion();
        inscripcion.setAlumnoasp(new Alumno());
        inscripcion.getAlumnoasp().setNombre("Juan");
        inscripcion.getAlumnoasp().setLegajo(1778080);
        List<Materia> materiasAprobadas = new ArrayList<>();
        List<Materia> materiasElegidas = new ArrayList<>();
        materiasElegidas.add(inglesII);
        materiasAprobadas.add(inglesI);
        inscripcion.getAlumnoasp().setMateriasAprobadas(materiasAprobadas);
        inscripcion.getAlumnoasp().setMateriasElegidas(materiasElegidas);

        Assert.assertTrue(inscripcion.aprobada(inscripcion.getAlumnoasp()));

    }
}
