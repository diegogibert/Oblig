package Utilities;

import double_linked_list.ValorNoExisteException;
import uy.edu.um.clases.*;

import java.util.Scanner;

public class Questions {
//    public static void Question1() throws ValorNoExisteException {
//        MedalType m=MedalType.NA;
//        String t = "N";
//        Scanner di = new Scanner ( System.in );
//        System.out.println("Oro(O), Plata(P), Bronce(B) o Todas(T)?");
//        String i=di.next();
//        if(i.equals("O")) m= MedalType.GOLD;
//        else if(i.equals("P")) m=MedalType.SILVER;
//        else if(i.equals("B")) m=MedalType.BRONZE;
//        else if(i.equals("T")) t = "T";
//        else {
//            System.out.println("Valor invalido");
//            Question1();
//        }
//        if(m.equals(MedalType.GOLD)){
//           for(int j=0; j < 10; j++){
//               Long id = (Long)LoadData.medallistasOro.getAndDelete();
//               AthleteOlympicParticipation at =  (AthleteOlympicParticipation)LoadData.athleteOP.get(id);
//               System.out.println(" Nombre Atleta: " + at.getAthlete().getName() + " Cantidad de Oros: " + at.getCantidadOros() + " Sexo del altleta: " + at.getAthlete().getSex() + " Año min: " + at.getFirstMedal() + " Año max: " + at.getLastMedal());
//           }
//        }
//        if(m.equals(MedalType.SILVER)){
//            for(int j=0; j < 10; j++){
//                Long id = (Long)LoadData.medallistasPlata.getAndDelete();
//                AthleteOlympicParticipation at =  (AthleteOlympicParticipation)LoadData.athleteOP.get(id);
//                System.out.println(" Nombre Atleta: " + at.getAthlete().getName() + " Cantidad de Platas: " + at.getCantidadPlatas() + " Sexo del altleta: " + at.getAthlete().getSex() + " Año min: " + at.getFirstMedal() + " Año max: " + at.getLastMedal());
//            }
//        }
//        if(m.equals(MedalType.BRONZE)){
//            for(int j=0; j < 10; j++){
//                Long id = (Long)LoadData.medallistasBronce.getAndDelete();
//                AthleteOlympicParticipation at =  (AthleteOlympicParticipation)LoadData.athleteOP.get(id);
//                System.out.println(" Nombre Atleta: " + at.getAthlete().getName() + " Cantidad de Bronces: " + at.getCantidadBronces() + " Sexo del altleta: " + at.getAthlete().getSex() + " Año min: " + at.getFirstMedal() + " Año max: " + at.getLastMedal());
//            }
//        }
//        if(t.equals("T")){
//            for(int j=0; j < 10; j++){
//                Long id = (Long)LoadData.medallistas.getAndDelete();
//                AthleteOlympicParticipation at =  (AthleteOlympicParticipation)LoadData.athleteOP.get(id);
//                int total = at.getCantidadOros() + at.getCantidadBronces() + at.getCantidadPlatas();
//                System.out.println(" Nombre Atleta: " + at.getAthlete().getName() + " Cantidad Total: " + total + " Sexo del altleta: " + at.getAthlete().getSex() + " Año min: " + at.getFirstMedal() + " Año max: " + at.getLastMedal());
//            }
//        }
//    }

    //lo de imprimir en pantalla luego se haria con un for porque al ordenarlo hay que poner en lista


