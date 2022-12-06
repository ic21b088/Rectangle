package at.fhtw.Rectangle;

import at.fhtw.Rectangle.Controller.RectangleController;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class RectangleApplicationTests {

	@Test
	void testCalculationRectangle() {

		// Given
		RectangleController controller = new RectangleController();

		// When
		int result = controller.calcRectangle(5, 12);

		// Then
		assertEquals(result, 60);

	}

}
