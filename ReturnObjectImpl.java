/**
 * Created by devon on 07/01/2015.
 */
public class ReturnObjectImpl implements ReturnObject {

    private Object object;
    private ErrorMessage errorMessage;



    public ReturnObjectImpl(Object returnObject, String eMessage) {
        this.object = returnObject;
        this.errorMessage = getError();
    }

    @Override
    public boolean hasError() {
        if (getReturnValue().equals(this.object))return false;
        else return true;
    }

    @Override
    public ErrorMessage getError() {
        boolean value = hasError();

        if ( value == false )return ErrorMessage.NO_ERROR;

        else return null;
    }

    @Override
    public Object getReturnValue() {
        boolean value =hasError();
        if (!this.equals(null)) return this.object ;
        else return null;
    }
}
