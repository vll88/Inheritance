package rotatearray;
import rotatearray.RotateArray;

import java.util.ArrayList;

/**
 * Created by vilenalivinsky on 5/3/17.
 */
public class main_rotate {

    public static void main(String[] args) {
        RotateArray rotating_arr = new RotateArray();
        ArrayList<String> arrayList = new ArrayList<String>();
        int rotator = 2;
        rotating_arr.rotate(arrayList, rotator);
    }
}