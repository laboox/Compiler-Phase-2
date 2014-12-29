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

    public Formal getFormal(int index){
        if(index<formals.size())
            return formals.get(index);
        return null;
    }

    public Formal getFormal(String name){
        for(Formal f:formals){
            if(f.matchName(name))
                return f;
        }
        return null;
    }

    public boolean formalExists(String name){
        return !(getFormal(name)==null);
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
                if(formals.get(i).equals(formals.get(j))) {
                    ErrorHandler.repeatedFormals(formals.get(i), formals.get(j));
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Method{" +
                "name='" + name + '\'' +
                "returnType='" + returnType.getName() + '\'' +
                '}';
    }
}
