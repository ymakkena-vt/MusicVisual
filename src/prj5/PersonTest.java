// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those who
// do.
// -- Yash Makkena (ymakkena), Michele Ambrose(mla2911), Saunders Cox
// (saunderscox)

package prj5;

import student.TestCase;

/**
 * Tests Person
 * 
 * @author Yash Makkena (ymakkena), Michele Ambrose (mla2911), Saunders Cox
 *         (saunderscox)
 * @version 2018.11.09
 */
public class PersonTest extends TestCase {

    private Person person1;
    private DLList<Song> songs1;


    /**
     * Sets up the test
     */
    public void setUp() {
        person1 = new Person(1, "2018-03-14", HobbyEnum.MUSIC, MajorEnum.CS,
            RegionEnum.NE_US);
        songs1 = new DLList<Song>();
        songs1.add(new Song("Hello", "Adele", 2015, "soul"));
        songs1.add(new Song("Beat It", "Michael Jackson", 1982, "pop"));
    }


    /**
     * Tests setSongs
     */
    public void testSetSongs() {
        DLList<Song> nullSongs = null;
        try {
            person1.setSongs(nullSongs);
            fail("A person should never have a null song list");
        }
        catch (IllegalArgumentException e) {
            assertEquals(true, e != null);
        }
        // If the previous passes, then the following will result in nullpointer
        // person1.getSongs().add(songs1.get(0));
        person1.setSongs(songs1);
        assertEquals("Hello", person1.getSongs().get(0).getName());
    }


    /**
     * Tests getSongs() {
     * 
     */
    public void testGetSongs() {
        assertEquals(null, person1.getSongs());
        person1.setSongs(songs1);
        assertEquals("Hello", person1.getSongs().get(0).getName());
        assertEquals(1982, person1.getSongs().get(1).getYear());
    }


    /**
     * Tests getRegion
     */
    public void testGetRegion() {
        assertEquals(RegionEnum.NE_US, person1.getRegion());
    }


    /**
     * Tests getHobby
     */
    public void testGetHobby() {
        assertEquals(HobbyEnum.MUSIC, person1.getHobby());
    }


    /**
     * Tests getMajor
     */
    public void testGetMajor() {
        assertEquals(MajorEnum.CS, person1.getMajor());
    }


    /**
     * Tests getID
     */
    public void testGetID() {
        assertEquals(1, person1.getID());
    }


    /**
     * Tests getDate
     */
    public void testGetDate() {
        assertEquals("2018-03-14", person1.getDate());
    }
    
    /**
     * Tests toString
     */
    public void testToString() {
        assertEquals("ID: 1, Region: NE_US, Hobby: MUSIC, Major CS"
, person1.toString());
        
    }
}
