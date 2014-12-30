/**
 * Created by sina on 12/30/14.
 */
public class LocalVariable {
    private String name;
    private Type type;

    public LocalVariable(String name, Type type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return "localVariable{" +
                "name='" + name + '\'' +
                ", type=" + type +
                '}';
    }
}
