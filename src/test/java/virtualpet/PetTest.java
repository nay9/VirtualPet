package virtualpet;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PetTest {

	@Test
	public void hungerShouldReturn100() {
		// Arrange
		Pet underTest = new Pet("", "", 100);
		// Act
		int answer = underTest.getPetHunger();
		// Assert
		assertEquals(answer, 100);

	}

	@Test
	public void hungerShouldReturn90() {
		// Arrange
		Pet underTest = new Pet("", "", 100);
		// Act
		int answer = underTest.feedPet(10);
		// Assert
		assertEquals(answer, 90);

	}
	
	@Test
	public void zeroHungerShouldReturnFalse() {
		// Arrange
		Pet underTest = new Pet("", "", 0, true);
		// Act
		boolean answer = underTest.petAlive();
		// Assert
		assertEquals(answer, false);

	}
	
	@Test
	public void feedWhenHungerEquals0ShouldReturn0() {
		// Arrange
		Pet underTest = new Pet("", "", 0, true);
		// Act
		int answer = underTest.feedPet();
		// Assert
		assertEquals(answer, 0);

	}
}