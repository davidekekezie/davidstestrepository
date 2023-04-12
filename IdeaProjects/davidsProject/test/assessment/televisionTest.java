package assessment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class televisionTest {
    Television davidTv = new Television();

    @Test
    public void testForVolumeUp(){



        davidTv.volumeUp();
        assertEquals(1,davidTv.volume);





    }

@Test
    public void testForVolumeDown(){
        davidTv.volumeUp();
        davidTv.volumeUp();
        assertEquals(2,davidTv.volume);
        davidTv.volumeDown();
        assertEquals(1,davidTv.volume);



}





}
