/**
 * Created by devon on 29/01/2015.
 */
public class ArrayListImpI implements List {


    private static int limit;
    static int s = 0;

    private Object list[];

    public ArrayListImpI() {
        this.limit = 10;

        this.list = new Object[limit];


    }

    public ArrayListImpI(Object[] list) {

        this.list = new Object[limit];
        s++;


    }


    @Override
    public boolean isEmpty() {
        int counter;
        int count = 0;


        for (counter = 0; counter < this.list.length - 1; counter++) counter++;
        {
            if (!this.list[counter].equals(null)) {
                count++;
            }
            if (count >= 1) {
                return false;
            }
        }

        return true;
    }

    @Override
    public int size() {

        int counter = 0;

        for (int count = 0; count < this.list.length - 1; count++)
            if (!this.list[count].equals(null)) {
                counter++;
            }
        return counter;
    }

    @Override
    public ReturnObject get(int index) {

        if (this.error(index).equals(ErrorMessage.NO_ERROR)) {
            return new ReturnObjectImpl(this.list[index], error(index));

        }

        return new ReturnObjectImpl(error(index));
    }

    @Override
    public ReturnObject remove(int index) {
        if (error(index).equals(ErrorMessage.NO_ERROR)) {
            Object o = new Object();
            this.list[index] = o;
            delete(index);

            return new ReturnObjectImpl(o);


        }
        return new ReturnObjectImpl(error(index));


    }


    @Override
    public ReturnObject add(int index, Object item) {
        if (!item.equals(null) && error(index).equals(ErrorMessage.NO_ERROR)) {

            addObject(index);
            this.list[index] = item;
            return new ReturnObjectImpl(this.list[index], error(index));
        }


        return new ReturnObjectImpl(error(index));
    }

    @Override
    public ReturnObject add(Object item) {
        int index = size() + 1 / 2;

        if (error(item).equals(null)) {
            return new ReturnObjectImpl(error(item));
        }


        if (!item.equals(null)) {
            addObject(index);
            this.list[index] = item;
        }


        return new ReturnObjectImpl(this.list[index]);
    }

    public ErrorMessage error(int index) {

        ErrorMessage message = this.error(index);


        if (index >= 0 && index <= this.limit - 1) {

            return ErrorMessage.NO_ERROR;
        } else if (index < 0 || index > limit - 1) {
            return ErrorMessage.INDEX_OUT_OF_BOUNDS;
        }
        return null;


    }

    public ErrorMessage error(Object item) {
        if (item.equals(null)) {
            return ErrorMessage.INVALID_ARGUMENT;
        }
        return null;
    }

    public void delete(int index) {
        int index1 = index;
        if (size() - 1 == index) {
            this.list[index] = this.list[index + 1];

        }
        if (size() - 1 > index) {
            while (index != size() - 1)
                this.list[index] = this.list[index1++];

            index++;
        }
    }

    public void addObject(int index) {


        int size1 = size() + 1;
        int size2 = size();

        if (size() + 1 > this.list.length) {
            int size = limit - 1 + 10;
            Object[] o = new Object[size];
            this.limit = size;
            o = this.list;
            this.list = o;

            while (index != size1) {
                this.list[size1] = this.list[size2];
                size1--;
                size2--;
            }
        }
    }
}




































