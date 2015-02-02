/**
 * Created by devon on 02/02/2015.
 */
public class FunctionalLinkedList extends LinkedList implements FunctionalList  {

    @Override
    public Object head() {


        if( get(size()-1).equals(0)){
            return  new ReturnObjectImpl( ErrorMessage.EMPTY_STRUCTURE);
        }
       else return new ReturnObjectImpl( get(size()-1).getReturnValue());

    }

    @Override
    public FunctionalList rest() {
        FunctionalLinkedList list2 = new FunctionalLinkedList();
        list2 = null;
        FunctionalLinkedList list = new FunctionalLinkedList();
        if (list.isEmpty()) return list2;

        for ( int counter =0; counter < size(); counter ++) {
            list.add(get(counter)).getReturnValue();
        }

        list.remove(0);
        return list;




    }
}
