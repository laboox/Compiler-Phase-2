import org.antlr.v4.runtime.Token;

import java.util.ArrayList;

/**
 * Created by sina on 12/23/14.
 */
public class Type implements Comparable{
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

    public Type getFather() {
        return father;
    }

    public void setFather(Type father) {
        this.father = father;
    }

    private void init(){
        attributes = new ArrayList<Attribute>();
        methods = new ArrayList<Method>();
        inheritable = true;
        fatherName = "Object";
    }

    public Type(String name, Type father) {
        this.init();
        this.name = name;
        this.father = father;
        this.fatherName = father.getName();
    }

    public Type(String name) {
        this.init();
        this.name = name;
        this.father = null;
    }

    public Type(String name, String fatherName){
        this.init();
        this.name = name;
        this.fatherName = fatherName;
        father = null;
    }

    public ArrayList<Attribute> getAttributes() {
        return attributes;
    }

    public ArrayList<Method> getMethods() {
        return methods;
    }

    private ArrayList<Attribute> attributes;
    private ArrayList<Method> methods;

    private String name;
    private String fatherName;
    private Type father;
    private Token token;
    private boolean inheritable;

    public boolean isInheritable() {
        return inheritable;
    }

    public void setInheritable(boolean inheritable) {
        this.inheritable = inheritable;
    }

    public Token getToken() {
        return token;
    }

    public void setToken(Token token) {
        this.token = token;
    }

    @Override
    public int compareTo(Object o) {
        Type other = (Type)o;
        return name.toUpperCase().compareTo(other.getName().toUpperCase());
    }

    public Boolean matchName(String oName){
        return name.toUpperCase().equals(oName.toUpperCase());
    }

    public void addMethod(Method method) {
        methods.add(method);
    }

    public void addMethod(Attribute attribute) {
        attributes.add(attribute);
    }

    public boolean isVoid() {
        return matchName("void");
    }

    public boolean isSelfType() {
        return name.equals("SELF_TYPE");
    }
}