    public static void Question3() {
        //con esto me aseguro que sean los 10 primeros sin repetirse
        OlympicGame temp1 = (OlympicGame) LoadData.OlympicGames.getAndDelete();
        OlympicGame temp2 = (OlympicGame) LoadData.OlympicGames.getAndDelete();
        while(temp2.equals(temp1)) temp2=(OlympicGame) LoadData.OlympicGames.getAndDelete();
        OlympicGame temp3 = (OlympicGame) LoadData.OlympicGames.getAndDelete();
        while(temp3.equals(temp2) || temp3.equals(temp1) ) temp3=(OlympicGame) LoadData.OlympicGames.getAndDelete();
        OlympicGame temp4 = (OlympicGame) LoadData.OlympicGames.getAndDelete();
        while(temp4.equals(temp3) || temp4.equals(temp2) || temp4.equals(temp1)) temp4=(OlympicGame) LoadData.OlympicGames.getAndDelete();
        OlympicGame temp5 = (OlympicGame) LoadData.OlympicGames.getAndDelete();
        while(temp5.equals(temp4) || temp5.equals(temp3) || temp5.equals(temp2) || temp5.equals(temp1)) temp5=(OlympicGame) LoadData.OlympicGames.getAndDelete();
        OlympicGame temp6 = (OlympicGame) LoadData.OlympicGames.getAndDelete();
        while(temp6.equals(temp5) || temp6.equals(temp4) || temp6.equals(temp3) || temp6.equals(temp2)||temp6.equals(temp1) ) temp6=(OlympicGame) LoadData.OlympicGames.getAndDelete();
        OlympicGame temp7 = (OlympicGame) LoadData.OlympicGames.getAndDelete();
        while(temp7.equals(temp6) || temp7.equals(temp5) || temp7.equals(temp4) || temp7.equals(temp3)||temp7.equals(temp2) || temp7.equals(temp1) ) temp7=(OlympicGame) LoadData.OlympicGames.getAndDelete();
        OlympicGame temp8 = (OlympicGame) LoadData.OlympicGames.getAndDelete();
        while(temp8.equals(temp7) || temp8.equals(temp6) || temp8.equals(temp5) || temp8.equals(temp4)||temp8.equals(temp3) || temp8.equals(temp2) || temp8.equals(temp1) ) temp8=(OlympicGame) LoadData.OlympicGames.getAndDelete();
        OlympicGame temp9 = (OlympicGame) LoadData.OlympicGames.getAndDelete();
        while(temp9.equals(temp8) || temp9.equals(temp7) || temp9.equals(temp6) || temp9.equals(temp5)||temp9.equals(temp4) || temp9.equals(temp3) ||temp9.equals(temp2)|| temp9.equals(temp1) ) temp9=(OlympicGame) LoadData.OlympicGames.getAndDelete();
        OlympicGame temp10 = (OlympicGame) LoadData.OlympicGames.getAndDelete();
        while(temp10.equals(temp9) || temp10.equals(temp8) || temp10.equals(temp7) || temp10.equals(temp6)||temp10.equals(temp5) || temp10.equals(temp4) || temp10.equals(temp3)|| temp10.equals(temp2)|| temp10.equals(temp1) ) temp10=(OlympicGame) LoadData.OlympicGames.getAndDelete();


        //falta algoritmo que los ordene y ta

        System.out.println("1 Nombre: " + temp1.getName() + " Edicion: " + temp1.getSeason() + " Ano: "
                + temp1.getYear() + " Cantidad de atletas Femeninos: " + temp1.getCantidadDeAtletasFemeninos());

        System.out.println("2 Nombre: " + temp2.getName() + " Edicion: " + temp2.getSeason() + " Ano: "
                + temp2.getYear() + " Cantidad de atletas Femeninos: " + temp2.getCantidadDeAtletasFemeninos());

        System.out.println("3 Nombre: " + temp3.getName() + " Edicion: " + temp3.getSeason() + " Ano: "
                + temp3.getYear() + " Cantidad de atletas Femeninos: " + temp3.getCantidadDeAtletasFemeninos());

        System.out.println("4 Nombre: " + temp4.getName() + " Edicion: " + temp4.getSeason() + " Ano: "
                + temp4.getYear() + " Cantidad de atletas Femeninos: " + temp4.getCantidadDeAtletasFemeninos());

        System.out.println("Nombre: " + temp5.getName() + " Edicion: " + temp5.getSeason() + " Ano: "
                + temp5.getYear() + " Cantidad de atletas Femeninos: " + temp5.getCantidadDeAtletasFemeninos());

        System.out.println("5 Nombre: " + temp6.getName() + " Edicion: " + temp6.getSeason() + " Ano: "
                + temp6.getYear() + " Cantidad de atletas Femeninos: " + temp6.getCantidadDeAtletasFemeninos());

        System.out.println("6 Nombre: " + temp7.getName() + " Edicion: " + temp7.getSeason() + " Ano: "
                + temp7.getYear() + " Cantidad de atletas Femeninos: " + temp7.getCantidadDeAtletasFemeninos());

        System.out.println("7 Nombre: " + temp8.getName() + " Edicion: " + temp8.getSeason() + " Ano: "
                + temp8.getYear() + " Cantidad de atletas Femeninos: " + temp8.getCantidadDeAtletasFemeninos());

        System.out.println("8 Nombre: " + temp9.getName() + " Edicion: " + temp9.getSeason() + " Ano: "
                + temp9.getYear() + " Cantidad de atletas Femeninos: " + temp9.getCantidadDeAtletasFemeninos());

        System.out.println("9 Nombre: " + temp10.getName() + " Edicion: " + temp10.getSeason() + " Ano: "
                + temp10.getYear() + " Cantidad de atletas Femeninos: " + temp10.getCantidadDeAtletasFemeninos());


    }


