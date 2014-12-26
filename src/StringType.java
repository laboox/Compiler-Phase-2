/**
 * Created by sina on 12/27/14.
 */
public class StringType extends Type {
    public StringType() {
        super("String");
        setInheritable(false);
        
        Method length = new Method("length");
        length.setReturnType(new Type("Int"));
        addMethod(length);

        Method concat = new Method("concat");
        concat.setReturnType(new Type("String"));
        concat.addFormal(new Formal("s",new Type("String")));
        addMethod(concat);

        Method substr = new Method("substr");
        substr.setReturnType(new Type("String"));
        substr.addFormal(new Formal("i", new Type("Int")));
        substr.addFormal(new Formal("l", new Type("Int")));
        addMethod(substr);
    }
}
