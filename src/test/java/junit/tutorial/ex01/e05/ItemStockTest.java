package junit.tutorial.ex01.e05;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import junit.tutorial.ex01.e03.Counter;

class ItemStockTest {

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

	//ItemStockクラスをnewする
	ItemStock itemStock = new ItemStock();
	Item item = new Item(null,0);
	
	@Nested
	//初期状態でgetNumで0が取得できる
	class test1{
		@BeforeEach
		void setUp() throws Exception {
			itemStock = new ItemStock();
		}
		@Test
		void exe1() {
			assertEquals(0,itemStock.getNum(item),"失敗");
		}
		
		@Test
		//初期状態でaddでitemを追加→getNumで1が取得できる
		void exe2() {
			item.setName("にんじん");
			item.setPrice(100);
			itemStock.add(item);
			assertEquals(1,itemStock.getNum(item),"失敗");

		}
	}
	
	@Nested
	class test2{
		@BeforeEach
		void setUp() throws Exception {
			//itemを追加する
			item.setName("にんじん");
			item.setPrice(100);
			itemStock.add(item);
		}
		@Test
		//Itemが１つ追加されている状態で、getNumで１が取得できる
		void exe1() {
			assertEquals(1,itemStock.getNum(item),"失敗");
			
		}
		@Test
		//Itemが１つ追加されている状態で、addで同じItemオブジェクトを追加するとgetNumで２が取得できる
		void exe2() {
			item.setName("にんじん");
			item.setPrice(100);
			itemStock.add(item);
			assertEquals(2,itemStock.getNum(item),"失敗");
			
		}
		@Test
		//Itemが１つ追加されている状態で、addで異なるItemオブジェクトを追加するとgetNumで１が取得できる
		void exe3() {
			item.setName("じゃがいも");
			item.setPrice(80);
			itemStock.add(item);
			assertEquals(1,itemStock.getNum(item),"失敗");
			
		}
	}
	

}
