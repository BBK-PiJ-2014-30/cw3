/**
 * Created by devon on 07/01/2015.
 */
public class ReturnObjectImpl implements ReturnObject {

    private Object object;
    private String errorMessage;

    public ReturnObjectImpl(Object returnObject, String errorMessage) {
        this.object = returnObject;
        this.errorMessage = errorMessage;
    }

    @Override
    public boolean hasError() {
        if (getReturnValue().equals(this.object))return false;
        else return false;
    }

    @Override
    public ErrorMessage getError() {

        if (!this.equals(null)) return ErrorMessage.NO_ERROR ;
        else return null;
    }

    @Override
    public Object getReturnValue() {
        if (!this.equals(null)) return this.object ;
        else return null;
    }
}
