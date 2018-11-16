// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those who
// do.
// -- Yash Makkena (ymakkena), Michele Ambrose(mla2911), Saunders Cox
// (saunderscox)
package prj5;

/**
 * Enumeration that stores possible hobbies for a Person
 * 
 * @author Yash Makkena (ymakkena), Michele Ambrose (mla2911), Saunders Cox
 *         (saunderscox)
 * @version 2018.10.31
 */
public enum HobbyEnum {
    READ, ART, SPORTS, MUSIC;
    private HobbyEnum() {

    }


    public static HobbyEnum getHobby(String hobby) {
        if (hobby.toUpperCase().equals("READING")) {
            return READ;
        }
        if (hobby.toUpperCase().equals("MUSIC")) {
            return MUSIC;
        }
        if (hobby.toUpperCase().equals("SPORTS")) {
            return SPORTS;
        }
        if (hobby.toUpperCase().equals("ART")) {
            return ART;
        }
        return null;
    }
}
