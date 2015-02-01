/**
 * Created by devon on 31/01/2015.
 */
public class LinkedList implements List {
    Object o;
    LinkedList next;
    int size;

    public LinkedList() {
        size++;
    }


    public LinkedList(Object o) {
        this.next = null;
        this.o = o;


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
        int counter = 0;
        int position = size() - index;


        if (isEmpty()) {
            return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
        }
        if (index < size() || index > size()) {
            return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);


        } else while (counter != position) {
            runner = runner.next;
            counter++;}
            return new ReturnObjectImpl(runner);


        }

        public ReturnObject remove ( int index){
            return null;
        }


        public ReturnObject add ( int index, Object item){
             int counter = size()-index;
            LinkedList newNode = new LinkedList(item);

            LinkedList front;
            LinkedList previous;
            LinkedList copy;
            previous = front;

            copy = front.next;
            if ( index > size()|| index <=0){
                return new ReturnObjectImpl (ErrorMessage.INDEX_OUT_OF_BOUNDS);}

            else {
                while (counter != 0) {

                    previous = copy;
                    copy = copy.next;


                }

                previous.next = newNode;
                newNode = copy;
                return new ReturnObjectImpl(previous.next);

            }



        }



    public ReturnObject add (Object item){
            return null;
        }
    }
