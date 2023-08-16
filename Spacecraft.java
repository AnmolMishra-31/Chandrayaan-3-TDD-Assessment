/* To ensure all tests are red (i.e., failing), I don't add the methods rotate and the additional conditions for the move method in the Spacecraft class.
When you run the SpacecraftTest now, all tests should fail, showing up as red. This way, you're starting with a red bar, and the next step in the 
TDD cycle would be to implement the functionality to make these tests pass (green bar), followed by possible refactorings.*/

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SpacecraftTest {
    
    @Test
    public void testMoveForwardFacingNorth() {
        Spacecraft spacecraft = new Spacecraft(0, 0, 0, 'N');
        spacecraft.move('f');
        assertEquals(0, spacecraft.getX());
        assertEquals(1, spacecraft.getY());
        assertEquals(0, spacecraft.getZ());
    }

    @Test
    public void testMoveForwardFacingEast() {
        Spacecraft spacecraft = new Spacecraft(0, 0, 0, 'E');
        spacecraft.move('f');
        assertEquals(1, spacecraft.getX());
        assertEquals(0, spacecraft.getY());
        assertEquals(0, spacecraft.getZ());
    }

    @Test
    public void testRotateRightFromNorth() {
        Spacecraft spacecraft = new Spacecraft(0, 0, 0, 'N');
        spacecraft.rotate('r');
        assertEquals('E', spacecraft.getDirection());
    }

    @Test
    public void testRotateUpFromNorth() {
        Spacecraft spacecraft = new Spacecraft(0, 0, 0, 'N');
        spacecraft.rotate('u');
        assertEquals('U', spacecraft.getDirection());
    }

    @Test
    public void testMoveUpwards() {
        Spacecraft spacecraft = new Spacecraft(0, 0, 0, 'U');
        spacecraft.move('f');
        assertEquals(0, spacecraft.getX());
        assertEquals(0, spacecraft.getY());
        assertEquals(1, spacecraft.getZ());
    }
}
