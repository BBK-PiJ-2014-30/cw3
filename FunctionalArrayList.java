import java.util.ArrayList;

/**
 * Created by devon on 31/01/2015.
 */
public class FunctionalArrayList extends ArrayList implements FunctionalList{

    @Override
    public ReturnObject head() {
        if(isEmpty())

        {
            return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
        }


        return new ReturnObjectImpl (get(0));
    }

    @Override
    public FunctionalList rest() {
        FunctionalArrayList a = new FunctionalArrayList();
        for ( int i =0; i < size(); i++){
            if ( i >= 1){
                Object b = get(i);
                a.add(b);

                return a;


            }



        }
        return null;
    }
}
