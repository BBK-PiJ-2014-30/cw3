/**
 * Created by devon on 31/01/2015.
 */
public class ImprovedStackImpI implements ImprovedStack {
    private List list;
    private ImprovedStackImpI[] a;

    ImprovedStackImpI (List list){
        this.list = list;



    }

    public ImprovedStackImpI() {

        a = new ImprovedStackImpI [list.size()-1];
    }

    @Override
    public ImprovedStack reverse() {



        for ( int i = list.size(); i < -1; i--) {


            push(list.get(i).getReturnValue());
        }


        return null;
    }

    @Override
    public void remove(Object object) {
        int counter;
        for ( int i =0; i< size();i++ ){
            counter = i;

            if ( this.list.get(i).getReturnValue().equals(object)) {
                while (i < size()) {
                    ReturnObject a = this.list.get(i);

                    a = this.list.get(counter++);
                    i++;
                }
            }





        }

    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void push(Object item) {
        int i =0;
        a[i++] = item;

    }

    @Override
    public ReturnObject top() {
        return null;
    }

    @Override
    public ReturnObject pop() {
        return null;
    }
}
