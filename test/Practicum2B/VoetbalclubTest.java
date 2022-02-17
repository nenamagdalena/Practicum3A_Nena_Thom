package Practicum2B;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class VoetbalclubTest {
    private Voetbalclub v1;
    @BeforeEach
    public void init() {
        v1 = new Voetbalclub("Test");
    }
    @Test
    void testClubnaamCorrect(){
        assertEquals("Test", v1.getClubNaam());
    }
    @Test
    void testClubnaamNietNull(){
        Voetbalclub v2 = new Voetbalclub(null);
        assertEquals("FC", v2.getClubNaam());
    }
    @Test
    void testClubnaamNietLeeg(){
        Voetbalclub v2 = new Voetbalclub("");
        assertEquals("FC", v2.getClubNaam());
    }


    @Test
    void testPuntenTellingCorrecteInvoer(){
        v1.verwerkResultaat('w');
        assertEquals(3, v1.aantalPunten());
        v1.verwerkResultaat('g');
        assertEquals(4, v1.aantalPunten());
        v1.verwerkResultaat('v');
        assertEquals(4, v1.aantalPunten());
    }

    @Test
    void testPuntentellingIncorrectNietMeegeteld(){
        v1.verwerkResultaat('t');
        assertEquals(0, v1.aantalGespeeld(), "Incorrecte invoer is foutief meegeteld");
    }

    @Test
    void testString(){
        v1.verwerkResultaat('w');
        v1.verwerkResultaat('g');
        v1.verwerkResultaat('v');
        assertEquals("Test 3 1 1 1 4", v1.toString());
    }




}