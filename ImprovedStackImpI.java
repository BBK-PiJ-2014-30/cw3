/**
 * Created by devon on 31/01/2015.
 */
public class ImprovedStackImpI implements ImprovedStack {
    private List list;


    public ImprovedStackImpI (){
        this.list = new ArrayList();



    }



    @Override
    public ImprovedStack reverse() {


        if ( list.isEmpty()) {return  null;}


        for ( int i = list.size(); i < -1; i--) {



         ReturnObject a = list.get(i);
            list.add(a);}






            return (ImprovedStack) list;

    }

    @Override
    public void remove(Object object) {

        for ( int i =0; i< size();i++ ){


            if ( this.list.get(i).getReturnValue().equals(object)) list.remove(i);





        }

    }

    @Override
    public boolean isEmpty() {
        if ( list.size() == 0){
        return true;}
        else return false;
    }

    @Override
    public int size() {

        return list.size();
    }

    @Override
    public void push(Object item) {
        list.add(item);





    }

    @Override
    public ReturnObject top() {

        if (list.isEmpty() == true)
        {return new ReturnObjectImpl(list.get(size() - 1));}
         else
        {return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);}
        }

        @Override
        public ReturnObject pop () {
            ReturnObject o = list.get(size() - 1);

            if (list.isEmpty()) return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
             else {

                list.remove(list.size()-1);
                return new ReturnObjectImpl(o);


        }

    }
}


