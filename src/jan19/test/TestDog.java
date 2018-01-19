package jan19.test;

import static org.junit.Assert.*;
import org.junit.Test;
import jan19.Dog;

public class TestDog {

	@Test(expected = IllegalArgumentException.class)
	public void testBadEmptyDogName() {
		Dog dog = new Dog("");
		assertTrue(true);
	}

	@Test
	public void testGoodDogName() {
		Dog dog = new Dog("Ragnar");
		assertTrue(dog.getDogName().equals("Ragnar"));
	}
}
