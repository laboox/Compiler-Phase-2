import org.antlr.v4.runtime.Token;

import java.util.*;

/**
 * Created by sina on 12/23/14.
 */
public class InheritanceGraph {
    ArrayList<ArrayList<Type> > graph;
    ArrayList<Type> types;

    Stack<Type> head;

    public InheritanceGraph() {
        types = new ArrayList<Type>();
        Type Obj = new ObjectType();
        types.add(Obj);
        types.add(new IOType());
        types.add(new StringType());
        types.add(new IntType());
        types.add(new BoolType());
        head = new Stack<Type>();
    }

    public Type getObjectType(){
        return types.get(0);
    }

    public Type getIOType(){
        return types.get(1);
    }

    public Type getStringType(){
        return types.get(2);
    }

    public Type getIntType(){
        return types.get(3);
    }

    public Type getBoolType(){
        return types.get(4);
    }

    public void AddNode(String name, String parent, Token token){
        if(types.contains(new Type(name))){
            Type dupl = types.get(types.indexOf(new Type(name)));
            if(dupl.matchName("Object")){
                System.out.println("type");
                ErrorHandler.printTokenLine(token);
                System.out.println("cant redefined Object.");
            }
            else if(dupl.matchName("Int")){
                System.out.println("type");
                ErrorHandler.printTokenLine(token);
                System.out.println("cant redefined Int.");
            }
            else if(dupl.matchName("IO")){
                System.out.println("type");
                ErrorHandler.printTokenLine(token);
                System.out.println("cant redefined IO.");
            }
            else if(dupl.matchName("String")){
                System.out.println("type");
                ErrorHandler.printTokenLine(token);
                System.out.println("cant redefined String.");
            }
            else if(dupl.matchName("Bool")){
                System.out.println("type");
                ErrorHandler.printTokenLine(token);
                System.out.println("cant redefined Bool.");
            }
            else{
                Type t =new Type(name,parent);
                t.setToken(token);
                ErrorHandler.duplicateTypes(dupl,t);
            }
            return;
        }
        types.add(new Type(name, parent));
        head.push(types.get(types.size() - 1));
        head.peek().setToken(token);
    }

    public void endNode(){
        if(!head.empty())
            head.pop();
        else {
            //TODO: throw exsp
        }
    }

    public void completeGraph() throws Pass2Error {
        for(Type n: types){
            if(n.getFather()==null && !n.matchName("Object")){
                Type father = null;
                for(Type f: types){
                    if(f.isInheritable() && f.matchName(n.getFatherName())){
                        father = f;
                        break;
                    }
                }
                if(father==null){
                    ErrorHandler.noSuchParent(n);
                    n.setFather(types.get(0));
                }
                else{
                    n.setFather(father);
                }
            }
        }
        for (Type n : types){
            for(Attribute a: n.getAttributes()){
                Type atType = null;
                for(Type t:types){
                    if(t.matchName(a.getType().getName())){
                        atType = t;
                        break;
                    }
                }
                if(atType==null && !a.getType().isSelfType()){
                    ErrorHandler.noSuchType(a.getToken(),false);
                }
                else if(atType!=null){
                    a.setType(atType);
                }
                //TODO: self type check?
            }
            for(Method m:n.getMethods()){
                Type atType = null;
                for(Type t:types){
                    if(t.matchName(m.getReturnType().getName())){
                        atType = t;
                    }
                }
                if(atType==null && !m.getReturnType().isSelfType()){
                    ErrorHandler.noSuchType(m.getToken(),false);
                }
                else if(atType!=null){
                    m.setReturnType(atType);
                }
                //TODO: self type?
            }
        }
    }

    private boolean dfs(TreeMap<Type, color> mark, Type head){
        boolean ret = false;
        if(mark.get(head).equals(color.gray)) {
            ErrorHandler.cyclicGraph(head);
            return true;
        }
        else if(mark.get(head).equals(color.black))
            return false;
        mark.put(head,color.gray);
        if(head.getFather()!=null)
            ret = dfs(mark, head.getFather());
        mark.put(head,color.black);
        return ret;
    }

    public Boolean isCyclic(){
        TreeMap<Type, color> mark = new TreeMap<Type, color>();
        for (int i = 0; i < types.size(); i++) {
            mark.put(types.get(i), color.white);
        }
        for (Type n : types) {
            if(mark.get(n).equals(color.white)) {
                if(dfs(mark,n))
                    return true;
            }
        }
        return false;
    }

