/**
 * Created by sina on 12/25/14.
 */
public class Attribute extends Feature {
    Type type;

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Attribute(String name, Type type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Attribute{" +
                "name='" + name + '\'' +
                "type='" + type.getName() + '\'' +
                '}';
    }
}
