// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those who
// do.
// // -- Yash Makkena (ymakkena), Michele Ambrose(mla2911), Saunders Cox
// (saunderscox)
package prj5;

import student.TestCase;

/**
 * Tests DLList
 * 
 * @author Yash Makkena (ymakkena), Michele Ambrose (mla2911), Saunders Cox
 *         (saunderscox)
 * @version 2018.11.09
 */
public class DLListTest extends TestCase {

    private DLList<Song> songList;
    private Song song1;
    private Song song2;
    private Song song3;


    /**
     * Sets up the test
     */
    public void setUp() {
        songList = new DLList<Song>();
        song1 = new Song("Hello", "Adele", 2015, "Soul");
        song2 = new Song("Come Together", "The Beatles", 1969, "Rock");
        song3 = new Song("September", "Earth, Wind, and Fire", 1978, "R&B");
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
        assertEquals("Come Together", song2.getName());
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
        assertEquals(2015, song1.getYear());
    }


    /**
     * Tests getGenre
     */
    public void testGetGenre() {
        assertEquals("Soul", song1.getGenre());
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
