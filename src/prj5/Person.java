// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those who
// do.
// -- Yash Makkena (ymakkena), Michele Ambrose(mla2911), Saunders Cox
// (saunderscox)
package prj5;

/**
 * Class that represents a person and their attributes
 * 
 * @author Yash Makkena (ymakkena), Michele Ambrose (mla2911), Saunders Cox
 *         (saunderscox)
 * @version 2018.10.31
 */
public class Person {
    /**
     * Stores the ID of the person
     */
    private int ID;
    /**
     * Stores the date a person took the survey
     */
    private String date;
    /**
     * Stores the person's selected hobby
     */
    private HobbyEnum hobby;
    /**
     * Stores the person's selected major
     */
    private MajorEnum major;
    /**
     * Stores the person's selected region
     */
    private RegionEnum region;
    /**
     * Stores the person's data for a list of songs
     */
    private DLList<Song> songs;


    /**
     * Standard constructor that fills the Person's fields
     * 
     * @param ID
     *            the ID of the person
     * @param date
     *            the date the person took the survey
     * @param hobby
     *            the person's selected hobby
     * @param major
     *            the person's selected major
     * @param region
     *            the person's selected region
     */
    public Person(
        int ID,
        String date,
        HobbyEnum hobby,
        MajorEnum major,
        RegionEnum region) {
        this.ID = ID;
        this.date = date;
        this.hobby = hobby;
        this.major = major;
        this.region = region;
    }


    /**
     * Standard modifier for the songs field
     * 
     * @param song
     *            the list of songs with filled in answers
     */
    public void setSongs(DLList<Song> song) {
        if (song == null) {
            throw new IllegalArgumentException();
        }
        this.songs = song;
    }


    /**
     * Standard accessor for the songs field
     * 
     * @return the songs field
     */
    public DLList<Song> getSongs() {
        return this.songs;
    }


    /**
     * Standard accessor for the region field
     * 
     * @return the region field
     */
    public RegionEnum getRegion() {
        return this.region;
    }


    /**
     * Standard accessor for the hobby field
     * 
     * @return the hobby field
     */
    public HobbyEnum getHobby() {
        return this.hobby;
    }


    /**
     * Standard accessor for the major field
     * 
     * @return the major field
     */
    public MajorEnum getMajor() {
        return this.major;
    }


    /**
     * Standard accessor for the ID field
     * 
     * @return the ID field
     */
    public int getID() {
        return this.ID;
    }


    /**
     * Standard accessor for the date field
     * 
     * @return the date field
     */
    public String getDate() {
        return this.date;
    }
}
