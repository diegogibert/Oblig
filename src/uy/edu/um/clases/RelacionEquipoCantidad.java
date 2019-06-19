package uy.edu.um.clases;

public class RelacionEquipoCantidad {

    private Team team;
    private int cantidadMedallas;
    private int cantidadCompetidores;

    public RelacionEquipoCantidad(Team team) {
        this.team = team;

    }


    public Team getTeam() {
        return team;
    }

    public int getCantidadMedallas() {
        return cantidadMedallas;
    }

    public int getCantidadCompetidores() {
        return cantidadCompetidores;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public void setCantidadMedallas(int cantidadMedallas) {
        this.cantidadMedallas = cantidadMedallas;
    }

    public void setCantidadCompetidores(int cantidadCompetidores) {
        this.cantidadCompetidores = cantidadCompetidores;
    }
}
