/**
 * Created by devon on 31/01/2015.
 */
public class LinkedList implements List {

    private Object o;
    private LinkedList next;

    private LinkedList front;

    public LinkedList() {

    }


    public LinkedList(Object o) {

        this.o = o;
        this.next = null;

    }


    @Override
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int size() {
        int counter = 0;
        LinkedList runner = next;
        while (runner != null) {
            counter++;
        }

        return counter - 1;
    }

    @Override
    public ReturnObject get(int index) {

        LinkedList runner;
        runner = next;




        if (isEmpty()) {
            return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
        }
        if (index < size() || index > size()) {
            return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);


        } else for(int counter =0; counter<index; counter++ ) {
            runner = runner.next;
           }

            return new ReturnObjectImpl(runner);


        }

        public ReturnObject remove ( int index){
            LinkedList runner = next;
            if ( index < 1 || index > size()) return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
            for ( int i =1; i < index; i++){
                runner = runner.next;


            }
            runner = runner.next.next;
            LinkedList newNode = runner;

            return new ReturnObjectImpl( newNode);

        }


        public ReturnObject add ( int index, Object item){
             int counter = size()-index;
            LinkedList newNode = new LinkedList(item);

            front = next;
            LinkedList previous;
            LinkedList copy;
            previous = front;

            copy = front.next;
            if ( index > size()|| index <=0){
                return new ReturnObjectImpl (ErrorMessage.INDEX_OUT_OF_BOUNDS);}
            if ( item.equals(null))return new ReturnObjectImpl( ErrorMessage.INVALID_ARGUMENT);

            else {
                while (counter != 0) {

                    previous = copy;
                    copy = copy.next;


                }

                previous.next = newNode;
                newNode.next = copy;

                return new ReturnObjectImpl(previous.next);

            }



        }



    public ReturnObject add (Object item){

        if ( item.equals(null))return new ReturnObjectImpl ( ErrorMessage.INVALID_ARGUMENT);
        LinkedList newNode = new LinkedList(item);
        LinkedList runner = next;
        while ( runner.next!= null){
            runner = runner.next;
        }


        runner.next = newNode;
        return new ReturnObjectImpl(newNode);
        }





    }
