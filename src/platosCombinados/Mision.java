package platosCombinados;

public class Mision {

    private int id;
    private String nombre;
    private String dificultad;
    private int nivelRecomandado;
    private int recompensaExperiencia;
    private boolean completada;

    public Mision(int id, String nombre, String dificultad,  int nivelRecomandado, int recompensaExperiencia, boolean completada) {
        this.id = id;
        this.nombre = nombre;
        this.dificultad = dificultad;
        this.nivelRecomandado = nivelRecomandado;
        this.recompensaExperiencia = recompensaExperiencia;
        this.completada = completada;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDificultad() {
        return dificultad;
    }

    public int getNivelRecomandado() {
        return nivelRecomandado;
    }

    public int getRecompensaExperiencia() {
        return recompensaExperiencia;
    }

    public boolean isCompletada() {
        return completada;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Mision: {");

        sb.append("id=").append(id);
        sb.append(", nombre=").append(nombre);
        sb.append(", dificultad=").append(dificultad);
        sb.append(", nivelRecomandado=").append(nivelRecomandado);
        sb.append(", recompensaExperiencia=").append(recompensaExperiencia);
        sb.append(", completada=").append(completada);

        sb.append("}");

        return sb.toString();
    }


}


