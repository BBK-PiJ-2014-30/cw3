/**
 * Created by devon on 29/01/2015.
 */
public class ArrayListImpI implements List {

    private static int  position = 0;
    private static int limit =10;
    int length;

    private Object list [];

    public ArrayListImpI(){

        this.list = new Object[limit];


    }

    public ArrayListImpI(Object[] list) {

        this.list = new Object[ position];
        System.out.println(position);


    }


    @Override
    public boolean isEmpty() {
        int counter;
        int count=0;


        for (counter =0; counter < this.list.length-1; counter++) counter++;
        {
            if (!this.list[counter].equals(null)){
                count++;}
            if (count >= 1) {
                return false;
            }
        }

        return true;
    }

    @Override
    public int size() {

        int counter =0;

        for (int count =0; count < this.list.length-1; count++)
            if (!this.list[count].equals(null)) {
                counter++;
            }
        return counter;
    }

    @Override
    public ReturnObject get(int index) {

        if( this.error(index).equals(ErrorMessage.NO_ERROR)){
            return new ReturnObjectImpl (error(index));
            this.list[index]= null;
        }

        return new ReturnObjectImpl( error(index));
    }

    @Override
    public ReturnObject remove(int index) {
        if ( error(index).equals(ErrorMessage.NO_ERROR)){
            Object o = this.list[index];
            this.list[index] = null;

            return new ReturnObjectImpl(o);}
            return new ReturnObjectImpl(error(index));


    }



    @Override
    public ReturnObject add(int index, Object item) {
        if ( !item.equals(null) && error(index).equals(ErrorMessage.NO_ERROR)) {

            for (int count = 0; count < this.list.length - 1; count++) {
                if (this.list[count].equals(null)) {
                    this.list[count] = this.list[index];
                    this.list[index] = item;
                    return new ReturnObjectImpl(error(index));

                }
            }




        }


        return new ReturnObjectImpl(error(index));
    }

    @Override
    public ReturnObject add(Object item) {
        if ( error(item).equals(null)){
            return new ReturnObjectImpl(error(item));
        }


        if ( !item.equals(null)) {
            this.list[limit - 1] = item;
        }
        Object o = this.list[limit-1];
        this.list[limit-1]= null;
        return new ReturnObjectImpl(o);
    }
    public ErrorMessage error ( int index) {

        ErrorMessage message = this.error(index);


        if (index >= 0 && index <= this.limit - 1){

            return ErrorMessage.NO_ERROR;}
        else if ( index <0 || index >limit-1) {return ErrorMessage.INDEX_OUT_OF_BOUNDS;}
        return null;








    }
    public ErrorMessage error ( Object item){
        if ( item.equals(null)){
            return ErrorMessage.INVALID_ARGUMENT;}
        return null;
    }
}


























