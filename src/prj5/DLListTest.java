// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those who
// do.
// // -- Yash Makkena (ymakkena), Michele Ambrose(mla2911), Saunders Cox
// (saunderscox)
package prj5;

import java.util.Iterator;
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
     * Tests isEmpty
     */
    public void testIsEmpty() {
        assertEquals(true, songList.isEmpty());
        songList.add(song1);
        assertEquals(false, songList.isEmpty());
        songList.remove(song1);
        assertEquals(true, songList.isEmpty());
    }


    /**
     * Tests size
     */
    public void testSize() {
        assertEquals(0, songList.size());
        songList.add(song1);
        assertEquals(1, songList.size());
        songList.remove(0);
        assertEquals(0, songList.size());
    }


    /**
     * Tests clear
     */
    public void testClear() {
        songList.add(song1);
        songList.add(song2);
        songList.clear();
        assertEquals(true, songList.isEmpty());
    }


    /**
     * Tests contains
     */
    public void testContains() {
        assertEquals(false, songList.contains(song1));
        songList.add(song1);
        assertEquals(true, songList.contains(song1));

    }


    /**
     * Tests get
     */
    public void testGet() {
        try {
            songList.get(0);
            fail("There should be no item at index 0");
        }
        catch (Exception e) {
            assertEquals(true, e != null);
        }
        songList.add(song1);
        assertEquals(song1, songList.get(0));
    }


    /**
     * Tests add
     */
    public void testAdd() {
        songList.add(song1);
        songList.add(song2);
        songList.add(song3);
        assertEquals(song3, songList.get(2));
        assertEquals(3, songList.size());

        Song nullSong = null;
        try {
            songList.add(nullSong);
            fail("Cannot add null item");
        }
        catch (Exception e) {
            assertEquals(true, e != null);
        }

        songList.add(0, song1);
        songList.add(0, song2);
        assertEquals(song2, songList.get(0));
    }


    /**
     * Tests lastIndexOf
     */
    public void testLastIndexOf() {
        assertEquals(-1, songList.lastIndexOf(song1));
        songList.add(song1);
        songList.add(song2);

        assertEquals(0, songList.lastIndexOf(song1));
        assertEquals(1, songList.lastIndexOf(song2));
    }


    /**
     * Tests remove
     */
    public void testRemove() {
        try {
            songList.remove(0);
            fail("Cannot remove item out of bounds");
        }
        catch (Exception e) {
            assertEquals(true, e != null);
        }

        songList.add(song1);
        assertEquals(true, songList.remove(0));
    }


    /**
     * Tests toString
     */
    public void testToString() {
        songList.add(song1);
        songList.add(song2);
        assertEquals(
            "{Hello by Adele - Year: 2015 - Genre: Soul, Come Together by "
                + "The Beatles - Year: 1969 - Genre: Rock}", songList
                    .toString());
    }


    public void testIterator() {

        Iterator<Song> iterator = songList.iterator();

        assertFalse(iterator.hasNext());

        songList.add(song1);
        songList.add(song2);
        Iterator<Song> iterator1 = songList.iterator();
        assertTrue(iterator1.hasNext());
    }


    public void testClone() {
        songList.add(song1);
        songList.add(song2);
        DLList<Song> next = songList.clone();
        assertEquals(songList.get(1), next.get(1));
    }
}
