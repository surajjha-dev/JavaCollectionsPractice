package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListSynchronized {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list = Collections.synchronizedList(list);

    }


}
