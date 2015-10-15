package mx.iteso.factory.stores;

import static org.mockito.Mockito.mock;

import org.junit.Before;
import org.junit.Test;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.PozoleStore;

public class AllPozoleTest {
AllPozoleStore allpozole;
	@Before
	public void SetUp(){
        allpozole = mock((AllPozoleStore.class));
	}
	
	/*@Test
	public void PozoleBlancoTest(){
		Pozole pozoleBlancoCachete = new allpozole.createPozole("Blanco", "cachete");
	}*/
}
