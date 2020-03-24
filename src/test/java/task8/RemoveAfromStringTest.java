package task8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RemoveAfromStringTest {

	RemoveAfromString removeAfromString;
	
	@BeforeEach
	void setUp(){
		removeAfromString=new RemoveAfromString();
	}
	
	@Test
	void test2Abefore() {
		assertEquals("BC",removeAfromString.remove("AABC"));
	}
	
	@Test
	void test2Aafter() {
		assertEquals("BCAA",removeAfromString.remove("BCAA"));
	}
	
	@Test
	void test1Abefore() {
		assertEquals("BAC",removeAfromString.remove("ABAC"));
	}
	
	@Test
	void test2length() {
		assertEquals("BC",removeAfromString.remove("BC"));
	}
	
	@Test
	void test1length() {
		assertEquals("",removeAfromString.remove("A"));
	}
	
	@Test
	void test2ndA() {
		assertEquals("BCD",removeAfromString.remove("BACD"));
	}
	
	@Test
	void test0length(){
		assertEquals("",removeAfromString.remove(""));
	}
}
