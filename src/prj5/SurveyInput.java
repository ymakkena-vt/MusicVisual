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
import java.util.Iterator;
import java.util.Scanner;

/**
 * Class that creates data structures from survey input
 * 
 * @author Yash Makkena (ymakkena), Michele Ambrose (mla2911), Saunders Cox
 *         (saunderscox)
 * @version 2018.11.09
 */
public class SurveyInput {
    /**
     * Music file name
     */
    public String musicFile;
    /**
     * People file name
     */
    public String peopleFile;


    /**
     * Creates a SurveyInput with the given files.
     * 
     * @param music
     *            the music file
     * @param people
     *            the person file
     */
    public SurveyInput(String people, String music) {
        this.musicFile = music;
        this.peopleFile = people;
    }


    /**
     * Inputs the music data
     * 
     * @return a list of formatted songs
     */
    public DLList<Song> inputMusic() {
        DLList<Song> list = new DLList<Song>();
        try {
            Scanner sc = new Scanner(new File(musicFile));
            sc.nextLine();

            while (sc.hasNextLine()) {
                String songInfo = sc.nextLine();
                String[] info = songInfo.split(",");
                Song song = new Song(info[0], info[1], Integer.valueOf(info[2]),
                    info[3]);
                list.add(song);
            }

            sc.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("File does not exist");
        }
        return list;
    }


    /**
     * Inputs the people
     * 
     * @param songs
     *            the list of song for each person
     * @return a list of people
     */
    public DLList<Person> inputPerson(DLList<Song> songs) {
        DLList<Person> list = new DLList<Person>();
        try {
            Scanner sc = new Scanner(new File(peopleFile));
            sc.nextLine();

            while (sc.hasNextLine()) {
                String studentInfo = sc.nextLine();
                String[] info = studentInfo.split(",", -1);
                if (info[0].length() >= 1) {
                    Person temp = new Person(Integer.valueOf(info[0]), info[1],
                        MajorEnum.getMajor(info[2]), RegionEnum.getRegion(
                            info[3]), HobbyEnum.getHobby(info[4]));
                    temp.setSongs(songs.clone());
                    DLList<Song> personSongs = temp.getSongs();
                    Iterator<Song> iterator = personSongs.iterator();

                    int position = 5;
                    while (iterator.hasNext()) {
                        Song curr = iterator.next();
                        if (info[position].equals("Yes")) {
                            curr.setHeard(true);
                        }
                        else if (info[position].equals("No")) {
                            curr.setHeard(false);
                        }
                        if (info[position + 1].equals("Yes")) {
                            curr.setLiked(true);
                        }
                        else if (info[position + 1].equals("No")) {
                            curr.setLiked(false);
                        }
                        position += 2;
                    }
                    list.add(temp);
                }
            }
            sc.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("File does not exist");
        }
        return list;
    }
}
