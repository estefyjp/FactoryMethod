package mx.iteso.factory;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;

import Condiments.Rabanos;


public class RabanoTest {
	private Pozole pozole;
    @Before
    public void setUp(){
        pozole = mock((Pozole.class));
    }
    @Test
    public void testDescription(){
    	Pozole rabano = new Rabanos(pozole);
        when(pozole.getName()).thenReturn("Pozole Verde con Pollo");
        String desc = rabano.getName();
        assertEquals("Pozole Verde con Pollo, rabanos", desc);
    }
}
