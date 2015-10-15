package mx.iteso.factory;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;

import Condiments.Cebolla;



public class CebollaTest {
	private Pozole pozole;
    @Before
    public void setUp(){
        pozole = mock((Pozole.class));
    }
    @Test
    public void testDescription(){
    	Pozole cebolla = new Cebolla(pozole);
        when(pozole.getName()).thenReturn("Pozole Verde con Pollo");
        String desc = cebolla.getName();
        assertEquals("Pozole Verde con Pollo, cebolla", desc);
    }
}
