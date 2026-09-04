package a0825.sort.hak3;

import java.util.Comparator;

/**
 * NameComparator
 */
public class NameComparator  implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
      return o1.getName().compareTo(o2.getName());
    }

}
