// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those who
// do.
// -- Yash Makkena (ymakkena), Michele Ambrose(mla2911), Saunders Cox
// (saunderscox)

package prj5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Class that creates data structures from survey input
 * 
 * @author Yash Makkena (ymakkena), Michele Ambrose (mla2911), Saunders Cox
 *         (saunderscox)
 * @version 2018.11.09
 */
public class SurveyInput {
    private String musicFile = "";
    private String peopleFile = "";


    /**
     * Creates a SurveyInput with the given files.
     * 
     * @param music
     *            the music file
     * @param people
     *            the person file
     */
    public SurveyInput(String music, String people) {
        this.musicFile = music;
        this.peopleFile = people;
    }


    public DLList<Song> inputMusic() {
        DLList<Song> list = new DLList<Song>();
        try {
            Scanner sc = new Scanner(new File(musicFile));

            sc.close();
        }
        catch (FileNotFoundException e) {

        }
        return list;
    }


    public DLList<Person> inputPerson() {
        DLList<Person> list = new DLList<Person>();
        try {
            Scanner sc = new Scanner(new File(peopleFile));
        }
        catch (FileNotFoundException e) {

        }
        return list;
    }
}
