import java.util.Set;
import java.util.TreeSet;

public class set_sec_b_prac {
    public void getsetitem(){
        Set set = new TreeSet();
        set.add("A");
        set.add("B");
        set.add("B");
        set.add("C");
        System.out.println(set);
        getForEach(set);

    }

    public void getForEach(Set set){
        for(Object o : set)
            System.out.println(o);
    }

}
