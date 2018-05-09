import java.util.LinkedList;
import java.util.Iterator;

public class linkedList_sec_b_prac {
    public void getLinkedList(){
        LinkedList linkedList = new LinkedList();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("B");
        linkedList.add("C");

        //System.out.println(linkedList);
        //getIteratedItems(linkedList);

    }
    public void getIteratedItems(LinkedList linkedList){
        Iterator iterator = linkedList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}
