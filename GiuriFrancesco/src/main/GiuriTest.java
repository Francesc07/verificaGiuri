package main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GiuriTest {

	GiuriClass g=new GiuriClass();
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		g=new GiuriClass();
	}

	@Test
	void testGiuriMet1() {
		assertEquals(2187, g.giuriMet(3, 7));
	}
	
	@Test
	void testGiuriMet2() {
		assertEquals(0, g.giuriMet(0, 1));
	}
	
	@Test
	void testGiuriMet3() {
		assertEquals(1, g.giuriMet(0,0));
	}

}
