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
        si = new SurveyInput("musicInput.csv", "peopleInput.csv");
    }


    /**
     * tests the inputMusic() method
     */
    public void testInputMusic() {
        DLList<Song> list = new DLList<Song>();
        Song song1 = new Song("Let It Be", "Beatles", 1970, "classic rock");
        Song song2 = new Song("Storytime", "Nightwish", 2011, "symphonic rock");
        Song song3 = new Song("Circle of Life", "Elton John", 1994, "Disney");
        list.add(song1);
        list.add(song2);
        list.add(song3);
        assertEquals(list.toString(), si.inputMusic().toString());
    }


    /**
     * tests inputPerson() method
     */
    public void testInputPerson() {
        DLList<Person> listP = new DLList<Person>();
        Person person1 = new Person(100, "November 15", MajorEnum.CS,
            RegionEnum.OTHER_US, HobbyEnum.READ);
        Person person2 = new Person(101, "November 14", MajorEnum.ENGE,
            RegionEnum.NE_US, HobbyEnum.ART);
        Person person3 = new Person(110, "November 13", MajorEnum.MATH_CMDA,
            RegionEnum.SE_US, HobbyEnum.MUSIC);
        Person person4 = new Person(111, "November 12", MajorEnum.OTHER,
            RegionEnum.OUTSIDE, HobbyEnum.SPORTS);

        listP.add(person1);
        listP.add(person2);
        listP.add(person3);
        listP.add(person4);
        DLList<Person> inputList = si.inputPerson(si.inputMusic());

        assertTrue(inputList.toString().equals(listP.toString()));

    }

}
