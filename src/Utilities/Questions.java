package Utilities;

import BinarySearchTree.ValorYaExisteException;
import double_linked_list.ListaVaciaException;
import double_linked_list.ValorNoExisteException;
import heap.HeapMax;
import heap.HeapNode;
import uy.edu.um.clases.*;

import java.util.ArrayList;
import java.util.Scanner;

class Questions {
    static boolean finish2=false;
    static boolean finish3 = false;
    static boolean finish4F = false;
    static boolean finish4M = false;
    static boolean finish5 = false;
    static OlympicGame edicion1 = null;
    static OlympicGame edicion2 = null;
    static OlympicGame edicion3 = null;
    static OlympicGame edicion4 = null;
    static OlympicGame edicion5 = null;
    static OlympicGame edicion6 = null;
    static OlympicGame edicion7 = null;
    static OlympicGame edicion8 = null;
    static OlympicGame edicion9 = null;
    static OlympicGame edicion10 = null;
    static Event e1 = null;
    static Event e2 = null;
    static Event e3 = null;
    static Event e4 = null;
    static Event e5 = null;
    static Event ev1 = null;
    static Event ev2 = null;
    static Event ev3 = null;
    static Event ev4 = null;
    static Event ev5 = null;
    static Team team1 = null;
    static Team team2 = null;
    static Team team3 = null;
    static Team team4 = null;
    static Team team5 = null;
    static ArrayList<NationalOlympicCommittee> temp1= new ArrayList<>();
    static ArrayList<NationalOlympicCommittee> temp2= new ArrayList<>();
    static ArrayList<NationalOlympicCommittee> temp3= new ArrayList<>();
    static ArrayList<NationalOlympicCommittee> temp4= new ArrayList<>();



    static void Question1() throws ValorNoExisteException, ListaVaciaException {
        MedalType m = MedalType.NA;
        String t = "N";
        Scanner di = new Scanner(System.in);

        System.out.println("--------------------Pregunta 1-------------------");
        System.out.println(" ");
        System.out.println("-------------------Seleccione una opcion------------------");
        System.out.println(" ");
        System.out.println("Oro(O)");
        System.out.println(" ");
        System.out.println("Plata(P)");
        System.out.println(" ");
        System.out.println("Bronce(B)");
        System.out.println(" ");
        System.out.println("Todas(T)");
        System.out.println(" ");
        System.out.println("Selection:");
        String i = di.next();
        switch (i) {
            case "O":
                m = MedalType.GOLD;
                break;
            case "P":
                m = MedalType.SILVER;
                break;
            case "B":
                m = MedalType.BRONZE;
                break;
            case "T":
                t = "T";
                break;
            default:
                System.out.println(" ");
                System.out.println("Valor invalido");
                Question1();
                break;
        }
        if (m.equals(MedalType.GOLD)) {
            Repository.preg1O();
            for (int j = 0; j < 10; j++) {
                Athlete temp = Repository.medallasOro.getAndDelete();
                System.out.println("Nombre Atleta: " + temp.getName() + " Sexo " + temp.getSex() + " Cantidad Oros: " + temp.getOros() + " Año max: " + temp.getLastMedalGold());
            }
        }
        if (m.equals(MedalType.BRONZE)) {
            Repository.preg1B();
            for (int j = 0; j < 10; j++) {
                Athlete temp = Repository.medallasBronce.getAndDelete();
                System.out.println("Nombre Atleta: " + temp.getName() + " Sexo " + temp.getSex() + " Cantidad Bronces: " + temp.getBroonces() + " Año max: " + temp.getLastMedalBronze());
            }
        }
        if (m.equals(MedalType.SILVER)) {
            Repository.preg1P();
            for (int j = 0; j < 10; j++) {
                Athlete temp = Repository.medallasPlata.getAndDelete();
                System.out.println("Nombre Atleta: " + temp.getName() + " Sexo " + temp.getSex() + " Cantidad Platas: " + temp.getPlatas() + " Año max: " + temp.getLastMedalSilver());
            }
        }
        if (t == "T") {
            Repository.preg1T();
            for (int j = 0; j < 10; j++) {
                Athlete temp = Repository.medallasTotales.getAndDelete();
                System.out.println("Nombre Atleta: " + temp.getName() + " Sexo " + temp.getSex() + " Cantidad Medallas Totales: " + temp.getTotales() + " Año max: " + temp.getLastMedalTotal());
            }
        }
    }

