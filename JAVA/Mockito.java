import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class Mockito {

	@Test
	void test() {
		
		List <String> lst =new ArrayList<>();
		List<String> s=spy(lst);
		when (s.size()).thenReturn(5);
		assertEquals(5,s.size());
		//Mockito.verify(s);
		//s.add("lekshmi");
		//s.add("jayanth");
		//fail("Not yet implemented");
	}

}
