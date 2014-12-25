import java.util.ArrayList;

/**
 * Created by sina on 12/25/14.
 */
public class Method extends Feature {
    Type returnType;
    ArrayList<Formal> formals;

    public ArrayList<Formal> getFormals() {
        return formals;
    }

    public Method(String name) {
        this.name = name;
        formals = new ArrayList<Formal>();
        returnType = null;
    }

    public Type getReturnType() {
        return returnType;
    }

    public void setReturnType(Type returnType) {
        this.returnType = returnType;
    }

    public void addFormal(Formal formal){
        formals.add(formal);
    }
}