    public static void Question2() throws ListaVaciaException, ValorNoExisteException, ValorYaExisteException {
            if(!finish2) Repository.preg2O();
            finish2=true;

        MedalType m = MedalType.NA;
        String t = "N";

        Scanner di = new Scanner(System.in);

        System.out.println("--------------------Pregunta 2-------------------");
        System.out.println(" ");
        System.out.println("-------------------Seleccione una opcion------------------");
        System.out.println(" ");
        System.out.println("Oro(O)");
        System.out.println(" ");
        System.out.println("Plata(P)");
        System.out.println(" ");
        System.out.println("Bronce(B)");
        System.out.println(" ");
        System.out.println("Todas(T)");
        System.out.println(" ");
        System.out.println("Selection:");
        String i = di.next();
        switch (i) {
            case "O":
                m = MedalType.GOLD;
                break;
            case "P":
                m = MedalType.SILVER;
                break;
            case "B":
                m = MedalType.BRONZE;
                break;
            case "T":
                t = "T";
                break;
            default:
                System.out.println(" ");
                System.out.println("Valor invalido");
                Question1();
                break;
        }
        if (m.equals(MedalType.GOLD)) {
            for (int j = 0; j < 10; j++) {
                temp1.add(Repository.medallasOroPreg2.getAndDelete());
                NationalOlympicCommittee temp= temp1.get(j);
                System.out.println("Region: " + temp.getRegion() + " Cantidad Oros: " + temp.getMedallaOro());

            }
        }
        if (m.equals(MedalType.BRONZE)) {
            for (int j = 0; j < 10; j++) {
                temp2.add(Repository.medallasBroncePreg2.getAndDelete());
                System.out.println("Region: " + temp2.get(j).getRegion() + " Cantidad Bronces: " + temp2.get(j).getMedallaBronce());

            }
        }
        if (m.equals(MedalType.SILVER)) {
            for (int j = 0; j < 10; j++) {
                temp3.add(Repository.medallasPlataPreg2.getAndDelete());
                System.out.println("Region: " + temp3.get(j).getRegion() + " Cantidad Platas: " + temp3.get(j).getMedallaPlata());

            }
        }
        if (t == "T") {
            for (int j = 0; j < 10; j++) {
                temp4.add(Repository.medallasTotalesPreg2.getAndDelete());
                int total = temp4.get(j).getMedallaPlata() + temp4.get(j).getMedallaBronce() + temp4.get(j).getMedallaOro();
                System.out.println("Region: " + temp4.get(j).getRegion() + " Cantidad Total " + total);
            }
        }
    }



