import BinarySearchTree.BinarySearchTree;
import BinarySearchTree.ValorYaExisteException;
import Hash.ElementoYaExistenteException;
import Hash.HashCerrado;
import heap.HeapNode;
import uy.edu.um.clases.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import static uy.edu.um.clases.SexType.valueOf;

public class Principal {

    public static void main(String[] args) {



        BufferedReader objReader = null;

        try {

            String strCurrentLine;
            objReader = new BufferedReader(new FileReader("noc_regions.csv"));

            while ((strCurrentLine = objReader.readLine()) != null) {
                String[] vec = strCurrentLine.split(",");
                NationalOlympicCommittee temp = new NationalOlympicCommittee(vec[0], vec[1]);
                Questions.NationalOlympicCommittees.insert(temp.getNoc(), temp.getRegion());
            }


           objReader=new BufferedReader(new FileReader("athlete_events.csv"));


            while ((strCurrentLine)!=null){
                String[] vec = strCurrentLine.split(",");

                //create atheletes
                    long id = Long.parseLong(vec[0]);
                    int  age = Integer.parseInt(vec[3]);
                    float height = Float.parseFloat(vec[4]);
                    float weight = Float.parseFloat(vec[5]);

                    NationalOlympicCommittee AtheletesNOC= new NationalOlympicCommittee(vec[6],vec[7]);

                    Athlete newAthlete = new Athlete (id, vec[1], valueOf(vec[2]), age,
                        height, weight,AtheletesNOC);
                    Questions.Athletes.insert(newAthlete.getId(),newAthlete);

                //create Participation

                    int year= Integer.parseInt(vec[9]);
                    SeasonType st=null;
                    if(vec[10].equals("Summer")) {
                        st = SeasonType.SUMMER;
                    } else {
                        st= SeasonType.WINTER;
                    }

                OlympicGame newOG= new OlympicGame(vec[8], year, st);
                City city= new City(vec[11]);
                Sport sport= new Sport(vec[12]);
                Event event= new Event(vec[13]);
                MedalType medal= MedalType.NA;


                if(vec[14].equals("Gold")){
                    medal=MedalType.GOLD;
                } else if (vec[14].equals("Silver")) {
                    medal=MedalType.SILVER;
                } else if(vec[14].equals("Bronze")){
                    medal= MedalType.BRONZE;
                }

                AthleteOlympicParticipation AOP= new AthleteOlympicParticipation(medal,newAthlete,sport,event,city,newOG);

                //

                try {
                    Questions.Participations.insert(newAthlete.getId(),AOP);

                } catch (ValorYaExisteException e) {
                    if(AOP.getMedal().equals(MedalType.GOLD)){
                        newAthlete.setGoldMedals(newAthlete.getGoldMedals()+1);
                    } else if (AOP.getMedal().equals(MedalType.SILVER)){
                        newAthlete.setSilverMedals(newAthlete.getSilverMedals()+1);
                    } else if(AOP.getMedal().equals(MedalType.BRONZE)){
                        newAthlete.setBronzeMedals(newAthlete.getSilverMedals()+1);
                    }
                }


            }
        } catch (IOException | ElementoYaExistenteException e ) {

            e.printStackTrace();

        } finally {

            try {

                if (objReader != null) objReader.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        try {
            new Menu();
        } catch (InputMismatchException e){
            System.out.println("Ingrese una opcion valida");
            new Menu();
        }







    }
}
