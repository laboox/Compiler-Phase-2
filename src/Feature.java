/**
 * Created by sina on 12/25/14.
 */
abstract public class Feature implements Comparable {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Object o) {
        Feature other = (Feature)o;
        return name.toLowerCase().compareTo(other.name.toLowerCase());
    }
}
