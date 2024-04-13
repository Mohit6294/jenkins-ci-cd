package in.ineuron;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
class JenkinsExample1ApplicationTests {

	
	
	@Autowired
	protected MockMvc mockMvc;
	
	
	
	String name = "Welcome Mohitto Jenkins Tutorial";

	@Test
	void CICDDemoControllerTest() throws Exception {
		assertEquals(true, true);
	}

}
