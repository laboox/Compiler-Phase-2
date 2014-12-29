import java.util.Hashtable;
import java.util.Stack;

/**
 * Created by aida on 12/28/14.
 */
public class SymbolTable {

    private Stack tbl;
    private Type classScope;
    private Method methodScope;
    private InheritanceGraph types;

    public InheritanceGraph getTypes() { return types; }

    public Type getClassScope() {
        return classScope;
    }

    public void setClassScope(Type classScope) {
        this.classScope = classScope;
    }

    public Method getMethodScope() {
        return methodScope;
    }

    public void setMethodScope(Method methodScope) {
        this.methodScope = methodScope;
    }

    /** Creates an empty symbol table. */
    public SymbolTable(InheritanceGraph types)
    {
        tbl = new Stack();
        this.types = types;
    }

    /** Enters a new scope. A scope must be entered before anything
     * can be added to the table.
     * */
    public void enterScope() {
        tbl.push(new Hashtable());
    }

    /** Exits the most recently entered scope. */
    public void exitScope() {
        if (tbl.empty())
            ErrorHandler.exitScopeErr();
        else
            tbl.pop();
    }

    public void addId(String id, Type type) {
        if (tbl.empty())
            ErrorHandler.addIdErr();
        else {
            System.out.println(id);
            System.out.println(type.toString());
            ((Hashtable) tbl.peek()).put(id, type);
        }

    }

    public Type lookup(String id) {
        if (tbl.empty()) {
            ErrorHandler.lookUpErr();
            return null;
        }
        // I break the abstraction here a bit by knowing that stack is
        // really a vector...
        for (int i = tbl.size() - 1; i >= 0; i--) {
            Type type = (Type)((Hashtable)tbl.elementAt(i)).get(id);
            if (type != null) return type;
        }
        return null;
    }

    public Type probe(String id) {
        if (tbl.empty()) {
            ErrorHandler.probErr();
            return null;
        }
        return (Type)((Hashtable)tbl.peek()).get(id);
    }

    public String toString() {
        String res = "";
        // I break the abstraction here a bit by knowing that stack is
        // really a vector...
        for (int i = tbl.size() - 1, j = 0; i >= 0; i--, j++) {
            res += "Scope " + j + ": " + tbl.elementAt(i) + "\n";
        }
        return res;
    }
}
