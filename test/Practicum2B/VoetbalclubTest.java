package Practicum2B;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VoetbalclubTest {
    @Test
    void testClubnaamNietNull(){
        Voetbalclub v1 = new Voetbalclub("");
        assertEquals("Ajax", v1.getClubNaam());

    }
}