    public static void Question4(){
        SexType s=SexType.NA;
        Scanner in = new Scanner ( System.in );
        System.out.println("Femenino o Masculino? (F o M)");
        String i=in.next();
        if(i.equals("F")) s= SexType.F;
        else if(i.equals("M")) s=SexType.M;
        else {
            System.out.println("Valor invalido");
            Question4();
        }
        //falta algoritmo que los ordene y ta

        if(s.equals(SexType.F)){
            Event e1= (Event) LoadData.CompetitionsF.getAndDelete();
            Event e2= (Event) LoadData.CompetitionsF.getAndDelete();
            while(e1.equals(e2)) e2= (Event) LoadData.CompetitionsF.getAndDelete();
            Event e3= (Event) LoadData.CompetitionsF.getAndDelete();
            while(e3.equals(e2) || e3.equals(e1)) e3= (Event) LoadData.CompetitionsF.getAndDelete();
            Event e4= (Event) LoadData.CompetitionsF.getAndDelete();
            while(e4.equals(e3) || e4.equals(e2) || e4.equals(e1)) e4= (Event) LoadData.CompetitionsF.getAndDelete();
            Event e5= (Event) LoadData.CompetitionsF.getAndDelete();
            while(e5.equals(e4) || e5.equals(e3) || e5.equals(e2) || e5.equals(e1)) e5= (Event) LoadData.CompetitionsF.getAndDelete();

            System.out.println("Nombre: "+ e1.getName() + " Sexo: Femenino " + " Cantidad: " + e1.getCantidadMujeres());
            System.out.println("Nombre: "+ e2.getName() + " Sexo: Femenino " + " Cantidad: " + e2.getCantidadMujeres());
            System.out.println("Nombre: "+ e3.getName() + " Sexo: Femenino " + " Cantidad: " + e3.getCantidadMujeres());
            System.out.println("Nombre: "+ e4.getName() + " Sexo: Femenino " + " Cantidad: " + e4.getCantidadMujeres());
            System.out.println("Nombre: "+ e5.getName() + " Sexo: Femenino " + " Cantidad: " + e5.getCantidadMujeres());
        }

        if(s.equals(SexType.M)){
            Event e1= (Event) LoadData.CompetitionsM.getAndDelete();
            Event e2= (Event) LoadData.CompetitionsM.getAndDelete();
            while(e1.equals(e2)) e2= (Event) LoadData.CompetitionsM.getAndDelete();
            Event e3= (Event) LoadData.CompetitionsM.getAndDelete();
            while(e3.equals(e2) || e3.equals(e1)) e3= (Event) LoadData.CompetitionsM.getAndDelete();
            Event e4= (Event) LoadData.CompetitionsM.getAndDelete();
            while(e4.equals(e3) || e4.equals(e2) || e4.equals(e1)) e4= (Event) LoadData.CompetitionsM.getAndDelete();
            Event e5= (Event) LoadData.CompetitionsM.getAndDelete();
            while(e5.equals(e4) || e5.equals(e3) || e5.equals(e2) || e5.equals(e1)) e5= (Event) LoadData.CompetitionsM.getAndDelete();

            System.out.println("Nombre: "+ e1.getName() + " Sexo: Femenino " + " Cantidad: " + e1.getCantidadHombres());
            System.out.println("Nombre: "+ e2.getName() + " Sexo: Femenino " + " Cantidad: " + e2.getCantidadHombres());
            System.out.println("Nombre: "+ e3.getName() + " Sexo: Femenino " + " Cantidad: " + e3.getCantidadHombres());
            System.out.println("Nombre: "+ e4.getName() + " Sexo: Femenino " + " Cantidad: " + e4.getCantidadHombres());
            System.out.println("Nombre: "+ e5.getName() + " Sexo: Femenino " + " Cantidad: " + e5.getCantidadHombres());
        }



    }
}
