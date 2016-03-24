package ap;
//Copyright Wintriss Technical Schools 2013

import static org.junit.Assert.*;

import org.junit.Test;

import ap.HorseBarn;

public class Horses2012 {
	
	@Test 
	public void testHorseObject() throws Exception {
		HorseImpl horse = new HorseImpl("Trigger", 1340);
		assertEquals("Trigger", horse.getName());
		assertEquals(1340, horse.getWeight());
	}

	@Test
	public void testSetUpSpaces() throws Exception {
		HorseBarn horseBarn = HorseBarn.createTestBarn();
		horseBarn.initializeHorses();
		assertEquals("Trigger", horseBarn.getSpaces()[0].getName());
		assertEquals("Silver", horseBarn.getSpaces()[2].getName());
		assertEquals("Lady", horseBarn.getSpaces()[3].getName());
		assertEquals("Patches", horseBarn.getSpaces()[5].getName());
		assertEquals("Duke", horseBarn.getSpaces()[6].getName());
	}

	


	@Test
	public void testPartA() throws Exception {
		HorseBarn horseBarn = HorseBarn.createTestBarn();
		assertEquals(0, horseBarn.findHorseSpace("Trigger"));// 0 A horse named Trigger is in space 0.
		assertEquals(2, horseBarn.findHorseSpace("Silver")); // 2 A horse named Silver is in space 2.
		assertEquals(-1, horseBarn.findHorseSpace("Coco"));// -1 A horse named Coco is not in the barn
	}
	
	// 8. try to solve part (b) on paper
	
	@Test
	public void testPartB() throws Exception {
		HorseBarn horseBarn = HorseBarn.createTestBarn();
		horseBarn.consolidate();
		assertEquals("Trigger", horseBarn.getSpaces()[0].getName());
		assertEquals("Silver", horseBarn.getSpaces()[1].getName());
		assertEquals("Lady", horseBarn.getSpaces()[2].getName());
		assertEquals("Patches", horseBarn.getSpaces()[3].getName());
		assertEquals("Duke", horseBarn.getSpaces()[4].getName());
	}
	
	

}




