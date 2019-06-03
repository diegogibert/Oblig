package Utilities;

import BinarySearchTree.BinarySearchTree;
import Hash.ElementoYaExistenteException;
import Hash.HashCerrado;
import double_linked_list.ListaVaciaException;
import double_linked_list.ValorNoExisteException;
import uy.edu.um.clases.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static uy.edu.um.clases.SexType.valueOf;

public class LoadData {

    public static void load() {
        HashCerrado NationalOlympicCommittees = new HashCerrado(231);
        HashCerrado Athletes = new HashCerrado(5000);
        BinarySearchTree Participations = new BinarySearchTree();

        BufferedReader objReader = null;
        try {

            String strCurrentLine;
            objReader = new BufferedReader(new FileReader("noc_regions.csv"));

            while ((strCurrentLine = objReader.readLine()) != null) {
                String[] vec = strCurrentLine.split(",");
                NationalOlympicCommittee temp = new NationalOlympicCommittee(vec[0], vec[1]);
                NationalOlympicCommittees.insert(temp.getNoc(), temp.getRegion());
                System.out.println(NationalOlympicCommittees.get(temp.getNoc()));

            }


            objReader = new BufferedReader(new FileReader("athlete_events.csv"));


            while ((strCurrentLine) != null) {
                String[] vec = strCurrentLine.split(",");

                //create atheletes
                long id = Long.parseLong(vec[0]);
                int age = Integer.parseInt(vec[3]);
                float height = Float.parseFloat(vec[4]);
                float weight = Float.parseFloat(vec[5]);
                NationalOlympicCommittee AtheletesNOC = new NationalOlympicCommittee(vec[6], vec[7]);

                Athlete newAthlete = new Athlete(id, vec[1], valueOf(vec[2]), age, height, weight, AtheletesNOC);
                Athletes.insert(newAthlete.getId(), newAthlete);


                //create Participation

                int year = Integer.parseInt(vec[9]);
                SeasonType st = null;
                if (vec[10].equals("Summer")) {
                    st = SeasonType.SUMMER;
                } else {
                    st = SeasonType.WINTER;
                }

                OlympicGame newOG = new OlympicGame(vec[8], year, st);
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

                AthleteOlympicParticipation AOP = new AthleteOlympicParticipation(medal, newAthlete, sport, event, city, newOG);


            }
        } catch (IOException e) {

            e.printStackTrace();


        } catch (ValorNoExisteException e) {
            e.printStackTrace();
        } catch (ElementoYaExistenteException e) {

        } finally {

            try {

                if (objReader != null) objReader.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }


    }
}
