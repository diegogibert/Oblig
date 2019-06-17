package Utilities;

import BinarySearchTree.BinarySearchTree;
import BinarySearchTree.ValorYaExisteException;
import Hash.HashCerrado;
import double_linked_list.ListaVaciaException;
import double_linked_list.ValorNoExisteException;
import heap.HeapMax;
import heap.HeapNode;
import uy.edu.um.clases.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LoadData {
    private static BinarySearchTree<String, String> NationalOlympicCommittees = new BinarySearchTree<String, String>();
    private static BinarySearchTree<Long, Athlete> Athletes = new BinarySearchTree<Long, Athlete>();
    static HeapMax<Integer, OlympicGame> OlympicGames = new HeapMax<>(1000000);
    private static HeapMax<Integer, OlympicGame> OlympicGames0 = new HeapMax<>(1000000);
    private static HeapMax<Integer, Event> Competitions0F = new HeapMax<>(100000);
    static HeapMax<Integer, Event> CompetitionsF = new HeapMax<>(100000);
    private static HeapMax<Integer, Event> Competitions0M = new HeapMax<>(100000);
    static HeapMax<Integer, Event> CompetitionsM = new HeapMax<>(1000000);
    static HashCerrado<Long, AthleteOlympicParticipation> athleteOP = new HashCerrado<>(500);
    static HeapMax<Integer, Long> medallistasOro = new HeapMax<>(1000000);
    static HeapMax<Integer, Long> medallistasBronce = new HeapMax<>(1000000);
    static HeapMax<Integer, Long> medallistasPlata = new HeapMax<>(1000000);
    static HeapMax<Integer, Long> medallistas = new HeapMax<>(1000000);
    private static int counter = 0;
    private static int medidor1 = 0;
    private static int medidor2 = 0;
    private static int medidor3 = 0;
    private static int cantidadCompetidores = 0;
    private static int cantidadMedallas = 0;
    static ArrayList<Team> teams = new ArrayList<>(1000);


    public static void load() throws ValorNoExisteException, IOException {
        BufferedReader objReader = null;

        try {

            String strCurrentLine;

            objReader = new BufferedReader(new FileReader("noc_regions.csv"));

            while ((strCurrentLine = objReader.readLine()) != null) {   //anda bien

                String[] vec = strCurrentLine.split(",");
                NationalOlympicCommittee temp = new NationalOlympicCommittee(vec[0], vec[1]);
                try {
                    NationalOlympicCommittees.insert(temp.getNoc(), temp.getRegion());
                } catch (ValorYaExisteException e) {
                    e.printStackTrace();
                }
            }


            objReader = new BufferedReader(new FileReader("athlete_events.csv"));
            String strCurrentLine2 = objReader.readLine();
            strCurrentLine2.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");

            while ((strCurrentLine2 = objReader.readLine()) != null) {

                String[] vec = strCurrentLine2.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");

                long id = Long.parseLong(vec[0].substring(1, vec[0].length() - 1));
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
                Team team = new Team(vec[6]);

                if (!teams.contains(team)) teams.add(team);

                NationalOlympicCommittee AtheletesNOC = new NationalOlympicCommittee(vec[6], vec[7]);
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
                if (vec[10].equals("Summer")) {
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

                Athlete newAthlete = new Athlete(id, vec[1], sex, age, height, weight, AtheletesNOC);
                try {
                    Athletes.insert(newAthlete.getId(), newAthlete);
                } catch (ValorYaExisteException ignored) {

                }
                OlympicGame newOG = new OlympicGame(vec[8], year, st);


                //preg 5

                if (teams.contains(team)) {
                    int temp = 0;
                    while (!teams.get(temp).equals(team)) temp++;
                    team = teams.get(temp);

                    BinarySearchTree competidoresPorAno = team.getCompetidoresPorAno();
                    BinarySearchTree medallasPorAno = team.getMedallasPorAno();
//                    try {
//                        System.out.println(competidoresPorAno.find(2001));
//                    } catch (ListaVaciaException e) {
//                        e.printStackTrace();
//                    }  A TODOS LOS ANOS LE AGREGA 

                    try {
                        team.setCompetidoresPorAno(year, 1);
                    } catch (ValorYaExisteException e) {
                        try {
                            cantidadCompetidores = (Integer) competidoresPorAno.find(year);

                            competidoresPorAno.delete(year);

                        } catch (ListaVaciaException ignored) {}

                        try {
                            competidoresPorAno.insert(year, cantidadCompetidores + 1);

//                           System.out.println(team.getName() + "equipo" + year + "competidores" + competidoresPorAno.find(year));
                        } catch (ValorYaExisteException  ignored) {
                        }


                        if (!medal.equals(MedalType.NA)) {
                            try {
                                team.setMedallasPorAno(year, 1);
                            } catch (ValorYaExisteException g) {

                                try {
                                    cantidadMedallas = (Integer) medallasPorAno.find(year);
                                    medallasPorAno.delete(year);
                                } catch (ListaVaciaException ignored) {
                                }
                                try {
                                    medallasPorAno.insert(year, cantidadMedallas + 1);

//                                System.out.println("team" + team.getName() + "ano" + year + " medallas " + medallasPorAno.find(year));
                                } catch (ValorYaExisteException ignored) {
                                }
                            }
                        }
                    }
                    cantidadMedallas = 0;
                    cantidadCompetidores = 0;

                }


                //preg 3

                if (sex.equals(SexType.F) && !OlympicGames0.belongs(newOG))
                    OlympicGames0.add(new HeapNode<>(newOG.getCantidadDeAtletasFemeninos(), newOG));
                else if (sex.equals(SexType.F) && OlympicGames0.belongs(newOG)) {
                    OlympicGame og = OlympicGames0.get(newOG);
                    og.setCantidadDeAtletasFemeninos(og.getCantidadDeAtletasFemeninos() + 1);
                    OlympicGames.add(new HeapNode<>(og.getCantidadDeAtletasFemeninos(), og));
                }

                //preg 4

                if (sex.equals(SexType.F) && !Competitions0F.belongs(event))
                    Competitions0F.add(new HeapNode<>(event.getCantidadMujeres(), event));
                else if (sex.equals(SexType.F) && Competitions0F.belongs(event)) {
                    Event e = Competitions0F.get(event);
                    e.setCantidadMujeres(e.getCantidadMujeres() + 1);
                    CompetitionsF.add(new HeapNode<>(e.getCantidadMujeres(), e));
                }

                if (sex.equals(SexType.M) && !Competitions0M.belongs(event)) {
                    Competitions0M.add(new HeapNode<>(event.getCantidadHombres(), event));
                } else if (sex.equals(SexType.M) && Competitions0M.belongs(event)) {
                    Event e = Competitions0M.get(event);
                    e.setCantidadHombres(e.getCantidadHombres() + 1);
                    CompetitionsM.add(new HeapNode<>(e.getCantidadHombres(), e));
                }


                //preg 1 abajo
                if (athleteOP.belongs(id)) {
                    AthleteOlympicParticipation temp = athleteOP.get(id);
                    temp.getCity().add(city);
                    temp.getEvent().add(event);
                    temp.getOG().add(new OlympicGame(vec[8], year, st));
                    temp.getSport().add(sport);
                    if (medal == MedalType.GOLD) {
                        temp.setCantidadOros(temp.getCantidadOros() + 1);
                        if (medidor1 == 0) {
                            temp.setFirstMedalG(year);
                            medidor1 = 1;
                        }
                        temp.setLastMedalG(year);
                    }
                    if (medal == MedalType.BRONZE) {
                        temp.setCantidadBronces(temp.getCantidadBronces() + 1);
                        if (medidor3 == 0) {
                            temp.setFirstMedalB(year);
                            medidor3 = 1;
                        }
                        temp.setLastMedalB(year);
                    }
                    if (medal == MedalType.SILVER) {
                        temp.setCantidadPlatas(temp.getCantidadPlatas() + 1);
                        if (medidor2 == 0) {
                            temp.setFirstMedalS(year);
                            medidor2 = 1;
                        }
                        temp.setLastMedalS(year);

                    }
                } else {
                    ArrayList<MedalType> vecMedal = new ArrayList<>();
                    ArrayList<Sport> vecSport = new ArrayList<>();
                    ArrayList<Event> vecEvent = new ArrayList<>();
                    ArrayList<City> vecCity = new ArrayList<>();
                    ArrayList<OlympicGame> vecOG = new ArrayList<>();

                    vecMedal.add(medal);
                    vecCity.add(city);
                    vecEvent.add(event);
                    vecOG.add(new OlympicGame(vec[8], year, st));
                    vecSport.add(sport);
                    athleteOP.insert(id, new AthleteOlympicParticipation(vecMedal, newAthlete, vecSport, vecEvent, vecCity, vecOG));
                    AthleteOlympicParticipation temp = athleteOP.get(id);

                    if (medal == MedalType.GOLD) {
                        temp.setCantidadOros(1);
                        temp.setFirstMedalG(year);
                        medidor1 = 1;
                    }
                    if (medal == MedalType.BRONZE) {
                        temp.setCantidadBronces(1);
                        temp.setFirstMedalB(year);
                        medidor3 = 1;
                    }
                    if (medal == MedalType.SILVER) {
                        temp.setCantidadPlatas(1);
                        temp.setFirstMedalS(year);
                        medidor2 = 1;
                    }
                    counter++;
                }
            }
            for (long c = 1; c <= counter; c++) {
                AthleteOlympicParticipation temp = athleteOP.get(c);
                if (temp.getCantidadOros() != 0) {
                    medallistasOro.add(new HeapNode<>(temp.getCantidadOros(), c));
                }
                if (temp.getCantidadPlatas() != 0) {
                    medallistasPlata.add(new HeapNode<>(temp.getCantidadPlatas(), c));
                }
                if (temp.getCantidadBronces() != 0) {
                    medallistasBronce.add(new HeapNode<>(temp.getCantidadBronces(), c));
                }
                int total = temp.getCantidadOros() + temp.getCantidadBronces() + temp.getCantidadPlatas();
                if (total != 0) {
                    medallistas.add(new HeapNode<>(total, c));
                }
            }


        } catch (IOException | ValorNoExisteException e) {

            e.printStackTrace();


        } finally {

            try {
                //libero memoria que no se usa
                OlympicGames0 = null;
                Competitions0F = null;
                Competitions0M = null;


                if (objReader != null) objReader.close();


            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }


    }
}
