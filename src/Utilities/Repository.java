package Utilities;


import BinarySearchTree.BinarySearchTree;
import BinarySearchTree.ValorYaExisteException;
import double_linked_list.ListaVaciaException;
import double_linked_list.ValorNoExisteException;
import heap.HeapMax;
import heap.HeapNode;
import uy.edu.um.clases.*;

import java.util.ArrayList;

public class Repository {

    static int totales;
    static HeapMax<Integer, OlympicGame> OlympicGames = new HeapMax<>(150000);
    static HeapMax<Integer, OlympicGame> OlympicGames0 = new HeapMax<>(150000);
    private static HeapMax<Integer, Event> Competitions0F = new HeapMax<>(200000);
    static HeapMax<Integer, Event> CompetitionsF = new HeapMax<>(200000);
    private static HeapMax<Integer, Event> Competitions0M = new HeapMax<>(300000);
    static HeapMax<Integer, Event> CompetitionsM = new HeapMax<>(300000);
    static ArrayList<Team> teams = new ArrayList<>(2000);
    static HeapMax<Integer, Athlete> medallasOro = new HeapMax<>(1000000);
    static HeapMax<Integer, Athlete> medallasBronce = new HeapMax<>(1000000);
    static HeapMax<Integer, Athlete> medallasPlata = new HeapMax<>(1000000);
    static HeapMax<Integer, Athlete> medallasTotales = new HeapMax<>(1000000);
    static HeapMax<Integer, NationalOlympicCommittee> medallasOroPreg2 = new HeapMax<>(1000000);
    static HeapMax<Integer, NationalOlympicCommittee> medallasBroncePreg2 = new HeapMax<>(1000000);
    static HeapMax<Integer, NationalOlympicCommittee> medallasPlataPreg2 = new HeapMax<>(1000000);
    static HeapMax<Integer, NationalOlympicCommittee> medallasTotalesPreg2 = new HeapMax<>(1000000);
    static BinarySearchTree<Integer, RelacionEquipoCantidad> pregunta5= new BinarySearchTree<Integer, RelacionEquipoCantidad>();


    public static void preg1O() throws ValorNoExisteException {
        for (int i = 1; i <= LoadData.atletas.size(); i++) {
            Athlete temp = LoadData.atletas.get(i);

            temp.setOros(0);
            totales = 0;
            for (int j = 0; j < temp.getAtleteOP().size(); j++) {
                MedalType medal = temp.getAtleteOP().get(j).getMedal();
                if (medal.equals(MedalType.GOLD)) {
                    int oros = temp.getOros() + 1;
                    temp.setOros(oros);
                    temp.setLastMedalGold(temp.getAtleteOP().get(j).getOG().getYear());
                }
            }
        }
        for (int i = 1; i <= LoadData.atletas.size(); i++) {
            Athlete temp = LoadData.atletas.get(i);
            medallasOro.add(new HeapNode<>(temp.getOros(), temp));
        }
    }

    public static void preg1B() throws ValorNoExisteException {
        for (int i = 1; i <= LoadData.atletas.size(); i++) {
            Athlete temp = LoadData.atletas.get(i);
            temp.setBroonces(0);
            for (int j = 0; j < temp.getAtleteOP().size(); j++) {
                MedalType medal = temp.getAtleteOP().get(j).getMedal();
                if (medal.equals(MedalType.BRONZE)) {
                    int bronces = temp.getBroonces() + 1;
                    temp.setBroonces(bronces);
                    temp.setLastMedalBronze(temp.getAtleteOP().get(j).getOG().getYear());
                }
            }
        }
        for (int i = 1; i <= LoadData.atletas.size(); i++) {
            Athlete temp = LoadData.atletas.get(i);
            medallasBronce.add(new HeapNode<>(temp.getBroonces(), temp));
        }
    }

    public static void preg1P() throws ValorNoExisteException {
        for (int i = 1; i <= LoadData.atletas.size(); i++) {
            Athlete temp = LoadData.atletas.get(i);
            temp.setPlatas(0);
            for (int j = 0; j < temp.getAtleteOP().size(); j++) {
                MedalType medal = temp.getAtleteOP().get(j).getMedal();
                if (medal.equals(MedalType.SILVER)) {
                    int platas = temp.getPlatas() + 1;
                    temp.setPlatas(platas);
                    temp.setLastMedalSilver(temp.getAtleteOP().get(j).getOG().getYear());
                }
            }
        }
        for (int i = 1; i <= LoadData.atletas.size(); i++) {
            Athlete temp = LoadData.atletas.get(i);
            medallasPlata.add(new HeapNode<>(temp.getPlatas(), temp));
        }
    }

