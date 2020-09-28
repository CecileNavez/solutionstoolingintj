package be.abis.exb9.test;

import be.abis.exb9.model.Person;
import org.junit.Test;
import java.time.LocalDate;

import static org.junit.Assert.*;

public class TestPerson {

	@Test
	public void testCalculateAge() {
		Person p2 = new Person(2,"John","Doe",LocalDate.of(1967, 8, 10));
		assertEquals(p2.calculateAge(),53);
	}

}
