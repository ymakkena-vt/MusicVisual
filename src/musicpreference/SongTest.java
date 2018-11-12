// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those who
// do.
// -- Yash Makkena (ymakkena), Michele Ambrose, Saunders Cox (saunderscox)

package musicpreference;

import static org.junit.Assert.assertEquals;
import student.TestCase;

/**
 * Tests SongTest
 * 
 * @author Yash Makkena (ymakkena), Michele Ambrose (mla2911), Saunders Cox
 *         (saunderscox)
 * @version 2018.11.09
 */
public class SongTest extends TestCase {
    
    private Song song1;
    
    /**
     * Sets up the test
     */
    public void setUp() {
        song1 = new Song("Hello", "Adele", 2015, "pop");
    }
    
    /**
     * Tests setHeard
     */
    public void testSetHeard() {
        assertEquals(false, song1.getHeard());
        song1.setHeard(true);
        assertEquals(true, song1.getHeard());
    }
    
    /**
     * Tests setLiked
     */
    public void testSetLiked() {
        assertEquals(false, song1.getLiked());
        song1.setLiked(true);
        assertEquals(true, song1.getLiked());
    }
    
    /**
     * Tests getName
     */
    public void testGetName() {
        assertEquals("Hello", song1.getName());
    }
    
    /**
     * Tests getYear
     */
    public void testGetYear() {
        assertEquals(2015, song1.getYear());
    }
    
    /**
     * Tests getArtist
     */
    public void testGetArtist() {
        assertEquals("Adele", song1.getArtist());
    }
    
    /**
     * Tests getGenre
     */
    public void testGetGenre() {
        assertEquals("pop", song1.getGenre());
    }
    
    /**
     * Tests getHeard
     */
    public void testGetHeard() {
        assertEquals(false, song1.getHeard());
        song1.setHeard(true);
        assertEquals(true, song1.getHeard());
    }
    
    /**
     * Tests getLiked
     */
    public void testGetLiked() {
        assertEquals(false, song1.getLiked());
        song1.setLiked(true);
        assertEquals(true, song1.getLiked());
    }
}
