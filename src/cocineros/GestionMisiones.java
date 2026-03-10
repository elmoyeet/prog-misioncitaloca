package cocineros;

import platosCombinados.Mision;

import java.util.ArrayList;

public class GestionMisiones {

    private ArrayList<Mision> misiones;

    public GestionMisiones() {
        this.misiones = new ArrayList<>();
    }

    public int crearMision(int id, String nombre, String dificultad,  int nivelRecomandado, int recompensaExperiencia, boolean completada) {

        int idMisionCreada;

        Mision mision = new Mision(id, nombre, dificultad, nivelRecomandado, recompensaExperiencia, completada);

        idMisionCreada = agregarMision(mision);

        return idMisionCreada;
    }

    public int agregarMision(Mision mision) {
        this.misiones.add(mision);

        return mision.getId();
    }

    public String listarMisiones() {
        StringBuilder sb = new StringBuilder("Misiones: {");

        for (int i = 0; i < misiones.size(); i++) {

            sb.append(misiones.get(i).toString());

            sb.append("}");

        }

        return sb.toString();
    }

    public Mision buscarMision(int id) {
        Mision mision = null;

        for (int i = 0; i < misiones.size(); i++) {
            if (misiones.get(i).getId() == id) {
                mision = misiones.get(i);
            }
        }

        return mision;

    }
}
