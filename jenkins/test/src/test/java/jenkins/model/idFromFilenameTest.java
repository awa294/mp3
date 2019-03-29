import jenkins.model.*;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.Test;


public class idFromFileNameTest {
@Test 
     public void idFromFilenameTest1() {
        IdStretegy.CaseSensitive cs = new IdStrategy.CaseSensitive();
        String filename = "$0021abcd"; 
        String returnValue = cs.IdFromFilename(filename);
        assertEquals(returnValue, "!abcd");
    }
    
    @Test
    public void IdFromFilenameTest2() {
        IdStretegy.CaseSensitive cs = new IdStrategy.CaseSensitive();
        String filename = "abcd$21"; 
        String returnValue = cs.IdFromFilename(filename);
        assertEquals(returnValue, "abcd!");
    }
    
}
