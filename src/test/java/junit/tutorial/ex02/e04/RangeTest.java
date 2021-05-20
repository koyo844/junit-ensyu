package junit.tutorial.ex02.e04;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class RangeTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}


	@AfterEach
	void tearDown() throws Exception {
	}

	
	@Nested
	class test1{
		@BeforeEach
		//min=0.0ÅAmax=10.5ÇÃRangeÇÃÇ∆Ç´
		void setUp() throws Exception {
		Range range = new Range(0.0, 10.5);
		}
		@Test
		void exe1() {
		assertFalse(Range.contains(-0.1),"é∏îs");
		}
		@Test
		void exe2() {
			assertTrue(Range.contains(0.0),"é∏îs");
			}
		@Test
		void exe3() {
			assertTrue(Range.contains(10.5),"é∏îs");
			}
		@Test
		void exe4() {
			assertFalse(Range.contains(10.6),"é∏îs");
			}
	}
	@Nested
	class test2{
		@BeforeEach
		//min=-5.1ÅAmax=5.1ÇÃRangeÇÃÇ∆Ç´
		void setUp() throws Exception {
			Range range = new Range(-5.1, 5.1);
		}
		@Test
		void exe1() {
			assertFalse(Range.contains(-5.2),"é∏îs");
		}
		@Test
		void exe2() {
			assertTrue(Range.contains(-5.1),"é∏îs");
			}
		@Test
		void exe3() {
			assertTrue(Range.contains(5.1),"é∏îs");
			}
		@Test
		void exe4() {
			assertFalse(Range.contains(5.2),"é∏îs");
		}
	}

}
