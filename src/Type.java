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

    public Method getMethod(String name){
        for(Method m: methods){
            if(m.matchName(name))
                return m;
        }
        return null;
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
        return name.compareTo(other.getName());
    }

    @Override
    public boolean equals(Object obj) {
        Type other = (Type)obj;
        return name.equals(other.getName());
    }

    public Boolean matchName(String oName){
        return name.equals(oName);
    }

    public void addMethod(Method method) {
        if(!methods.contains(method)) {
            if(method.haveRepeatedFormal()) {
                return;
            }
            methods.add(method);
        }
        else{
            Method dupl = methods.get(methods.indexOf(method));
            ErrorHandler.invalidFeatureRedefine(dupl,method);
        }
    }

    public void addAttribute(Attribute attribute) {
        if(attribute.matchName("self")){
            ErrorHandler.invalidFeatureName(attribute);
            return;
        }
        if(!attributes.contains(attribute)) {
            attributes.add(attribute);
        }
        else{
            Attribute dupl = attributes.get(attributes.indexOf(attribute));
            ErrorHandler.invalidFeatureRedefine(dupl,attribute);
        }
    }

    public boolean isVoid() {
        return matchName("void");
    }

    public boolean isSelfType() {
        return name.equals("SELF_TYPE");
    }

    @Override
    public String toString() {
        return "Type{" +
                "name='" + name + '\'' +
                "father='" + ((father!=null)?father.getName():"null") + '\''+
                '}';
    }
}