    public static void preg1T() throws ValorNoExisteException {
        for (int i = 1; i <= LoadData.atletas.size(); i++) {
            Athlete temp = LoadData.atletas.get(i);
            temp.setTotales(0);
            for (int j = 0; j < temp.getAtleteOP().size(); j++) {
                MedalType medal = temp.getAtleteOP().get(j).getMedal();
                if (medal.equals(MedalType.SILVER) || medal.equals(MedalType.BRONZE) || medal.equals(MedalType.GOLD)) {
                    int total = temp.getTotales() + 1;
                    temp.setTotales(total);
                    temp.setLastMedalTotal(temp.getAtleteOP().get(j).getOG().getYear());
                }
            }
        }
        for (int i = 1; i <= LoadData.atletas.size(); i++) {
            Athlete temp = LoadData.atletas.get(i);
            medallasTotales.add(new HeapNode<>(temp.getTotales(), temp));
        }
    }

    public static void preg2O() throws ValorNoExisteException {
        NationalOlympicCommittee noqui = null;

        for (int i = 1; i <= LoadData.atletas.size(); i++) {
            Athlete temp = LoadData.atletas.get(i);
            noqui = LoadData.NationalOlympicCommittees.get(temp.getNOC().getNoc());
            for (int j = 0; j < temp.getAtleteOP().size(); j++) {
                MedalType medal = temp.getAtleteOP().get(j).getMedal();
                if (medal.equals(MedalType.GOLD)) {
                    int oros = temp.getOros() + 1;
                    temp.setOros(oros);
                    temp.setLastMedalGold(temp.getAtleteOP().get(j).getOG().getYear());
                }
                if (medal.equals(MedalType.SILVER)) {
                    int platas = temp.getPlatas() + 1;
                    temp.setPlatas(platas);
                    temp.setLastMedalSilver(temp.getAtleteOP().get(j).getOG().getYear());
                }
                if (medal.equals(MedalType.BRONZE)) {
                    int bronces = temp.getBroonces() + 1;
                    temp.setBroonces(bronces);
                    temp.setLastMedalBronze(temp.getAtleteOP().get(j).getOG().getYear());
                }
            }
            noqui.setMedallaOro(noqui.getMedallaOro() + temp.getOros());
            noqui.setMedallaPlata(noqui.getMedallaPlata() + temp.getPlatas());
            noqui.setMedallaBronce(noqui.getMedallaBronce() + temp.getPlatas());
        }
        noqui.setMedallaOro(0);
        noqui.setMedallaBronce(0);
        noqui.setMedallaPlata(0);

        for (int i = 0; i < LoadData.nocs.size(); i++) {
            String temp = LoadData.nocs.get(i);
            NationalOlympicCommittee noc = LoadData.NationalOlympicCommittees.get(temp);
//            System.out.println("oro "+ noc.getMedallaOro());
//            System.out.println(" plata" + noc.getMedallaPlata());
//            System.out.println(noc.getMedallaBronce());
            medallasOroPreg2.add(new HeapNode<>(noc.getMedallaOro(), noc));
            medallasPlataPreg2.add(new HeapNode<>(noc.getMedallaPlata(), noc));
            medallasBroncePreg2.add(new HeapNode<>(noc.getMedallaBronce(), noc));
            medallasTotalesPreg2.add(new HeapNode<>(noc.getMedallaOro() + noc.getMedallaPlata() + noc.getMedallaBronce(), noc));

        }

    }

    public static void preg3() throws ValorNoExisteException {
        boolean check = false;

        for (int i = 1; i <= LoadData.atletas.size(); i++) {
            Athlete temp = LoadData.atletas.get(i);
            SexType sex = temp.getSex();
            check = false;

            for (int j = 0; j < temp.getAtleteOP().size(); j++) {
                OlympicGame newOG = temp.getAtleteOP().get(j).getOG();

                for (int h = 0; h < temp.getAtleteOP().size(); h++) {
                    if (h != j && temp.getAtleteOP().get(h).getOG().getYear() == newOG.getYear()) {
                        check = true;
                    }
                }

                if (!check) {
                    if (sex.equals(SexType.F) && !OlympicGames0.belongs(newOG))
                        OlympicGames0.add(new HeapNode<>(newOG.getCantidadDeAtletasFemeninos(), newOG));
                    else if (sex.equals(SexType.F) && OlympicGames0.belongs(newOG)) {
                        OlympicGame og = OlympicGames0.get(newOG);
                        og.setCantidadDeAtletasFemeninos(og.getCantidadDeAtletasFemeninos() + 1);
                        OlympicGames.add(new HeapNode<>(og.getCantidadDeAtletasFemeninos(), og));
                    }
                }
            }

        }
    }


