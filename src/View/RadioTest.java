package View;

import Model.Radio;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RadioTest {

        @Test
    public void testFoward() {
            Radio radio = new Radio("AM", 0, true);
            radio.Forward();
            int estacion = radio.getAMActualStation();
            assertEquals(540,estacion);

        }


}
