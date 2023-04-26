package BahotDinoBaad1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BahotDinoBaad1ApplicationTests {

	 Calculator c = new Calculator();
	
	@Test
	void contextLoads() {
	}

	@Test
	void doSumTest() {
		
		//expected
		int expectedResult = 6;
		
		//actual
		int actualResult = c.doSum(2, 2, 2);
		
		assertThat(actualResult).isEqualTo(expectedResult);
	}
	
	@Test
	void doProductTest() {
		
		//expected
		int expectedResult = 8;
		
		//actual
		int actualResult = c.doProduct(2, 4);
		
		assertThat(actualResult).isEqualTo(expectedResult);
	}
	
	@Test
	void compareTwoNumsTest() {
		
		//expected
		Boolean expectedResult = true;
		
		//actual
		Boolean actualResult = c.compareTwoNums(2, 2);
		
		//assertThat(actualResult).isEqualTo(expectedResult);
		assertThat(actualResult).isTrue();
	}
}