    public static void preg4F() throws ValorNoExisteException {
        boolean check = false;
        for (int i = 1; i <= LoadData.atletas.size(); i++) {
            Athlete temp = LoadData.atletas.get(i);
            SexType sex = temp.getSex();
            check = false;

            for (int j = 0; j < temp.getAtleteOP().size(); j++) {
                Event event = temp.getAtleteOP().get(j).getEvent();

                for (int h = 0; h < temp.getAtleteOP().size(); h++) {
                    if (h != j && temp.getAtleteOP().get(h).getOG().getYear() == temp.getAtleteOP().get(j).getOG().getYear()) {
                        check = true;
                    }
                }

                if (!check) {
                    if (sex.equals(SexType.F) && !Competitions0F.belongs(event))
                        Competitions0F.add(new HeapNode<>(event.getCantidadMujeres() + 1, event));
                    else if (sex.equals(SexType.F) && Competitions0F.belongs(event)) {
                        Event e = Competitions0F.get(event);
                        e.setCantidadMujeres(e.getCantidadMujeres() + 1);
                        CompetitionsF.add(new HeapNode<>(e.getCantidadMujeres(), e));
                    }
                }

            }
        }

    }


    public static void preg4M() throws ValorNoExisteException {
        boolean check = false;
        for (int i = 1; i <= LoadData.atletas.size(); i++) {
            check = false;

            Athlete temp = LoadData.atletas.get(i);
            SexType sex = temp.getSex();

            for (int j = 0; j < temp.getAtleteOP().size(); j++) {
                Event event = temp.getAtleteOP().get(j).getEvent();

                for (int h = 0; h < temp.getAtleteOP().size(); h++) {
                    if (h != j && temp.getAtleteOP().get(h).getOG().getYear() == temp.getAtleteOP().get(j).getOG().getYear()) {
                        check = true;
                    }
                }

                if (!check) {
                    if (sex.equals(SexType.M) && !Competitions0M.belongs(event)) {
                        Competitions0M.add(new HeapNode<>(event.getCantidadHombres() + 1, event));
                    } else if (sex.equals(SexType.M) && Competitions0M.belongs(event)) {
                        Event e = Competitions0M.get(event);
                        e.setCantidadHombres(e.getCantidadHombres() + 1);
                        CompetitionsM.add(new HeapNode<>(e.getCantidadHombres(), e));
                    }
                }
            }
        }

    }

    public static void preg5() throws ValorNoExisteException, ListaVaciaException, ValorYaExisteException {
        int cont1 = 0;
        int cont2 = 0;
        Team team = null;
        MedalType medal = null;
        int year = 0;
        boolean seguir=false;
        boolean seguir2=false;
        RelacionEquipoCantidad rel=null;


        for (int i = 1; i <= LoadData.atletas.size(); i++) {
            Athlete temp = LoadData.atletas.get(i);

            for (int j = 0; j < temp.getAtleteOP().size(); j++) {
                medal = temp.getAtleteOP().get(j).getMedal();
                team = temp.getAtleteOP().get(j).getTeam();
                year = temp.getAtleteOP().get(j).getOG().getYear();


                    rel= new RelacionEquipoCantidad(team);
                    rel.setCantidadCompetidores(1);
                    try {
                        pregunta5.insert(year, rel);
                        cont1=1;
                    }catch (ValorYaExisteException e){
                        cont1=pregunta5.find(year).getCantidadCompetidores() +1;
                        pregunta5.delete(year);
                        rel=new RelacionEquipoCantidad(team);
                        rel.setCantidadCompetidores(cont1);
                        pregunta5.insert(year,rel);
                    }

                    if(!medal.equals(MedalType.NA)){
                        try{
                            cont2=rel.getCantidadMedallas() +1;
                            pregunta5.find(year).setCantidadMedallas(cont2);
                        }catch(ValorNoExisteException| ListaVaciaException e){

                        }
                    }




            }

            if (!teams.contains(team)) teams.add(team);
        }
        while(!seguir && !seguir2){
        try {
            team.setCompetidoresPorAno(year, cont1);
            seguir=true;
        }catch(ValorYaExisteException e){
            team.getCompetidoresPorAno().delete(year);
        }
        try{
            team.setMedallasPorAno(year, cont2);
            seguir2=true;
        }catch(ValorYaExisteException e){
            team.getMedallasPorAno().delete(year);
        }
        }

    }
}









