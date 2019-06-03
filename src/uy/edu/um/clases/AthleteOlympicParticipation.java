package uy.edu.um.clases;

public class AthleteOlympicParticipation {

  private MedalType medal;
  private Athlete athlete;
  private  Sport sport;
  private Event event;
  private City city;
  private OlympicGame OG;


  public AthleteOlympicParticipation(MedalType medal, Athlete athlete,Sport sport, Event event, City city,  OlympicGame OG) {
    this.medal = medal;
    this.athlete=athlete;
    this.event=event;
    this.sport=sport;
    this.city=city;
    this.OG=OG;
  }

  public MedalType getMedal() {
    return medal;
  }
}