    public boolean haveMain(){
        Type m = new Type("Main");
        if(types.contains(m)) {
            Type main = types.get(types.indexOf(m));
            for(Method mm:main.getMethods()){
                if(mm.matchName("main")){
                    if(mm.getFormals().size()==0)
                        return true;
                    else
                        break;
                }
            }
        }
        return false;
    }

    public boolean isRedefined(){
        boolean ret = false;
        for(Type t: types){
            ArrayList<Attribute> attributes = (ArrayList<Attribute>)t.getAttributes().clone();
            Type par = t;
            while(!par.matchName("Object")){
                par = par.getFather();
                for(Attribute ta:attributes){
                    if(par.getAttributes().contains(ta)){
                        Attribute dupl = par.getAttributes().get(par.getAttributes().indexOf(ta));
                        ErrorHandler.invalidFeatureRedefine(ta,dupl);
                        ret =  true;
                    }
                }
                attributes.addAll(par.getAttributes());
            }
        }
        for(Type t: types){
            ArrayList<Method> methods = (ArrayList<Method>)t.getMethods().clone();
            Type par = t;
            while(!par.matchName("Object")){
                par = par.getFather();
                for(Method ta:methods){
                    if(par.getMethods().contains(ta)){
                        int index = par.getMethods().indexOf(ta);
                        Method dupl = par.getMethods().get(index);
                        if (dupl.getFormals().size() == ta.getFormals().size()){
                            for (int i = 0; i < dupl.getFormals().size(); i++) {
                                if(!dupl.getFormals().get(i).exactlyEqual(ta.getFormals().get(i))){
                                    ErrorHandler.invalidFeatureRedefine(dupl.getFormals().get(i),ta.getFormals().get(i));
                                    ret =  true;
                                }
                            }
                            //TODO: Aida, inja mishe fahmid ye tabe override shode ya na too pass badi shayad be dard bokhore
                        }
                    }
                }
                methods.addAll(par.getMethods());
            }
        }
        return ret ;
    }

    public Type getType(String name){
        for(Type t: types){
            if(t.matchName(name))
                return t;
        }
        return null;
    }

    public boolean typeExists(String name){
        return (getType(name)==null);
    }

    public boolean isFather(Type father, Type child){
        child = getType(child.getName());
        father = getType(father.getName());
        if(father.equals(types.get(0)))
            return true;
        Type t = child;
        while(!t.equals(types.get(0))){
            if(t.equals(father))
                return true;
            t = t.getFather();
        }
        return false;
    }

    public Type grandMate(Type t1, Type t2){
        t1 = getType(t1.getName());
        t2 = getType(t2.getName());
        TreeSet<Type> ancestors = new TreeSet<Type>();
        Type t = t1;
        while(!t.equals(types.get(0))){
            ancestors.add(t);
            t = t.getFather();
        }
        t = t2;
        while(!t.equals(types.get(0))){
            if(ancestors.contains(t))
                return t;
            t = t.getFather();
        }
        return types.get(0);
    }

    public void printTypes(){
        for(Type t : types){
            System.out.println(""+t);
            for(Attribute a:t.getAttributes()){
                System.out.println("\t"+a);
            }
            for(Method m:t.getMethods()){
                System.out.println("\t"+m);
                for(Formal f:m.getFormals()){
                    System.out.println("\t\t"+f);
                }
            }
        }
    }

    public void addToHead(Method method) {
        head.peek().addMethod(method);
    }

    public void addToHead(Attribute attribute) {
        head.peek().addAttribute(attribute);
    }

    public Method getMethodDFS(Type type, String method){
        Type t = getType(type.getName());
        while(!t.equals(types.get(0))){
            if(t.getMethod(method)!=null){
                return t.getMethod(method);
            }
            t = t.getFather();
        }
        return null;
    }

    public Attribute getAttributeDFS(Type type, String attr){
        Type t = getType(type.getName());
        Attribute a = new Attribute(attr,t);
        while(!t.equals(types.get(0))){
            if(t.getAttributes().contains(a)){
                return t.getAttributes().get(t.getAttributes().indexOf(a));
            }
            t = t.getFather();
        }
        return null;
    }



    public boolean isInheritedAttribute(Type type, String attr){
        return !(getAttributeDFS(type, attr)==null);
    }

    private enum color{
        white,black,gray;
    }
}
