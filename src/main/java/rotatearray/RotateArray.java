package rotatearray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 * Created by vilenalivinsky on 5/3/17.
 */

public class RotateArray extends ArrayList {

    public List rotate(List listToBeRotated, int spacesToBeRotated) {
        Collections.rotate(listToBeRotated, spacesToBeRotated);

        return listToBeRotated;
    }

}