    static void Question3() throws ListaVaciaException, ValorNoExisteException {


        System.out.println("--------------------Pregunta 3-------------------");
        System.out.println(" ");

        if (!finish3) {
            Repository.preg3();
            edicion1 = Repository.OlympicGames.getAndDelete();
            edicion2 = Repository.OlympicGames.getAndDelete();
            while (edicion1.equals(edicion2)) edicion2 = Repository.OlympicGames.getAndDelete();
            edicion3 = Repository.OlympicGames.getAndDelete();
            while (edicion3.equals(edicion2) || edicion3.equals(edicion1))
                edicion3 = Repository.OlympicGames.getAndDelete();
            edicion4 = Repository.OlympicGames.getAndDelete();
            while (edicion4.equals(edicion3) || edicion4.equals(edicion2) || edicion4.equals(edicion1))
                edicion4 = Repository.OlympicGames.getAndDelete();
            edicion5 = Repository.OlympicGames.getAndDelete();
            while (edicion5.equals(edicion4) || edicion5.equals(edicion3) || edicion5.equals(edicion2) || edicion5.equals(edicion1))
                edicion5 = Repository.OlympicGames.getAndDelete();
            edicion6 = Repository.OlympicGames.getAndDelete();
            while (edicion6.equals(edicion5) || edicion6.equals(edicion4) || edicion6.equals(edicion3) || edicion6.equals(edicion2) || edicion6.equals(edicion1))
                edicion6 = Repository.OlympicGames.getAndDelete();
            edicion7 = Repository.OlympicGames.getAndDelete();
            while (edicion7.equals(edicion6) || edicion7.equals(edicion5) || edicion7.equals(edicion4) || edicion7.equals(edicion3) || edicion7.equals(edicion2) || edicion7.equals(edicion1))
                edicion7 = Repository.OlympicGames.getAndDelete();
            edicion8 = Repository.OlympicGames.getAndDelete();
            while (edicion8.equals(edicion7) || edicion8.equals(edicion6) || edicion8.equals(edicion5) || edicion8.equals(edicion4) || edicion8.equals(edicion3) || edicion8.equals(edicion2) || edicion8.equals(edicion1))
                edicion8 = Repository.OlympicGames.getAndDelete();
            edicion9 = Repository.OlympicGames.getAndDelete();
            while (edicion9.equals(edicion8) || edicion9.equals(edicion7) || edicion9.equals(edicion6) || edicion9.equals(edicion5) || edicion9.equals(edicion4) || edicion9.equals(edicion3) || edicion9.equals(edicion2) || edicion9.equals(edicion1))
                edicion9 = Repository.OlympicGames.getAndDelete();
            edicion10 = Repository.OlympicGames.getAndDelete();
            while (edicion10.equals(edicion9) || edicion10.equals(edicion8) || edicion10.equals(edicion7) || edicion10.equals(edicion6) || edicion10.equals(edicion5) || edicion10.equals(edicion4) || edicion10.equals(edicion3) || edicion10.equals(edicion2) || edicion10.equals(edicion1))
                edicion10 = Repository.OlympicGames.getAndDelete();
            finish3 = true;
        }


        System.out.println("1 Nombre: " + edicion1.getName() + " Edicion: " + edicion1.getSeason() + " Ano: "
                + edicion1.getYear() + " Cantidad de atletas Femeninos: " + edicion1.getCantidadDeAtletasFemeninos());

        System.out.println("2 Nombre: " + edicion2.getName() + " Edicion: " + edicion2.getSeason() + " Ano: "
                + edicion2.getYear() + " Cantidad de atletas Femeninos: " + edicion2.getCantidadDeAtletasFemeninos());

        System.out.println("3 Nombre: " + edicion3.getName() + " Edicion: " + edicion3.getSeason() + " Ano: "
                + edicion3.getYear() + " Cantidad de atletas Femeninos: " + edicion3.getCantidadDeAtletasFemeninos());

        System.out.println("4 Nombre: " + edicion4.getName() + " Edicion: " + edicion4.getSeason() + " Ano: "
                + edicion4.getYear() + " Cantidad de atletas Femeninos: " + edicion4.getCantidadDeAtletasFemeninos());

        System.out.println("5 Nombre: " + edicion5.getName() + " Edicion: " + edicion5.getSeason() + " Ano: "
                + edicion5.getYear() + " Cantidad de atletas Femeninos: " + edicion5.getCantidadDeAtletasFemeninos());

        System.out.println("6 Nombre: " + edicion6.getName() + " Edicion: " + edicion6.getSeason() + " Ano: "
                + edicion6.getYear() + " Cantidad de atletas Femeninos: " + edicion6.getCantidadDeAtletasFemeninos());

        System.out.println("7 Nombre: " + edicion7.getName() + " Edicion: " + edicion7.getSeason() + " Ano: "
                + edicion7.getYear() + " Cantidad de atletas Femeninos: " + edicion7.getCantidadDeAtletasFemeninos());

        System.out.println("8 Nombre: " + edicion8.getName() + " Edicion: " + edicion8.getSeason() + " Ano: "
                + edicion8.getYear() + " Cantidad de atletas Femeninos: " + edicion8.getCantidadDeAtletasFemeninos());

        System.out.println("9 Nombre: " + edicion9.getName() + " Edicion: " + edicion9.getSeason() + " Ano: "
                + edicion9.getYear() + " Cantidad de atletas Femeninos: " + edicion9.getCantidadDeAtletasFemeninos());

        System.out.println("10 Nombre: " + edicion10.getName() + " Edicion: " + edicion10.getSeason() + " Ano: "
                + edicion10.getYear() + " Cantidad de atletas Femeninos: " + edicion10.getCantidadDeAtletasFemeninos());

    }


