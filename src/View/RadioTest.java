package View;

import Model.Radio;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class RadioTest {

        @Test
    public void testForward() {
            Radio radio = new Radio("AM", 0, true);
            radio.Forward();
            int estacion = radio.getAMActualStation();
            assertEquals(540,estacion);

        }


        @Test
    public void testBackward() {
        Radio radio = new Radio("AM", 0, true);
        radio.Backward();
        int estacion = radio.getAMActualStation();
        assertEquals(1610,estacion);

    }

    @Test
    public void testOFF() {
        Radio radio = new Radio("AM", 0, true);
        radio.off();
        assertFalse(radio.isOn());

    }


}
