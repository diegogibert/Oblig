package uy.edu.um.clases;

import java.util.ArrayList;

public class AthleteOlympicParticipation {

  private ArrayList<MedalType> medal ;
  private Athlete athlete;
  private ArrayList <Sport> sport;
  private ArrayList <Event> event;
  private ArrayList <City> city;
  private ArrayList <OlympicGame> OG;
  private int cantidadOros = 0;
  private int cantidadPlatas = 0;
  private int cantidadBronces = 0;
  private int firstMedalG;
  private int lastMedalG;
  private int FirstMedalS;
  private int lastMedalS;
  private int firstMedalB;
  private int lastMedalB;

  public AthleteOlympicParticipation(ArrayList<MedalType> medal, Athlete athlete, ArrayList<Sport> sport, ArrayList<Event> event, ArrayList<City> city, ArrayList<OlympicGame> OG) {
    this.medal = medal;
    this.athlete = athlete;
    this.sport = sport;
    this.event = event;
    this.city = city;
    this.OG = OG;
  }

  public ArrayList<MedalType> getMedal() {
    return medal;
  }

  public void setMedal(ArrayList<MedalType> medal) {
    this.medal = medal;
  }

  public Athlete getAthlete() {
    return athlete;
  }

  public void setAthlete(Athlete athlete) {
    this.athlete = athlete;
  }

  public ArrayList<Sport> getSport() {
    return sport;
  }

  public void setSport(ArrayList<Sport> sport) {
    this.sport = sport;
  }

  public ArrayList<Event> getEvent() {
    return event;
  }

  public void setEvent(ArrayList<Event> event) {
    this.event = event;
  }

  public ArrayList<City> getCity() {
    return city;
  }

  public void setCity(ArrayList<City> city) {
    this.city = city;
  }

  public ArrayList<OlympicGame> getOG() {
    return OG;
  }

  public void setOG(ArrayList<OlympicGame> OG) {
    this.OG = OG;
  }

  public int getCantidadOros() {
    return cantidadOros;
  }

  public int getCantidadPlatas() {
    return cantidadPlatas;
  }

  public int getCantidadBronces() {
    return cantidadBronces;
  }

  public void setCantidadOros(int cantidadOros) {
    this.cantidadOros = cantidadOros;
  }

  public void setCantidadPlatas(int cantidadPlatas) {
    this.cantidadPlatas = cantidadPlatas;
  }

  public void setCantidadBronces(int cantidadBronces) {
    this.cantidadBronces = cantidadBronces;
  }


  public int getFirstMedalG() {
    return firstMedalG;
  }

  public void setFirstMedalG(int firstMedalG) {
    this.firstMedalG = firstMedalG;
  }

  public int getLastMedalG() {
    return lastMedalG;
  }

  public void setLastMedalG(int lastMedalG) {
    this.lastMedalG = lastMedalG;
  }

  public int getFirstMedalS() {
    return FirstMedalS;
  }

  public void setFirstMedalS(int firstMedalS) {
    FirstMedalS = firstMedalS;
  }

  public int getLastMedalS() {
    return lastMedalS;
  }

  public void setLastMedalS(int lastMedalS) {
    this.lastMedalS = lastMedalS;
  }

  public int getFirstMedalB() {
    return firstMedalB;
  }

  public void setFirstMedalB(int firstMedalB) {
    this.firstMedalB = firstMedalB;
  }

  public int getLastMedalB() {
    return lastMedalB;
  }

  public void setLastMedalB(int lastMedalB) {
    this.lastMedalB = lastMedalB;
  }
}


