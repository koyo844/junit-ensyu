package junit.tutorial.ex01.e03;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class CounterTest {

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

	//incrementmする前にカウンター
	/*事前条件の
	 * beforeeach
	 * nested:クラスの中にクラスをかくアノテーション
	 *　
	 */
	Counter counter;

	@Nested
	//初期状態
	class test1{
		@BeforeEach
		void setUp() throws Exception {
			counter = new Counter();
		}
		@Test
		void exe1(){
			assertEquals(1,counter.increment(),"失敗");
		}
	
	}
	
	@Nested
	//一回実行
	class test2{
		@BeforeEach
		void setUp() throws Exception {
			counter = new Counter();
			counter.increment();
		}
		
		@Test
		void exe2(){
			assertEquals(2,counter.increment(),"失敗");
		}

	}
	
	@Nested
	//一回実行
	class test3{
		@BeforeEach
		void setUp() throws Exception {
			counter = new Counter();
			for (int i=1;i<=50;i++) {
			counter.increment();  // 50回
			}
		}
		@Test
		void exe3(){
			assertEquals(51,counter.increment(),"失敗");
		}

	}


}
