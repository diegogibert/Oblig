package Utilities;


import Hash.HashCerrado;
import double_linked_list.ListaVaciaException;
import double_linked_list.ValorNoExisteException;
import heap.HeapMax;
import heap.HeapNode;
import uy.edu.um.clases.*;

public class Repository {

    static int totales;
    static HeapMax<Integer, OlympicGame> OlympicGames = new HeapMax<>(150000);
    static HeapMax<Integer, OlympicGame> OlympicGames0 = new HeapMax<>(150000);
    private static HeapMax<Integer, Event> Competitions0F = new HeapMax<>(200000);
    static HeapMax<Integer, Event> CompetitionsF = new HeapMax<>(200000);
    private static HeapMax<Integer, Event> Competitions0M = new HeapMax<>(300000);
    static HeapMax<Integer, Event> CompetitionsM = new HeapMax<>(300000);
    static HeapMax<Integer, Athlete> medallasOro = new HeapMax<>(1000000);
    static HeapMax<Integer, Athlete> medallasBronce = new HeapMax<>(1000000);
    static HeapMax<Integer, Athlete> medallasPlata = new HeapMax<>(1000000);
    static HeapMax<Integer, Athlete> medallasTotales = new HeapMax<>(1000000);
    static HeapMax<Integer, NationalOlympicCommittee> medallasOroPreg2 = new HeapMax<>(1000000);
    static HeapMax<Integer, NationalOlympicCommittee> medallasBroncePreg2 = new HeapMax<>(1000000);
    static HeapMax<Integer, NationalOlympicCommittee> medallasPlataPreg2 = new HeapMax<>(1000000);
    static HeapMax<Integer, NationalOlympicCommittee> medallasTotalesPreg2 = new HeapMax<>(1000000);
    static HashCerrado<Team, Nodo> preg5 = new HashCerrado<>(1000000);
    static HeapMax res = new HeapMax(10000000);
    static Nodo e1;
    static Nodo e2;
    static Nodo e3;
    static Nodo e4;
    static Nodo e5;

