package Utilities;

import BinarySearchTree.BinarySearchTree;
import Hash.ElementoYaExistenteException;
import Hash.HashCerrado;
import double_linked_list.ListaVaciaException;
import double_linked_list.ValorNoExisteException;
import heap.HeapMax;
import heap.HeapNode;
import uy.edu.um.clases.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static uy.edu.um.clases.SexType.valueOf;

public class LoadData {
    protected static HashCerrado NationalOlympicCommittees = new HashCerrado(10000);
    protected static HashCerrado Athletes = new HashCerrado(50000);
    protected static HeapMax OlympicGames = new HeapMax(100);

    public HashCerrado getNationalOlympicCommittees() {
        return NationalOlympicCommittees;
    }

    public HashCerrado getAthletes() {
        return Athletes;
    }

    public HeapMax getOlympicGames() {
        return OlympicGames;
    }

    public static void load() {
        BufferedReader objReader = null;

        try {

            String strCurrentLine;

            objReader = new BufferedReader(new FileReader("noc_regions.csv"));

            while ((strCurrentLine = objReader.readLine()) != null) {   //anda bien
                String[] vec = strCurrentLine.split(",");
                NationalOlympicCommittee temp = new NationalOlympicCommittee(vec[0], vec[1]);
                NationalOlympicCommittees.insert(temp.getNoc(), temp.getRegion());



            }


            objReader = new BufferedReader(new FileReader("athlete_events.csv"));
            String strCurrentLine2 = objReader.readLine();
            strCurrentLine2.split(",");

            while ((strCurrentLine2 = objReader.readLine()) != null) {
                String[] vec = strCurrentLine2.split(",");

                long id = Long.parseLong(vec[0].substring(1, vec[0].length() - 1));
                int age ;
                try {
                    age = Integer.parseInt(vec[3]);
                } catch (NumberFormatException e){
                    age=0;
                }
                float height;
                try {
                    height = Float.parseFloat(vec[4]);
                } catch( NumberFormatException e){
                    height=0;
                }
                float weight;
                try{
                    weight=Float.parseFloat(vec[5]);
                } catch( NumberFormatException e){
                    weight=0;
                }
                NationalOlympicCommittee AtheletesNOC = new NationalOlympicCommittee(vec[6], vec[7]);
                SexType sex = null;
                if ((vec[2].substring(1,vec[2].length()-1)).equals("F")){
                    sex = SexType.F;
                } else if ((vec[2].substring(1,vec[2].length()-1)).equals("M")) {
                    sex = SexType.M;
                } else {
                    sex = SexType.NA;
                }

                int year;
                try {
                     year= Integer.parseInt(vec[9]);
                } catch(NumberFormatException e){
                    year= 0;
                }
                SeasonType st = null;
                if (vec[10].equals("Summer")) {
                    st = SeasonType.SUMMER;
                } else {
                    st = SeasonType.WINTER;
                }
                City city = new City(vec[11]);
                Sport sport = new Sport(vec[12]);
                Event event = new Event(vec[13]);
                MedalType medal = MedalType.NA;


                if (vec[14].equals("Gold")) {
                    medal = MedalType.GOLD;
                } else if (vec[14].equals("Silver")) {
                    medal = MedalType.SILVER;
                } else if (vec[14].equals("Bronze")) {
                    medal = MedalType.BRONZE;
                }

                Athlete newAthlete = new Athlete(id, vec[1], sex, age, height, weight, AtheletesNOC);
                Athletes.insert(newAthlete.getId(), newAthlete);
                OlympicGame newOG = new OlympicGame(vec[8], year, st);
                AthleteOlympicParticipation AOP = new AthleteOlympicParticipation(medal, newAthlete, sport, event, city, newOG);

                if (sex.equals(SexType.F) && !OlympicGames.belongs(newOG)) {
                    newOG.setCantidadDeAtletasFemeninos(newOG.getCantidadDeAtletasFemeninos() + 1);
                    HeapNode temp = new HeapNode(newOG.getCantidadDeAtletasFemeninos(), newOG);
                    OlympicGames.add(temp);
                } else if (sex.equals(SexType.F) && OlympicGames.belongs(newOG)) {
                    newOG.setCantidadDeAtletasFemeninos(newOG.getCantidadDeAtletasFemeninos() + 1);
                } else if (sex.equals(SexType.M)) {
                    newOG.setCantidadDeAtletasMasculinos(newOG.getCantidadDeAtletasMasculinos() + 1);
                } else {
                    newOG.setCantidadDeAtletasOtros(newOG.getCantidadDeAtletasOtros() + 1);
                }




            }
        } catch (IOException e) {

            e.printStackTrace();


        }  finally {

            try {

                if (objReader != null) objReader.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }



    }
}
