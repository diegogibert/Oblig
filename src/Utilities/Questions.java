package Utilities;

import double_linked_list.ListaVaciaException;
import double_linked_list.ValorNoExisteException;
import heap.HeapMax;
import heap.HeapNode;
import uy.edu.um.clases.*;

import java.util.Scanner;

class Questions {
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
            for (int j = 0; j < 10; j++) {
                Long id = LoadData.medallistasOro.getAndDelete();
                AthleteOlympicParticipation at = LoadData.athleteOP.get(id);
                System.out.println(" Nombre Atleta: " + at.getAthlete().getName() + " Cantidad de Oros: " + at.getCantidadOros() + " Sexo del altleta: " + at.getAthlete().getSex() + " Año min: " + at.getFirstMedalG() + " Año max: " + at.getLastMedalG());
            }
        }
        if (m.equals(MedalType.SILVER)) {
            for (int j = 0; j < 10; j++) {
                Long id = LoadData.medallistasPlata.getAndDelete();
                AthleteOlympicParticipation at = LoadData.athleteOP.get(id);
                System.out.println(" Nombre Atleta: " + at.getAthlete().getName() + " Cantidad de Platas: " + at.getCantidadPlatas() + " Sexo del altleta: " + at.getAthlete().getSex() + " Año min: " + at.getFirstMedalS() + " Año max: " + at.getLastMedalS());
            }
        }
        if (m.equals(MedalType.BRONZE)) {
            for (int j = 0; j < 10; j++) {
                Long id = LoadData.medallistasBronce.getAndDelete();
                AthleteOlympicParticipation at = LoadData.athleteOP.get(id);
                System.out.println(" Nombre Atleta: " + at.getAthlete().getName() + " Cantidad de Bronces: " + at.getCantidadBronces() + " Sexo del altleta: " + at.getAthlete().getSex() + " Año min: " + at.getFirstMedalB() + " Año max: " + at.getLastMedalB());
            }
        }
        if (t.equals("T")) {
            for (int j = 0; j < 10; j++) {
                Long id = LoadData.medallistas.getAndDelete();
                AthleteOlympicParticipation at = LoadData.athleteOP.get(id);
                int total = at.getCantidadOros() + at.getCantidadBronces() + at.getCantidadPlatas();
                System.out.println(" Nombre Atleta: " + at.getAthlete().getName() + " Cantidad Total: " + total + " Sexo del altleta: " + at.getAthlete().getSex() + " Año min: " + " Año max: ");
            }
        }
    }

    public static void Question2() throws ListaVaciaException, ValorNoExisteException {
        Scanner di = new Scanner ( System.in );
        System.out.println("Oro(O), Plata(P), Bronce(B) o Todas(T)?");
        String i=di.next();
        if(i.equals("O")){
            Repository.preg2();

        } else {
            System.out.println("Valor invalido");
            Question1();
        }
    }

    static void Question3() throws ListaVaciaException {
        System.out.println("--------------------Pregunta 3-------------------");
        System.out.println(" ");

        OlympicGame temp1 = LoadData.OlympicGames.getAndDelete();
        OlympicGame temp2 = LoadData.OlympicGames.getAndDelete();
        while (temp1.equals(temp2)) temp2 = LoadData.OlympicGames.getAndDelete();
        OlympicGame temp3 = LoadData.OlympicGames.getAndDelete();
        while (temp3.equals(temp2) || temp3.equals(temp1))
            temp3 = LoadData.OlympicGames.getAndDelete();
        OlympicGame temp4 = LoadData.OlympicGames.getAndDelete();
        while (temp4.equals(temp3) || temp4.equals(temp2) || temp4.equals(temp1))
            temp4 = LoadData.OlympicGames.getAndDelete();
        OlympicGame temp5 = LoadData.OlympicGames.getAndDelete();
        while (temp5.equals(temp4) || temp5.equals(temp3) || temp5.equals(temp2) || temp5.equals(temp1))
            temp5 = LoadData.OlympicGames.getAndDelete();
        OlympicGame temp6 = LoadData.OlympicGames.getAndDelete();
        while (temp6.equals(temp5) || temp6.equals(temp4) || temp6.equals(temp3) || temp6.equals(temp2) || temp6.equals(temp1))
            temp6 = LoadData.OlympicGames.getAndDelete();
        OlympicGame temp7 = LoadData.OlympicGames.getAndDelete();
        while (temp7.equals(temp6) || temp7.equals(temp5) || temp7.equals(temp4) || temp7.equals(temp3) || temp7.equals(temp2) || temp7.equals(temp1))
            temp7 = LoadData.OlympicGames.getAndDelete();
        OlympicGame temp8 = LoadData.OlympicGames.getAndDelete();
        while (temp8.equals(temp7) || temp8.equals(temp6) || temp8.equals(temp5) || temp8.equals(temp4) || temp8.equals(temp3) || temp8.equals(temp2) || temp8.equals(temp1))
            temp8 = LoadData.OlympicGames.getAndDelete();
        OlympicGame temp9 = LoadData.OlympicGames.getAndDelete();
        while (temp9.equals(temp8) || temp9.equals(temp7) || temp9.equals(temp6) || temp9.equals(temp5) || temp9.equals(temp4) || temp9.equals(temp3) || temp9.equals(temp2) || temp9.equals(temp1))
            temp9 = LoadData.OlympicGames.getAndDelete();
        OlympicGame temp10 = LoadData.OlympicGames.getAndDelete();
        while (temp10.equals(temp9) || temp10.equals(temp8) || temp10.equals(temp7) || temp10.equals(temp6) || temp10.equals(temp5) || temp10.equals(temp4) || temp10.equals(temp3) || temp10.equals(temp2) || temp10.equals(temp1))
            temp10 = LoadData.OlympicGames.getAndDelete();


        //falta algoritmo que los ordene y ta

        System.out.println("1 Nombre: " + temp1.getName() + " Edicion: " + temp1.getSeason() + " Ano: "
                + temp1.getYear() + " Cantidad de atletas Femeninos: " + temp1.getCantidadDeAtletasFemeninos());

        System.out.println("2 Nombre: " + temp2.getName() + " Edicion: " + temp2.getSeason() + " Ano: "
                + temp2.getYear() + " Cantidad de atletas Femeninos: " + temp2.getCantidadDeAtletasFemeninos());

        System.out.println("3 Nombre: " + temp3.getName() + " Edicion: " + temp3.getSeason() + " Ano: "
                + temp3.getYear() + " Cantidad de atletas Femeninos: " + temp3.getCantidadDeAtletasFemeninos());

        System.out.println("4 Nombre: " + temp4.getName() + " Edicion: " + temp4.getSeason() + " Ano: "
                + temp4.getYear() + " Cantidad de atletas Femeninos: " + temp4.getCantidadDeAtletasFemeninos());

        System.out.println("5 Nombre: " + temp5.getName() + " Edicion: " + temp5.getSeason() + " Ano: "
                + temp5.getYear() + " Cantidad de atletas Femeninos: " + temp5.getCantidadDeAtletasFemeninos());

        System.out.println("6 Nombre: " + temp6.getName() + " Edicion: " + temp6.getSeason() + " Ano: "
                + temp6.getYear() + " Cantidad de atletas Femeninos: " + temp6.getCantidadDeAtletasFemeninos());

        System.out.println("7 Nombre: " + temp7.getName() + " Edicion: " + temp7.getSeason() + " Ano: "
                + temp7.getYear() + " Cantidad de atletas Femeninos: " + temp7.getCantidadDeAtletasFemeninos());

        System.out.println("8 Nombre: " + temp8.getName() + " Edicion: " + temp8.getSeason() + " Ano: "
                + temp8.getYear() + " Cantidad de atletas Femeninos: " + temp8.getCantidadDeAtletasFemeninos());

        System.out.println("9 Nombre: " + temp9.getName() + " Edicion: " + temp9.getSeason() + " Ano: "
                + temp9.getYear() + " Cantidad de atletas Femeninos: " + temp9.getCantidadDeAtletasFemeninos());

        System.out.println("10 Nombre: " + temp10.getName() + " Edicion: " + temp10.getSeason() + " Ano: "
                + temp10.getYear() + " Cantidad de atletas Femeninos: " + temp10.getCantidadDeAtletasFemeninos());


    }


    static void Question4() throws ListaVaciaException {
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
            Event e1 = LoadData.CompetitionsF.getAndDelete();
            Event e2 = LoadData.CompetitionsF.getAndDelete();
            while (e1.equals(e2)) e2 = LoadData.CompetitionsF.getAndDelete();
            Event e3 = LoadData.CompetitionsF.getAndDelete();
            while (e3.equals(e2) || e3.equals(e1)) e3 = LoadData.CompetitionsF.getAndDelete();
            Event e4 = LoadData.CompetitionsF.getAndDelete();
            while (e4.equals(e3) || e4.equals(e2) || e4.equals(e1)) e4 = LoadData.CompetitionsF.getAndDelete();
            Event e5 = LoadData.CompetitionsF.getAndDelete();
            while (e5.equals(e4) || e5.equals(e3) || e5.equals(e2) || e5.equals(e1))
                e5 = LoadData.CompetitionsF.getAndDelete();

            System.out.println("Nombre: " + e1.getName() + " Sexo: Femenino " + " Cantidad: " + e1.getCantidadMujeres());
            System.out.println("Nombre: " + e2.getName() + " Sexo: Femenino " + " Cantidad: " + e2.getCantidadMujeres());
            System.out.println("Nombre: " + e3.getName() + " Sexo: Femenino " + " Cantidad: " + e3.getCantidadMujeres());
            System.out.println("Nombre: " + e4.getName() + " Sexo: Femenino " + " Cantidad: " + e4.getCantidadMujeres());
            System.out.println("Nombre: " + e5.getName() + " Sexo: Femenino " + " Cantidad: " + e5.getCantidadMujeres());
        }

        if (s.equals(SexType.M)) {
            Event e1 = LoadData.CompetitionsM.getAndDelete();
            Event e2 = LoadData.CompetitionsM.getAndDelete();
            while (e1.equals(e2)) e2 = LoadData.CompetitionsM.getAndDelete();
            Event e3 = LoadData.CompetitionsM.getAndDelete();
            while (e3.equals(e2) || e3.equals(e1)) e3 = LoadData.CompetitionsM.getAndDelete();
            Event e4 = LoadData.CompetitionsM.getAndDelete();
            while (e4.equals(e3) || e4.equals(e2) || e4.equals(e1)) e4 = LoadData.CompetitionsM.getAndDelete();
            Event e5 = LoadData.CompetitionsM.getAndDelete();
            while (e5.equals(e4) || e5.equals(e3) || e5.equals(e2) || e5.equals(e1))
                e5 = LoadData.CompetitionsM.getAndDelete();

            System.out.println("Nombre: " + e1.getName() + " Sexo: Femenino " + " Cantidad: " + e1.getCantidadHombres());
            System.out.println("Nombre: " + e2.getName() + " Sexo: Femenino " + " Cantidad: " + e2.getCantidadHombres());
            System.out.println("Nombre: " + e3.getName() + " Sexo: Femenino " + " Cantidad: " + e3.getCantidadHombres());
            System.out.println("Nombre: " + e4.getName() + " Sexo: Femenino " + " Cantidad: " + e4.getCantidadHombres());
            System.out.println("Nombre: " + e5.getName() + " Sexo: Femenino " + " Cantidad: " + e5.getCantidadHombres());
        }


    }

    static void Question5() {
        int cantidadMedallas=0;
        int cantidadCompetidores=0;
        boolean finish=false;
        HeapMax relacion= new HeapMax(1500);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese ano minimo (mayor o igual a 1920)");
        int anoMinimo= scanner.nextInt();
        if (anoMinimo < 1920){
            System.out.println("Opcion Invalida, ingrese ano minimo (mayor o igual a 1920)");
            anoMinimo = scanner.nextInt();
        }
        System.out.println("Ingrese ano maximo (menor o igual a 2016)");
        int anoMaximo = scanner.nextInt();
        if (anoMaximo > 2016){
            System.out.println("Opcion Invalida, ingrese ano maximo (menor o igual a 2016)");
            anoMaximo = scanner.nextInt();
        }


        for(int i=0; i<LoadData.teams.size(); i++){
            cantidadCompetidores=0;
            cantidadMedallas=0;
            int anoMinimoTemp=anoMinimo;
            while(anoMinimoTemp<=anoMaximo && !finish) {
                try {
                    cantidadCompetidores=cantidadCompetidores +(Integer) LoadData.teams.get(i).getCompetidoresPorAno().find(anoMinimoTemp);
                    cantidadMedallas=cantidadMedallas+ (Integer) LoadData.teams.get(i).getMedallasPorAno().find(anoMinimoTemp);
                    anoMinimoTemp=anoMinimoTemp+1;
                } catch (ListaVaciaException| ValorNoExisteException e) {
                    finish=true;
                }
            }
            relacion.add(new HeapNode(cantidadMedallas/cantidadCompetidores, (Team) LoadData.teams.get(i) ));
        }

        try {

            Team temp1=(Team) relacion.getAndDelete();
            Team temp2=(Team) relacion.getAndDelete();
            Team temp3=(Team) relacion.getAndDelete();
            Team temp4=(Team) relacion.getAndDelete();
            Team temp5=(Team) relacion.getAndDelete();
            System.out.println(temp1.getName());
            System.out.println(temp2.getName());
            System.out.println(temp3.getName());
            System.out.println(temp4.getName());
            System.out.println(temp5.getName());

        } catch (ListaVaciaException e) {
            e.printStackTrace();
        }


    }
}
