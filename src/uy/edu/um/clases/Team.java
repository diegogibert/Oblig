package uy.edu.um.clases;

import BinarySearchTree.BinarySearchTree;
import BinarySearchTree.ValorYaExisteException;

public class Team {

    private String name;

    protected static BinarySearchTree competidoresPorAno= new BinarySearchTree();
    protected static BinarySearchTree medallasPorAno= new BinarySearchTree();

    public BinarySearchTree getCompetidoresPorAno() {
        return competidoresPorAno;
    }

    public BinarySearchTree getMedallasPorAno() {
        return medallasPorAno;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCompetidoresPorAno(int ano, int competidoresPorAno) throws ValorYaExisteException {
        this.competidoresPorAno.insert(ano,competidoresPorAno);
    }

    public void setMedallasPorAno(int ano, int medallasPorAno) throws ValorYaExisteException {
        this.medallasPorAno.insert(ano,medallasPorAno);
    }

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
