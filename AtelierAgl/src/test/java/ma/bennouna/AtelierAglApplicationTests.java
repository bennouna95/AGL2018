package ma.bennouna;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import ma.bennouna.service.Operation;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AtelierAglApplicationTests {
Operation p = new Operation();
	@Test
	public void sommeTest() {
		assertEquals(5, p.somme(3,2));
	}

}
