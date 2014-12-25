/**
 * Created by sina on 12/23/14.
 */
public class Node implements Comparable{
    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Node getFather() {
        return father;
    }

    public void setFather(Node father) {
        this.father = father;
    }

    public Node(String name, Node father) {
        this.name = name;
        this.father = father;
        this.fatherName = father.getName();
    }

    public Node(String name) {
        this.name = name;
        this.father = null;
        this.fatherName = "";
    }

    public Node(String name, String fatherName){
        this.name = name;
        this.fatherName = fatherName;
        father = null;
    }

    private String name;
    private String fatherName;
    private Node father;

    @Override
    public int compareTo(Object o) {
        Node other = (Node)o;
        return name.toUpperCase().compareTo(other.getName().toUpperCase());
    }

    public Boolean matchName(String oName){
        return name.toUpperCase().equals(oName.toUpperCase());
    }
}
