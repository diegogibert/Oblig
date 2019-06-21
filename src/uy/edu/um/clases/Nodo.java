package uy.edu.um.clases;

public class Nodo implements Comparable<Nodo> {
    private int medallasPorEquipo;
    private int participantesPorEquipo;
    private String nombreEquipo;

    public Nodo(int medallasPorEquipo, int participantesPorEquipo, String nombreEquipo) {
        this.medallasPorEquipo = medallasPorEquipo;
        this.participantesPorEquipo = participantesPorEquipo;
        this.nombreEquipo = nombreEquipo;
    }

    public int getMedallasPorEquipo() {
        return medallasPorEquipo;
    }

    public void setMedallasPorEquipo(int medallasPorEquipo) {
        this.medallasPorEquipo = medallasPorEquipo;
    }

    public int getParticipantesPorEquipo() {
        return participantesPorEquipo;
    }

    public void setParticipantesPorEquipo(int participantesPorEquipo) {
        this.participantesPorEquipo = participantesPorEquipo;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    @Override
    public int compareTo( Nodo n) {
        float res = this.medallasPorEquipo/((float)this.participantesPorEquipo) - n.getMedallasPorEquipo()/((float)n.getParticipantesPorEquipo());
        if(res < 0) return -1;
        if(res > 0) return 1;
        else return 0;
    }
}

