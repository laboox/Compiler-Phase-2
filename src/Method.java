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

    public boolean haveRepeatedFormal(){
        for (int i = 0; i < formals.size()-1; i++) {
            for (int j = i+1; j < formals.size(); j++) {
                if(formals.get(i).equals(formals.get(j)))
                    ErrorHandler.repeatedFormals(formals.get(i),formals.get(j));
                    return true;
            }
        }
        return false;
    }
}
