import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class list_sec_b_prac {
    public void getListItems(){
        List list = new ArrayList();
        list.add("We ");
        list.add("are ");
        list.add("crazy fan");
        list.add("Real Madrid");

        //System.out.println(list);
        //getIteratedItems(list);
        getForEach(list);
    }


    public void getIteratedItems(List list){
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public void getForEach(List list){
        for(Object o : list)
            System.out.println(o);
    }

    public ArrayList<Integer> getInteger(){
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        return integers;
    }
}
