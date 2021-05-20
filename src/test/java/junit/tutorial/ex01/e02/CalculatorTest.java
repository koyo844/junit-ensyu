package junit.tutorial.ex01.e02;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	//��O�����̃e�X�g
	/* �������Ŕ�������ł��낤��O�̃N���X���w��FIllegalArgumentException.class
	 * �������Ńe�X�g�Ώۂ̏��������s�F() ->calc.divide(3, 0)
	 */
	void test1() {
		Calculator calc =new Calculator();
		assertThrows(IllegalArgumentException.class, () ->calc.divide(3, 0));
	}

}
