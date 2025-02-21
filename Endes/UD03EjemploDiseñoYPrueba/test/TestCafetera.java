import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TestCafetera {

	@Test
	void testTC1() {
		ClaseCafetera c = new ClaseCafetera();
		assertEquals(1000, c.getCapacidadMaxima());
		assertEquals(0, c.getCantidadActual());
	}

	@Test
	void testTC02() {
		ClaseCafetera c = new ClaseCafetera(3000);
		assertEquals(3000, c.getCapacidadMaxima());
		assertEquals(0, c.getCantidadActual());
	}

	@Test
	void testTC03() {
		ClaseCafetera c = new ClaseCafetera(1000, 100);
		assertEquals(1000, c.getCapacidadMaxima());
		assertEquals(100, c.getCantidadActual());
	}

	@Test
	void testTC04() {
		ClaseCafetera c = new ClaseCafetera(100, 100);
		assertEquals(100, c.getCapacidadMaxima());
		assertEquals(100, c.getCantidadActual());
	}

	@Test
	void testTC05() {
		ClaseCafetera c = new ClaseCafetera(500, 100);
		assertEquals(500, c.getCapacidadMaxima());
		assertEquals(100, c.getCantidadActual());
	}

	@Test
	void testTC06() {
		ClaseCafetera c = new ClaseCafetera();
		c.setCapacidadMaxima(500);
		c.setCantidadActual(350);
		assertEquals(500, c.getCapacidadMaxima());
		assertEquals(350, c.getCantidadActual());
	}

	@Test
	void testTC07() {
		ClaseCafetera c = new ClaseCafetera();
		c.setCapacidadMaxima(350);
		c.setCantidadActual(500);
		assertEquals(350, c.getCapacidadMaxima());
		assertEquals(350, c.getCantidadActual());
	}

	@Test
	void testTC09() {
		ClaseCafetera c = new ClaseCafetera(500, 350);
		c.servirTaza(100);
		assertEquals(250, c.getCantidadActual());
	}

	@Test
	void testTC10() {
		ClaseCafetera c = new ClaseCafetera(350, 500);
		c.setCapacidadMaxima(0);
		assertEquals(0, c.getCapacidadMaxima());
		assertEquals(0, c.getCantidadActual());
	}

	@Test
	void testTC11() {
		ClaseCafetera c = new ClaseCafetera(500, 350);
		c.setCapacidadMaxima(0);
		assertEquals(0, c.getCapacidadMaxima());
		assertEquals(0, c.getCantidadActual());
	}
}
