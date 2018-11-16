package prj5;

import student.TestCase;

// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of
// those who do.
// -- Michele Ambrose (mla2911), Yash Makkena (ymakkena), Saunders Cox
// (saunderscox)
/**
 *
 * Tests the SurveyInput class
 *
 * @author Michele Ambrose (mla2911), Yash Makkena (ymakkena), Saunders Cox
 *         (saunderscox)
 *
 * @version 2018.11.15
 */
public class SurveyInputTest extends TestCase {

    private SurveyInput si;


    /**
     * sets up tests
     */
    public void setUp() {
        si = new SurveyInput("SongList2018S.csv", "MusicSurveyData2018S.csv");
    }


    /**
     * tests the inputMusic() method
     */
    public void testInputMusic() {
        DLList<Song> list = new DLList<Song>();
        Song song1 = new Song("Hotline Bling", "Drake", 2015, "R&B");
        Song song2 = new Song("Creep", "Radiohead", 1992, "Alternative");
        list.add(song1);
        list.add(song2);
        assertEquals(list.toString(), si.inputMusic().toString());
    }


    /**
     * tests inputPerson() method
     */
    public void testInputPerson() {
        DLList<Person> listP = new DLList<Person>();
        Person person1 = new Person(1, "3/14/2018  9:14:00 AM", MajorEnum.MATH_CMDA,
            RegionEnum.OTHER_US, HobbyEnum.READ);
        Person person2 = new Person(2, "3/14/2018  10:20:00 AM", MajorEnum.MATH_CMDA,
            RegionEnum.OTHER_US, HobbyEnum.SPORTS);

        listP.add(person1);
        listP.add(person2);
        DLList<Person> inputList = si.inputPerson(si.inputMusic());

        assertTrue(inputList.toString().equals(listP.toString()));

    }

}