    static void Question4() throws ListaVaciaException, ValorNoExisteException {

        SexType s = SexType.NA;
        Scanner in = new Scanner(System.in);
        System.out.println("--------------------Pregunta 4-------------------");
        System.out.println(" ");
        System.out.println("-------------------Seleccione una opcion------------------");
        System.out.println(" ");
        System.out.println("Femenino(F)");
        System.out.println(" ");
        System.out.println("Masculino(M)");
        System.out.println(" ");
        System.out.println("Selection:");

        String i = in.next();
        if (i.equals("F")) s = SexType.F;
        else if (i.equals("M")) s = SexType.M;
        else {
            System.out.println(" ");
            System.out.println("Valor invalido");
            Question4();
        }

        if (s.equals(SexType.F)) {
            if (!finish4F) {
                Repository.preg4F();
                e1 = Repository.CompetitionsF.getAndDelete();
                e2 = Repository.CompetitionsF.getAndDelete();
                while (e1.equals(e2)) e2 = Repository.CompetitionsF.getAndDelete();
                e3 = Repository.CompetitionsF.getAndDelete();
                while (e3.equals(e2) || e3.equals(e1)) e3 = Repository.CompetitionsF.getAndDelete();
                e4 = Repository.CompetitionsF.getAndDelete();
                while (e4.equals(e3) || e4.equals(e2) || e4.equals(e1)) e4 = Repository.CompetitionsF.getAndDelete();
                e5 = Repository.CompetitionsF.getAndDelete();
                while (e5.equals(e4) || e5.equals(e3) || e5.equals(e2) || e5.equals(e1))
                    e5 = Repository.CompetitionsF.getAndDelete();
                finish4F = true;
            }
        }
        if (s.equals(SexType.M)) {
            if (!finish4M) {
                Repository.preg4M();
                ev1 = Repository.CompetitionsM.getAndDelete();
                ev2 = Repository.CompetitionsM.getAndDelete();
                while (ev1.equals(ev2)) ev2 = Repository.CompetitionsM.getAndDelete();
                ev3 = Repository.CompetitionsM.getAndDelete();
                while (ev3.equals(ev2) || ev3.equals(ev1)) ev3 = Repository.CompetitionsM.getAndDelete();
                ev4 = Repository.CompetitionsM.getAndDelete();
                while (ev4.equals(ev3) || ev4.equals(ev2) || ev4.equals(ev1))
                    ev4 = Repository.CompetitionsM.getAndDelete();
                ev5 = Repository.CompetitionsM.getAndDelete();
                while (ev5.equals(ev4) || ev5.equals(ev3) || ev5.equals(ev2) || ev5.equals(ev1))
                    ev5 = Repository.CompetitionsM.getAndDelete();
                finish4M = true;
            }
        }

        if (s.equals(SexType.F)) {
            System.out.println("Nombre: " + e1.getName() + " Sexo: Femenino " + " Cantidad: " + e1.getCantidadMujeres());
            System.out.println("Nombre: " + e2.getName() + " Sexo: Femenino " + " Cantidad: " + e2.getCantidadMujeres());
            System.out.println("Nombre: " + e3.getName() + " Sexo: Femenino " + " Cantidad: " + e3.getCantidadMujeres());
            System.out.println("Nombre: " + e4.getName() + " Sexo: Femenino " + " Cantidad: " + e4.getCantidadMujeres());
            System.out.println("Nombre: " + e5.getName() + " Sexo: Femenino " + " Cantidad: " + e5.getCantidadMujeres());
        } else if (s.equals(SexType.M)) {
            System.out.println("Nombre: " + ev1.getName() + " Sexo: Masculino " + " Cantidad: " + ev1.getCantidadHombres());
            System.out.println("Nombre: " + ev2.getName() + " Sexo: Masculino " + " Cantidad: " + ev2.getCantidadHombres());
            System.out.println("Nombre: " + ev3.getName() + " Sexo: Masculino " + " Cantidad: " + ev3.getCantidadHombres());
            System.out.println("Nombre: " + ev4.getName() + " Sexo: Masculino " + " Cantidad: " + ev4.getCantidadHombres());
            System.out.println("Nombre: " + ev5.getName() + " Sexo: Masculino " + " Cantidad: " + ev5.getCantidadHombres());
        }


    }

