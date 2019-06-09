package Utilities;

import uy.edu.um.clases.OlympicGame;

public class Questions {


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

        System.out.println("Nombre: " + temp1.getName() + " Edicion: " + temp1.getSeason() + " Ano: "
                + temp1.getYear() + " Cantidad de atletas Femeninos: " + temp1.getCantidadDeAtletasFemeninos());

        System.out.println("Nombre: " + temp2.getName() + " Edicion: " + temp2.getSeason() + " Ano: "
                + temp2.getYear() + " Cantidad de atletas Femeninos: " + temp2.getCantidadDeAtletasFemeninos());

        System.out.println("Nombre: " + temp3.getName() + " Edicion: " + temp3.getSeason() + " Ano: "
                + temp3.getYear() + " Cantidad de atletas Femeninos: " + temp3.getCantidadDeAtletasFemeninos());

        System.out.println("Nombre: " + temp4.getName() + " Edicion: " + temp4.getSeason() + " Ano: "
                + temp4.getYear() + " Cantidad de atletas Femeninos: " + temp4.getCantidadDeAtletasFemeninos());

        System.out.println("Nombre: " + temp5.getName() + " Edicion: " + temp5.getSeason() + " Ano: "
                + temp5.getYear() + " Cantidad de atletas Femeninos: " + temp5.getCantidadDeAtletasFemeninos());

        System.out.println("Nombre: " + temp6.getName() + " Edicion: " + temp6.getSeason() + " Ano: "
                + temp6.getYear() + " Cantidad de atletas Femeninos: " + temp6.getCantidadDeAtletasFemeninos());

        System.out.println("Nombre: " + temp7.getName() + " Edicion: " + temp7.getSeason() + " Ano: "
                + temp7.getYear() + " Cantidad de atletas Femeninos: " + temp7.getCantidadDeAtletasFemeninos());

        System.out.println("Nombre: " + temp8.getName() + " Edicion: " + temp8.getSeason() + " Ano: "
                + temp8.getYear() + " Cantidad de atletas Femeninos: " + temp8.getCantidadDeAtletasFemeninos());

        System.out.println("Nombre: " + temp9.getName() + " Edicion: " + temp9.getSeason() + " Ano: "
                + temp9.getYear() + " Cantidad de atletas Femeninos: " + temp9.getCantidadDeAtletasFemeninos());

        System.out.println("Nombre: " + temp10.getName() + " Edicion: " + temp10.getSeason() + " Ano: "
                + temp10.getYear() + " Cantidad de atletas Femeninos: " + temp10.getCantidadDeAtletasFemeninos());


    }
}
