package Utilities;

import Hash.HashCerrado;
import double_linked_list.ValorNoExisteException;
import heap.HeapMax;
import heap.HeapNode;
import uy.edu.um.clases.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LoadData {
    protected static HashCerrado NationalOlympicCommittees = new HashCerrado(10000);
    protected static HashCerrado Athletes = new HashCerrado(50000);
    protected static HeapMax OlympicGames = new HeapMax(100000);
    private static HeapMax OlympicGames0 = new HeapMax(100000);
    private static HeapMax Competitions0F = new HeapMax(100000);
    protected static HeapMax CompetitionsF = new HeapMax(100000);
    private static HeapMax Competitions0M = new HeapMax(100000);
    protected static HeapMax CompetitionsM = new HeapMax(1000000);
    protected static HeapMax OlympicGames0 = new HeapMax(100000);
    protected static HashCerrado athleteOP = new HashCerrado(500);

    public HashCerrado getNationalOlympicCommittees() {
        return NationalOlympicCommittees;
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
                int i= 0;
                i++;

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

                if (sex.equals(SexType.F) && !OlympicGames0.belongs(newOG)) {
                    OlympicGames0.add(new HeapNode(1, newOG));
                } else if (sex.equals(SexType.F) && OlympicGames0.belongs(newOG)) {
                    OlympicGame og=  (OlympicGame) OlympicGames0.get(newOG);
                    og.setCantidadDeAtletasFemeninos(og.getCantidadDeAtletasFemeninos() +1);
                    OlympicGames.add(new HeapNode(og.getCantidadDeAtletasFemeninos() + 1, og));
                }

                //preg 1 abajo
                ArrayList vecMedal = new ArrayList<MedalType>();
                ArrayList vecSport = new ArrayList<Sport>();
                ArrayList vecEvent = new ArrayList<Event>();
                ArrayList vecCity = new ArrayList<City>();
                ArrayList vecOG = new ArrayList<OlympicGame>();

                if (sex.equals(SexType.F) && !Competitions0F.belongs(event)) {
                    Competitions0F.add(new HeapNode(event.getCantidadMujeres(), event));

                } else if (sex.equals(SexType.F) && Competitions0F.belongs(event)) {
                    Event e=  (Event) Competitions0F.get(event);
                    e.setCantidadMujeres(e.getCantidadMujeres() +1);
                    CompetitionsF.add(new HeapNode(e.getCantidadMujeres() + 1, e));

                }

                if (sex.equals(SexType.M) && !Competitions0M.belongs(event)) {
                    Competitions0M.add(new HeapNode(event.getCantidadHombres(), event));
                } else if (sex.equals(SexType.M) && Competitions0M.belongs(event)) {
                    Event e=  (Event) Competitions0M.get(event);
                    e.setCantidadHombres(e.getCantidadHombres() +1);
                    CompetitionsM.add(new HeapNode(e.getCantidadHombres() + 1, e));
                }





                if(athleteOP.belongs(id)){
                    AthleteOlympicParticipation temp = (AthleteOlympicParticipation)athleteOP.get(id);
                    temp.getCity().add(city);
                    temp.getEvent().add(event);
                    temp.getOG().add(new OlympicGame(vec[1],year, st));
                    temp.getSport().add(sport);
                    if(medal == MedalType.GOLD){
                        temp.setCantidadOros(temp.getCantidadOros() + 1);
                    } else if (medal == MedalType.BRONZE){
                        temp.setCantidadBronces(temp.getCantidadBronces() + 1);
                    } else if (medal == MedalType.SILVER) {
                        temp.setCantidadPlatas(temp.getCantidadBronces() + 1);
                    }
                }else{
                    vecMedal.add(medal);
                    vecCity.add(city);
                    vecEvent.add(event);
                    vecOG.add(new OlympicGame(vec[1],year, st));
                    vecSport.add(sport);
                    athleteOP.insert(id, new AthleteOlympicParticipation(vecMedal, newAthlete, vecSport, vecEvent, vecCity, vecOG));
                }



            }
        } catch (IOException e) {

            e.printStackTrace();


        } catch (ValorNoExisteException e) {
            e.printStackTrace();
        } finally {

            try {

                if (objReader != null) objReader.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }



    }
}
