package Practicum3A;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VoetbalclubTest {

    @Test
    void clubnaamIsNull() {
        Voetbalclub v1 = new Voetbalclub("");
        Voetbalclub v2 = new Voetbalclub(null);

        assertEquals("FC", v1.getClubnaam(), "Clubnaam was leeg en er is geen FC is gebruikt.");
        assertEquals("FC", v2.getClubnaam(), "Clubnaam was null en er is geen FC is gebruikt.");

    }

    @Test
    void clubnaamNietNull() {
        Voetbalclub v3 = new Voetbalclub("Ajax");

        assertEquals("Ajax", v3.getClubnaam(), "Clubnaam is Ajax en er is geen Ajax gebruikt." );
    }

    @Test
    void puntentellingNietBeïnvloed() {
        Voetbalclub v4 = new Voetbalclub("Test");

        v4.verwerkResultaat('w');
        assertEquals(3, v4.aantalPunten(), "Punten komen niet overeen met de verwachte waarde." );
        v4.verwerkResultaat('o');
        assertEquals(3, v4.aantalPunten(), "Ander character dan w,g,v beïnvloed de punten telling.");
        v4.verwerkResultaat('v');
        assertEquals(3, v4.aantalPunten(), "Punten komen niet overeen met de verwachte waarde." );
        v4.verwerkResultaat('g');
        assertEquals(4, v4.aantalPunten(), "Punten komen niet overeen met de verwachte waarde." );
    }

    @Test
    void aantalGespeeldNietBeïnvloed() {
        Voetbalclub v5 = new Voetbalclub("Test");

        v5.verwerkResultaat('w');
        assertEquals(1, v5.aantalGespeeld(), "Aantal gespeelde wedstrijden komen niet overeen.");
        v5.verwerkResultaat('o');
        assertEquals(1, v5.aantalGespeeld(), "Aantal gespeelde wedstrijden komen niet overeen.");
        v5.verwerkResultaat('v');
        assertEquals(2, v5.aantalGespeeld(), "Aantal gespeelde wedstrijden komen niet overeen.");

    }

    @Test
    void stringRepresentatieTest() {
        Voetbalclub v6 = new Voetbalclub("FC Utrecht");

        v6.verwerkResultaat('w');
        v6.verwerkResultaat('w');
        v6.verwerkResultaat('g');
        assertEquals("FC Utrecht 3 2 1 0 7", v6.toString(), "String method komt niet overeen met de verwachte string.");


    }

}