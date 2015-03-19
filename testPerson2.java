package edu.uz.issi.lab.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import edu.uz.issi.lab.Person;

public class TestPerson2 {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}
	
	@Test
	public void testHashCode() {
		fail("Not yet implemented");
	}

	@Test
	public void testPersonStringStringInt() {
		assertNotNull(new Person("John", "Smith", 231));
	}

	@Test
	public void testEqualsObject() {
		assertEquals(new Person("Jan", "Nowak", 10), new Person("Jan", "Nowak", 10));
		assertNotEquals(new Person("Jan", "owak", 10), new Person("Jan", "Nowak", 10));
		assertFalse(new Person("Jan", "owak", 10).equals(new Person("Jan", "Nowak", 10)));
	}

	

	@Test
	public void testToString() {
		assertEquals("Person [firstName=Jan, lastName=Kowalski, age=31]", 
				new Person("Jan", "Kowalski", 31).toString());
		assertEquals("Person [firstName=U, lastName=U, age=0]", new Person().toString());
		
	}

	@Test
	public void testGetInitials() {
		fail("Not yet implemented");
	}

}