    static void Question5() throws ValorNoExisteException, ValorYaExisteException, ListaVaciaException {

        int cantidadMedallas;
        int cantidadCompetidores;
        boolean finish = false;
        HeapMax relacion = new HeapMax(1000000);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese ano minimo (mayor o igual a 1920)");
        int anoMinimo = scanner.nextInt();
        if (anoMinimo < 1920) {
            System.out.println("Opcion Invalida, ingrese ano minimo (mayor o igual a 1920)");
            anoMinimo = scanner.nextInt();
        }
        System.out.println("Ingrese ano maximo (menor o igual a 2016)");
        int anoMaximo = scanner.nextInt();
        if (anoMaximo > 2016) {
            System.out.println("Opcion Invalida, ingrese ano maximo (menor o igual a 2016)");
            anoMaximo = scanner.nextInt();
        }


        for (int i = 0; i < Repository.teams.size(); i++) {
            cantidadCompetidores = 0;
            cantidadMedallas = 0;

            int anoMinimoTemp = anoMinimo;

            while (anoMinimoTemp <= anoMaximo && !finish) {
                try {
                    cantidadCompetidores = cantidadCompetidores + (Integer) Repository.teams.get(i).getCompetidoresPorAno().find(anoMinimoTemp);
                    cantidadMedallas = cantidadMedallas + (Integer) Repository.teams.get(i).getMedallasPorAno().find(anoMinimoTemp);
                    anoMinimoTemp = anoMinimoTemp + 1;
                } catch (ListaVaciaException | ValorNoExisteException e) {
                    finish = true;
                }
            }
           System.out.println(cantidadCompetidores + " medallas "+ cantidadMedallas+ " equipo "+ Repository.teams.get(i).getName());
            relacion.add(new HeapNode( cantidadCompetidores / cantidadMedallas, (Team) Repository.teams.get(i)));
        }

        if (!finish5) {
          Repository.preg5();
            team1 = (Team) relacion.getAndDelete();
            team2 = (Team) relacion.getAndDelete();
            while (team1.equals(team2)) team2 = (Team) relacion.getAndDelete();
            team3 = (Team) relacion.getAndDelete();
            while (team3.equals(team2) || team3.equals(team1)) team3 = (Team) relacion.getAndDelete();
            team4 = (Team) relacion.getAndDelete();
            while (team4.equals(team3) || team4.equals(team2) || team4.equals(team1))
                team4 = (Team) relacion.getAndDelete();
            team5 = (Team) relacion.getAndDelete();
            while (team5.equals(team4) || team5.equals(team3) || team5.equals(team2) || team5.equals(team1))
                team5 = (Team) relacion.getAndDelete();
            finish5=true;
        }

        System.out.println(team1.getName());
        System.out.println(team2.getName());
        System.out.println(team3.getName());
        System.out.println(team4.getName());
        System.out.println(team5.getName());


    }
}
