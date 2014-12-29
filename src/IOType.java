/**
 * Created by sina on 12/27/14.
 */
public class IOType extends Type {
    public IOType() throws Pass2Error {
        super("IO");
        setInheritable(true);

        Method out_string = new Method("out_string");
        out_string.setReturnType(new Type("SELF_TYPE"));
        out_string.addFormal(new Formal("x",new Type("String")));
        addMethod(out_string);

        Method out_int = new Method("out_int");
        out_int.setReturnType(new Type("SELF_TYPE"));
        out_int.addFormal(new Formal("x", new Type("Int")));
        addMethod(out_int);

        Method in_string = new Method("in_string");
        in_string.setReturnType(new Type("String"));
        addMethod(in_string);

        Method in_int = new Method("in_int");
        in_int.setReturnType(new Type("Int"));
        addMethod(in_int);
    }
}
