
import java.util.Stack;
import java.util.Hashtable;

/** Implements the symbol table data abstraction.
 *
 * <p>
 *
 * In addition to strings, compilers must also determine and manage the
 * scope of program names.  A symbol table is a data structure for
 * managing scope.  Conceptually, a symbol table is just another lookup
 * table.  The key is the symbol (the name) and the result is whatever
 * information has been associated with that symbol (e.g., the symbol's
 * type).
 *
 * <p>
 *
 * In addition to adding and removing symbols, symbol tables also
 * support operations for entering and exiting scopes and for checking
 * whether an identifier is already defined in the current scope.  The
 * lookup operation must also observe the scoping rules of the language;
 * if there are multiple definitions of identifier <code>x</code>, the
 * scoping rules determine which definition a lookup of <code>x</code>
 * returns.  In most languages, including Cool, inner definitions hide
 * outer definitions.  Thus, a lookup on <code>x</code> returns the
 * definition of <code>x</code> from the innermost scope with a
 * definition of <code>x</code>.
 *
 * <p>
 *
 * Cool symbol tables are implemented using Java hash tables.  Each
 * hash table represents a scope and associates a symbol with some
 * data. The ``data'' is whatever data the programmer wishes to
 * associate with each identifier.  An example illustrating the use of
 *
 * */
class SymbolTable {
    private Stack tbl;
    private Type classScope;
    private Method methodScope;

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
    public SymbolTable() {
        tbl = new Stack();
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
        else
            ((Hashtable)tbl.peek()).put(id, type);
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
    
	
	
