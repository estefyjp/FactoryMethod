package mx.iteso.factory;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;

import Condiments.Oregano;

public class OreganoTest {
	private Pozole pozole;
    @Before
    public void setUp(){
        pozole = mock((Pozole.class));
    }
    @Test
    public void testDescription(){
    	Pozole oregano = new Oregano(pozole);
        when(pozole.getName()).thenReturn("Pozole Verde con Pollo");
        String desc = oregano.getName();
        assertEquals("Pozole Verde con Pollo, oregano", desc);
    }
}
