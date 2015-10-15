package mx.iteso.factory;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;

import Condiments.Col;

public class ColTest {
	private Pozole pozole;
    @Before
    public void setUp(){
        pozole = mock((Pozole.class));
    }
    @Test
    public void testDescription(){
    	Pozole col = new Col(pozole);
        when(pozole.getName()).thenReturn("Pozole Verde con Pollo");
        String desc = col.getName();
        assertEquals("Pozole Verde con Pollo, col", desc);
    }
}