    public static void preg1O() throws ValorNoExisteException {
        for (int i = 1; i <= LoadData.atletas.size(); i++) {
            Athlete temp = LoadData.atletas.get(i);
            temp.setOros(0);
            totales = 0;
            int counterO = 0;
            for (int j = 0; j < temp.getAtleteOP().size(); j++) {
                MedalType medal = temp.getAtleteOP().get(j).getMedal();
                if (medal.equals(MedalType.GOLD)) {
                    counterO++;
                    if (counterO == 1) {
                        temp.setFirstMedalGold(temp.getAtleteOP().get(j).getOG().getYear());
                    }
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
            int counterB = 0;
            for (int j = 0; j < temp.getAtleteOP().size(); j++) {
                MedalType medal = temp.getAtleteOP().get(j).getMedal();
                if (medal.equals(MedalType.BRONZE)) {
                    counterB++;
                    if (counterB == 1) {
                        temp.setFirstMedalBronze(temp.getAtleteOP().get(j).getOG().getYear());
                    }
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
            int counterP = 0;
            for (int j = 0; j < temp.getAtleteOP().size(); j++) {
                MedalType medal = temp.getAtleteOP().get(j).getMedal();
                if (medal.equals(MedalType.SILVER)) {
                    counterP++;
                    if (counterP == 1) {
                        temp.setFirstMedalSilver(temp.getAtleteOP().get(j).getOG().getYear());
                    }
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
            int counterT = 0;
            for (int j = 0; j < temp.getAtleteOP().size(); j++) {
                MedalType medal = temp.getAtleteOP().get(j).getMedal();
                if (medal.equals(MedalType.SILVER) || medal.equals(MedalType.BRONZE) || medal.equals(MedalType.GOLD)) {
                    counterT++;
                    if (counterT == 1) {
                        temp.setFirstMedalTotal(temp.getAtleteOP().get(j).getOG().getYear());
                    }
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
            temp.setOros(0);
            temp.setPlatas(0);
            temp.setBroonces(0);
        }
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
            noqui.setMedallaBronce(noqui.getMedallaBronce() + temp.getBroonces());
        }
        noqui.setMedallaOro(0);
        noqui.setMedallaBronce(0);
        noqui.setMedallaPlata(0);

        for (int i = 0; i < LoadData.nocs.size(); i++) {
            String temp = LoadData.nocs.get(i);
            NationalOlympicCommittee noc = LoadData.NationalOlympicCommittees.get(temp);
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
                check = false;
                OlympicGame newOG = temp.getAtleteOP().get(j).getOG();

                int h = 0;

                if (h < j && temp.getAtleteOP().get(h).getOG().equals(temp.getAtleteOP().get(j).getOG())) {
                    check = true;
                } else {
                    while (h < j) h++;
                }

                if (!check) {
                    if (sex.equals(SexType.F) && !OlympicGames0.belongs(newOG))
                        OlympicGames0.add(new HeapNode<>(1, newOG));
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

        for (int i = 1; i <= LoadData.atletas.size(); i++) {
            Athlete temp = LoadData.atletas.get(i);
            SexType sex = temp.getSex();

            for (int j = 0; j < temp.getAtleteOP().size(); j++) {
                Event event = temp.getAtleteOP().get(j).getEvent();

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


    public static void preg4M() throws ValorNoExisteException {

        for (int i = 1; i <= LoadData.atletas.size(); i++) {

            Athlete temp = LoadData.atletas.get(i);
            SexType sex = temp.getSex();

            for (int j = 0; j < temp.getAtleteOP().size(); j++) {

                Event event = temp.getAtleteOP().get(j).getEvent();

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


    public static void preg5F(int yearMin, int yearMax) throws ValorNoExisteException, ListaVaciaException {
        for (int i = 1; i <= LoadData.atletas.size(); i++) {
            Athlete temp = LoadData.atletas.get(i);
            for (int j = 0; j < temp.getAtleteOP().size(); j++) {
                if(temp.getAtleteOP().get(j).getOG().getYear() >= yearMin &&  temp.getAtleteOP().get(j).getOG().getYear() <= yearMax){
                    Team team = temp.getAtleteOP().get(j).getTeam();
                    if(!preg5.belongs(team)){
                        if(!temp.getAtleteOP().get(j).getMedal().equals(MedalType.NA)){
                            preg5.insert(team, new Nodo(1,1,team.getName()));
                        }else{
                            preg5.insert(team, new Nodo(0,1,team.getName()));
                        }
                        temp.setAgregado(true);
                    }else{
                        if(!temp.getAtleteOP().get(j).getMedal().equals(MedalType.NA) && temp.isAgregado()==false){
                            Nodo nodito = preg5.get(team);
                            nodito.setMedallasPorEquipo(nodito.getMedallasPorEquipo() + 1);
                            nodito.setParticipantesPorEquipo(nodito.getParticipantesPorEquipo() + 1);
                            temp.setAgregado(true);
                        }else if(!temp.getAtleteOP().get(j).getMedal().equals(MedalType.NA) && temp.isAgregado()==true){
                            Nodo nodito = preg5.get(team);
                            nodito.setMedallasPorEquipo(nodito.getMedallasPorEquipo() + 1);
                        }else if(temp.getAtleteOP().get(j).getMedal().equals(MedalType.NA) && temp.isAgregado()==false){
                            Nodo nodito = preg5.get(team);
                            nodito.setParticipantesPorEquipo(nodito.getParticipantesPorEquipo() + 1);
                        }
                    }
                }

            }
        }
        for (int i = 1; i <= LoadData.atletas.size(); i++) {
            Athlete temp = LoadData.atletas.get(i);
            for (int j = 0; j < temp.getAtleteOP().size(); j++) {
                if (temp.getAtleteOP().get(j).getOG().getYear() >= yearMin && temp.getAtleteOP().get(j).getOG().getYear() <= yearMax) {
                    Team team = temp.getAtleteOP().get(j).getTeam();
                    Nodo nodito;
                    try{
                       nodito = preg5.get(team);
                  } catch (ValorNoExisteException e) {
                        continue;
                    }
                    res.add(new HeapNode<>(nodito,nodito));
                }
            }
        }
        e1 = (Nodo) Repository.res.getAndDelete();
        e2 = (Nodo)Repository.res.getAndDelete();
        while (e1.equals(e2)) e2 = (Nodo)Repository.res.getAndDelete();
        e3 = (Nodo)Repository.res.getAndDelete();
        while (e3.equals(e2) || e3.equals(e1)) e3 = (Nodo)Repository.res.getAndDelete();
        e4 = (Nodo)Repository.res.getAndDelete();
        while (e4.equals(e3) || e4.equals(e2) || e4.equals(e1)) e4 = (Nodo)Repository.res.getAndDelete();
        e5 = (Nodo)Repository.res.getAndDelete();
        while (e5.equals(e4) || e5.equals(e3) || e5.equals(e2) || e5.equals(e1))
            e5 = (Nodo)Repository.res.getAndDelete();
        System.out.println("Nombre: " + e1.getNombreEquipo() + " Relacion "+ e1.getMedallasPorEquipo()/ e1.getParticipantesPorEquipo());
        System.out.println("Nombre: " + e2.getNombreEquipo() + " Relacion "+ e2.getMedallasPorEquipo()/ e2.getParticipantesPorEquipo());
        System.out.println("Nombre: " + e3.getNombreEquipo() + " Relacion "+ e3.getMedallasPorEquipo()/ e3.getParticipantesPorEquipo());
        System.out.println("Nombre: " + e4.getNombreEquipo() + " Relacion "+ e4.getMedallasPorEquipo()/ e4.getParticipantesPorEquipo());
        System.out.println("Nombre: " + e5.getNombreEquipo() + " Relacion "+ e5.getMedallasPorEquipo()/ e5.getParticipantesPorEquipo());
    }
}
















