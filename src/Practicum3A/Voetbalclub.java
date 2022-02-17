package Practicum3A;

public class Voetbalclub {

    private String naam;
    private int aantalGewonnen;
    private int aantalGelijk;
    private int aantalVerloren;

    public Voetbalclub(String nm) {
        if (nm == null || nm == "") {
            naam = "FC";
        } else {
            naam = nm;
        }
    }

    public String getClubnaam() {
        return naam;
    }

    public int aantalGespeeld() {
        return aantalGewonnen + aantalGelijk + aantalVerloren;
    }

    public void verwerkResultaat(char ch) {
        if (ch == 'w' || ch == 'g' || ch == 'v') {
            if (ch == 'w')
                aantalGewonnen = aantalGewonnen + 1;
            if (ch == 'g')
                aantalGelijk = aantalGelijk + 1;
            if (ch == 'v')
                aantalVerloren = aantalVerloren + 1;
        } else {
            ;
        }
    }

    public int aantalPunten() {
        return aantalGewonnen*3 + aantalGelijk;
    }

    public String toString() {
        String s = naam + " " + aantalGespeeld() + " " + aantalGewonnen + " "  + aantalGelijk + " " + aantalVerloren + " " + aantalPunten();
        return s;
    }
}
