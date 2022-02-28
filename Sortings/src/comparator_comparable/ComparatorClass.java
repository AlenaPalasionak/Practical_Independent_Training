package comparator_comparable;

import java.util.Comparator;

//Class for reverse
public class ComparatorClass  implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o2.charAt(0) - o1.charAt(0);
    }
}
