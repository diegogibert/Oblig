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
  private int cantidadNA = 0;
  private int firstMedal;
  private int lastMedal;

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

  public int getCantidadNA() {
    return cantidadNA;
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

  public void setCantidadNA(int cantidadNA) {
    this.cantidadNA = cantidadNA;
  }

  public int getFirstMedal() {
    return firstMedal;
  }

  public void setFirstMedal(int firstMedal) {
    this.firstMedal = firstMedal;
  }

  public int getLastMedal() {
    return lastMedal;
  }

  public void setLastMedal(int lastMedal) {
    this.lastMedal = lastMedal;
  }
}


