/**
 * Created by sina on 12/25/14.
 */
public class Formal extends Feature {
    Type type;

    public Formal(String name, Type type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public boolean exactlyEqual(Object o){
        Formal other = (Formal)o;
        return this.equals(other) && this.getType().equals(other.getType());
    }

    @Override
    public String toString() {
        return "Formal{" +
                "name='" + name + '\'' +
                "type='" + type.getName() + '\'' +
                '}';
    }
}
