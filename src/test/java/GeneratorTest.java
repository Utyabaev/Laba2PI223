import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratorTest extends Generator{

	@Test
	public void test() {
		final int min = 20; 
		final int max = 160; 
		int i = rnd(min,max);
		assertTrue(i >= 20 && i <= 160);
		if (i >= 20 && i <= 160) {
		System.out.print("—генерированное число находитс€ в диапазоне от 20 до 160");
		}
	}
}
