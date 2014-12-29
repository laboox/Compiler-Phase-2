/**
 * Created by sina on 12/27/14.
 */
public class ObjectType extends Type {
    public ObjectType() throws Pass2Error {
        super("Object");
        setInheritable(true);
        Method abort = new Method("abort");
        abort.setReturnType(this);
        addMethod(abort);
        Method type_name = new Method("type_name");
        type_name.setReturnType(new Type("String"));
        addMethod(type_name);
        Method copy = new Method("copy");
        copy.setReturnType(new Type("SELF_TYPE"));
        addMethod(copy);
    }
}
