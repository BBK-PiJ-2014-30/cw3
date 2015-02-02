/**
 * Created by devon on 01/02/2015.
 */
public class StackImpI extends AbstractStack {


    /**
     * Creates a new abstract stack using the provided list as the
     * underlying data structure.
     * <p/>
     * Note: This constructor does not check whether the provided list
     * is null. Programmers must do their own checks. If a null list
     * is provided, a NullPointerException will be thrown at runtime
     * as soon as any operation is attempted on the underlying list.
     *
     * @param list the list to be used
     */
    public StackImpI(List list) {
        super(list);
    }

    @Override
    public boolean isEmpty() {
        if( internalList.isEmpty()) {
            return true;
        }
        return false;
    }

    @Override
    public int size() {

        return internalList.size();
    }

    @Override
    public void push(Object item) {
        internalList.add(item);



    }

    @Override
    public ReturnObject top() {
        ReturnObject o =  internalList.get(size()-1);
        return o;
    }

    @Override
    public ReturnObject pop() {
        ReturnObject o = internalList.get(size()-1);
        internalList.remove(size()-1);
        return o;
    }
}
