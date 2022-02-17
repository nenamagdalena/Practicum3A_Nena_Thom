package Practicum3A;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VoetbalclubTest {

    @Test
    void clubnaamIsNull() {
        Voetbalclub v1 = new Voetbalclub("");
        Voetbalclub v2 = new Voetbalclub(null);

        assertEquals("FC", v1.getClubnaam(), "Clubnaam was leeg en FC is gebruikt.");
        assertEquals("FC", v2.getClubnaam(), "Clubnaam was null en FC is gebruikt.");

    }

    @Test
    void clubnaamNietNull() {
        Voetbalclub v3 = new Voetbalclub("Ajax");

        assertEquals("Ajax", v3.getClubnaam(), "Clubnaam is Ajax en Ajax is gebruikt." );
    }

}