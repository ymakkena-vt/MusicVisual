// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those who
// do.
// -- Yash Makkena (ymakkena), Michele Ambrose(mla2911), Saunders Cox
// (saunderscox)
package prj5;

/**
 * Enumeration that stores possible majors for a Person
 * 
 * @author Yash Makkena (ymakkena), Michele Ambrose (mla2911), Saunders Cox
 *         (saunderscox)
 * @version 2018.10.31
 */
public enum MajorEnum {
    CS, ENGE, MATH_CMDA, OTHER;
    private MajorEnum() {

    }
    
    public static MajorEnum getMajor(String major) {
        if (major.toUpperCase().equals("COMPUTER SCIENCE")) {
            return CS;
        }
        if (major.toUpperCase().equals("MATH OR CMDA")) {
            return MATH_CMDA;
        }
        if (major.toUpperCase().equals("OTHER ENGINEERING")) {
            return ENGE;
        }
        if (major.toUpperCase().equals("OTHER")) {
            return OTHER;
        }
        return null;
    }
}
