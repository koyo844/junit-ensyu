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

	//ItemStock�N���X��new����
	ItemStock itemStock = new ItemStock();
	Item item = new Item(null,0);
	
	@Nested
	//������Ԃ�getNum��0���擾�ł���
	class test1{
		@BeforeEach
		void setUp() throws Exception {
			itemStock = new ItemStock();
		}
		@Test
		void exe1() {
			assertEquals(0,itemStock.getNum(item),"���s");
		}
		
		@Test
		//������Ԃ�add��item��ǉ���getNum��1���擾�ł���
		void exe2() {
			item.setName("�ɂ񂶂�");
			item.setPrice(100);
			itemStock.add(item);
			assertEquals(1,itemStock.getNum(item),"���s");

		}
	}
	
	@Nested
	class test2{
		@BeforeEach
		void setUp() throws Exception {
			//item��ǉ�����
			item.setName("�ɂ񂶂�");
			item.setPrice(100);
			itemStock.add(item);
		}
		@Test
		//Item���P�ǉ�����Ă����ԂŁAgetNum�łP���擾�ł���
		void exe1() {
			assertEquals(1,itemStock.getNum(item),"���s");
			
		}
		@Test
		//Item���P�ǉ�����Ă����ԂŁAadd�œ���Item�I�u�W�F�N�g��ǉ������getNum�łQ���擾�ł���
		void exe2() {
			item.setName("�ɂ񂶂�");
			item.setPrice(100);
			itemStock.add(item);
			assertEquals(2,itemStock.getNum(item),"���s");
			
		}
		@Test
		//Item���P�ǉ�����Ă����ԂŁAadd�ňقȂ�Item�I�u�W�F�N�g��ǉ������getNum�łP���擾�ł���
		void exe3() {
			item.setName("���Ⴊ����");
			item.setPrice(80);
			itemStock.add(item);
			assertEquals(1,itemStock.getNum(item),"���s");
			
		}
	}
	

}
