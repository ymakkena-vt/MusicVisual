// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of
// those who do.
// -- Yash Makkena (ymakkena), Michele Ambrose(mla2911), Saunders Cox
// (saunderscox)

package prj5;

/**
 * Runs the program
 *
 * @author Michele Ambrose (mla2911), Yash Makkena (ymakkena), Saunders Cox
 *         (saunderscox)
 *
 * @version 2018.11.09
 */
public class Input {

    public static void main(String[] args) {
        if (args.length > 0) {
            GUIMusicWindow gui = new GUIMusicWindow(new SurveyInput(args[0],
                args[1]));

            gui.tempOutput();
            gui.sortTitle();
            gui.tempOutput();
        }
    }
}
