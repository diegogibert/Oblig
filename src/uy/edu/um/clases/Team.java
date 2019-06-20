package uy.edu.um.clases;

import BinarySearchTree.BinarySearchTree;
import BinarySearchTree.ValorYaExisteException;

import java.util.Objects;

public class Team {

    private String name;

    private static BinarySearchTree competidoresPorAno= new BinarySearchTree();
    private static BinarySearchTree medallasPorAno= new BinarySearchTree();

    public BinarySearchTree getCompetidoresPorAno() {
        return competidoresPorAno;
    }

    public BinarySearchTree getMedallasPorAno() {
        return medallasPorAno;
    }

    public void setCompetidoresPorAno(int ano, int competidoresPorAno) throws ValorYaExisteException {
        Team.competidoresPorAno.insert(ano,competidoresPorAno);
    }

    public void setMedallasPorAno(int ano, int medallasPorAno) throws ValorYaExisteException {
        Team.medallasPorAno.insert(ano,medallasPorAno);
    }

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Team team = (Team) o;
        return Objects.equals(name, team.name);
    }


}