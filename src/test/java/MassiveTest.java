import static org.junit.Assert.*;

import org.junit.Test;

public class MassiveTest extends Massive {

	@Test
	public void test() {
	    String rnd_str = "";
    	int[] random  = new int[10];
    	int min = 20; 
		int max = 160; 
    	random[0] = rnd(min, max);
    	random[1] = rnd(min, max);
    	random[2] = rnd(min, max);
    	random[3] = rnd(min, max);
    	random[4] = rnd(min, max);
    	random[5] = rnd(min, max);
    	random[6] = rnd(min, max);
    	random[7] = rnd(min, max);
    	random[8] = rnd(min, max);
    	random[9] = rnd(min, max);
    	for (int i = 0; i < 10; i++) {
    		rnd_str = rnd_str + random[i] + " ";
    		}
    	
    	int actual = 0;
    	
    	for (int i = 0; i < 10; i++) {
    		if (random[i] > 20 && random[i] < 160) {
    			actual++;
    		}
    	}
    	
    	int expected = 10;
    	assertEquals(actual, expected);
    	if (actual == expected) {
    		System.out.println("Все числа в массиве сгенерированны в заданном диапазоне\n" + rnd_str);
    	}
	}

}
