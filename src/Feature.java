import org.antlr.v4.runtime.Token;

/**
 * Created by sina on 12/25/14.
 */
abstract public class Feature implements Comparable {
    String name;
    Token token;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Token getToken() {
        return token;
    }

    public void setToken(Token token) {
        this.token = token;
    }

    @Override
    public int compareTo(Object o) {
        Feature other = (Feature)o;
        return name.compareTo(other.name);
    }

    @Override
    public boolean equals(Object obj) {
        Feature other = (Feature)obj;
        return name.equals(other.getName());
    }

    public boolean matchName(String oname){
        return name.equals(oname);
    }
}
