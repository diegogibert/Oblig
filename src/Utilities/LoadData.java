package Utilities;
import Hash.HashCerrado;
import double_linked_list.ValorNoExisteException;
import uy.edu.um.clases.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class LoadData {
    static HashCerrado<Integer, Athlete> atletas = new HashCerrado(140000);
    static HashCerrado<String, NationalOlympicCommittee> NationalOlympicCommittees = new HashCerrado<>(200000);
    static ArrayList<String> nocs= new ArrayList<>(3000);


    public static void load() {


        BufferedReader objReader = null;

        try {
            String Line;

            objReader = new BufferedReader(new FileReader("noc_regions.csv"));

            while ((Line = objReader.readLine()) != null) {   //anda bien
                String[] vec = Line.split(",");

                    NationalOlympicCommittees.insert(vec[0], new NationalOlympicCommittee(vec[0], vec[1]));

            }

            objReader = new BufferedReader(new FileReader("athlete_events.csv"));
            String strCurrentLine2 = objReader.readLine();
            strCurrentLine2.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");

            while ((strCurrentLine2 = objReader.readLine()) != null) {

                String[] vec = strCurrentLine2.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");

                int id = Integer.parseInt(vec[0].substring(1, vec[0].length() - 1));

                int age;
                try {
                    age = Integer.parseInt(vec[3]);
                } catch (NumberFormatException e) {
                    age = 0;
                }

                float height;
                try {
                    height = Float.parseFloat(vec[4]);
                } catch (NumberFormatException e) {
                    height = 0;
                }

                float weight;
                try {
                    weight = Float.parseFloat(vec[5]);
                } catch (NumberFormatException e) {
                    weight = 0;
                }

                Team team = new Team(vec[6].substring(1, vec[6].length() - 1));

                SexType sex = SexType.NA;
                if ((vec[2].substring(1, vec[2].length() - 1)).equals("F")) {
                    sex = SexType.F;
                } else if ((vec[2].substring(1, vec[2].length() - 1)).equals("M")) {
                    sex = SexType.M;
                }

                int year;
                try {
                    year = Integer.parseInt(vec[9]);
                } catch (NumberFormatException e) {
                    year = 0;
                }

                SeasonType st;
                if (vec[10].substring(1, vec[10].length() - 1).equals("Summer")) {
                    st = SeasonType.SUMMER;
                } else {
                    st = SeasonType.WINTER;
                }

                City city = new City(vec[11]);
                Sport sport = new Sport(vec[12]);
                Event event = new Event(vec[13]);

                MedalType medal = MedalType.NA;
                switch ((vec[14].substring(1, vec[14].length() - 1))) {
                    case "Gold":
                        medal = MedalType.GOLD;
                        break;
                    case "Silver":
                        medal = MedalType.SILVER;
                        break;
                    case "Bronze":
                        medal = MedalType.BRONZE;
                        break;
                }

                OlympicGame newOG = new OlympicGame(vec[8], year, st);
                String noc = vec[7].substring(1, vec[7].length() - 1);
                if (noc.equals("SGP")) {
                    noc = "SIN";
                }

                if (!atletas.belongs(id)) {
                    Athlete newAthlete = new Athlete(id, vec[1], sex, age, height, weight);
                    newAthlete.getAtleteOP().add(new AthleteOlympicParticipation(medal, sport, event, city, newOG, team));

                    try {
                        newAthlete.setNOC(NationalOlympicCommittees.get(noc));
                        if(!nocs.contains(NationalOlympicCommittees.get(noc).getNoc())) {
                            nocs.add(NationalOlympicCommittees.get(noc).getNoc());
//                            System.out.println(nocs.size());
                        }

                    } catch (NullPointerException | ValorNoExisteException e) {
                        newAthlete.setNOC(new NationalOlympicCommittee("UNK", "Unknown"));
                        if(!nocs.contains(NationalOlympicCommittees.get(noc))) nocs.add("UNK");
                    }
                    atletas.insert(id, newAthlete);
                } else {
                    Athlete temp = atletas.get(id);
                    temp.getAtleteOP().add(new AthleteOlympicParticipation(medal, sport, event, city, newOG, team));
                }

            }

        } catch (IOException | ValorNoExisteException  e) {
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
