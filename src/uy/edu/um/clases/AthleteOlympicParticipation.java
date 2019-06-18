package uy.edu.um.clases;

public class AthleteOlympicParticipation {

    private MedalType medal;
    private Sport sport;
    private Event event;
    private City city;
    private OlympicGame OG;
    private Team team;

    public AthleteOlympicParticipation(MedalType medal, Sport sport, Event event, City city, OlympicGame OG,Team team) {
        this.medal = medal;
        this.sport = sport;
        this.event = event;
        this.city = city;
        this.OG = OG;
        this.team=team;
    }

    public Team getTeam() { return team; }

    public MedalType getMedal() {
        return medal;
    }

    public void setMedal(MedalType medal) {
        this.medal = medal;
    }

    public Sport getSport() {
        return sport;
    }

    public void setSport(Sport sport) {
        this.sport = sport;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public OlympicGame getOG() {
        return OG;
    }

    public void setOG(OlympicGame OG) {
        this.OG = OG;
    }
}


