// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those who
// do.
// -- Yash Makkena (ymakkena), Michele Ambrose (mla2911), Saunders Cox
package musicpreference;

/**
 * Represents a Song and contains its attributes
 * 
 * @author Yash Makkena (ymakkena), Michele Ambrose (mla2911), Saunders Cox
 * @version 2018.10.31
 */
public class Song {
    /**
     * Stores the song's title
     */
    private String name;
    /**
     * Stores the song's artist
     */
    private String artist;
    /**
     * Stores the year the song was released
     */
    private int year;
    /**
     * Stores the genre of the song
     */
    private String genre;
    /**
     * Stores whether a person has heard a song
     */
    private boolean answerHeard;
    /**
     * Stores whether a person liked a song
     */
    private boolean answerLiked;


    /**
     * Standard constructor that fills in the fields of the song
     * 
     * @param name
     *            the title of the song
     * @param artist
     *            the artist of the song
     * @param year
     *            the year the song was released
     * @param genre
     *            the genre of the song
     */
    public Song(String name, String artist, int year, String genre) {
        this.name = name;
        this.year = year;
        this.artist = artist;
        this.genre = genre;
    }


    /**
     * Standard modifier method for the field answerHeard
     * 
     * @param heard
     *            if the user has heard the song
     */
    public void setHeard(boolean heard) {
        this.answerHeard = heard;
    }


    /**
     * Standard modifier method for the field answerLiked
     * 
     * @param liked
     *            if the user liked the song
     */
    public void setLiked(boolean liked) {
        this.answerLiked = liked;
    }


    /**
     * Standard accessor method for the name field
     * 
     * @return the name field
     */
    public String getName() {
        return this.name;
    }


    /**
     * Standard accessor method for the year field
     * 
     * @return the year field
     */
    public int getYear() {
        return this.year;
    }


    /**
     * Standard accessor method for the artist field
     * 
     * @return the artist field
     */
    public String getArtist() {
        return this.artist;
    }


    /**
     * Standard accessor method for the genre field
     * 
     * @return the genre field
     */
    public String getGenre() {
        return this.genre;
    }


    /**
     * Standard accessor method for the answerHeard field
     * 
     * @return the answerHeard field
     */
    public boolean getHeard() {
        return this.answerHeard;
    }


    /**
     * Standard accessor method for the answerLiked field
     * 
     * @return the answerLiked field
     */
    public boolean getLiked() {
        return this.answerLiked;
    }
}
