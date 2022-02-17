package Practicum2B;

public class Voetbalclub {
    private int aantalGewonnen;
    private int aantalGelijk;
    private int aantalVerloren;
    private String clubNaam;

    public Voetbalclub(String naam){
        clubNaam = naam;
    }

    public int aantalGespeeld(){
        return aantalGelijk + aantalGewonnen + aantalVerloren;
    }
    public int aantalPunten(){
        return 3 * aantalGewonnen + aantalGelijk;
    }

    public String getClubNaam(){
        if (clubNaam == null || clubNaam == "") return "FC";
        else return clubNaam;
    }

    public void verwerkResultaat(char ch) {
        if (ch == 'w')
            aantalGewonnen = aantalGewonnen + 1;
        if (ch == 'g')
            aantalGelijk = aantalGelijk + 1;
        if (ch == 'v')
            aantalVerloren = aantalVerloren + 1;
    }
    public String toString(){
        return clubNaam + " " + aantalGespeeld() + " " + aantalGewonnen + " " + aantalGelijk + " " + aantalVerloren + " " + aantalPunten();
    }
}
