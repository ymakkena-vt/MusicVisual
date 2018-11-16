// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those who
// do.
// -- Yash Makkena (ymakkena), Michele Ambrose(mla2911), Saunders Cox
// (saunderscox)

package prj5;

/**
 * Enumeration that stores possible regions for a Person
 * 
 * @author Yash Makkena (ymakkena), Michele Ambrose (mla2911), Saunders Cox
 *         (saunderscox)
 * @version 2018.10.31
 */
public enum RegionEnum {
    NE_US, SE_US, OTHER_US, OUTSIDE;
    private RegionEnum() {

    }


    public static RegionEnum getRegion(String region) {
        if (region.equals(
            "United States (other than Southeast or Northwest)")) {
            return OTHER_US;
        }
        if (region.toUpperCase().equals("NORTHEAST")) {
            return NE_US;
        }
        if (region.toUpperCase().equals("SOUTHEAST")) {
            return SE_US;
        }
        if (region.equals("Outside of United States")) {
            return OUTSIDE;
        }
        return null;
    }

}
