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
        Type Obj = new Type("Object");
        types.add(Obj);
        types.add(new Type("IO", Obj));
        types.add(new Type("String", Obj));
        types.add(new Type("Int", Obj));
        types.add(new Type("Bool", Obj));
        head = new Stack<Type>();
    }

    public void AddNode(String name, String parent){
        if(types.contains(name)){
            //TODO: handle duplicate type name
        }
        types.add(new Type(name, parent));
        head.push(types.get(types.size()-1));
    }

    public void endNode(){
        if(!head.empty())
            head.pop();
        else {
            //TODO: throw exsp
        }
    }

    public void completeGraph(){
        for(Type n: types){
            if(n.getFather()==null && !n.matchName("Object")){
                Type father = null;
                for(Type f: types){
                    if(f.matchName(n.getFatherName())){
                        father = f;
                        break;
                    }
                }
                if(father==null){
                    //TODO: handle no such father
                }
                else{
                    n.setFather(father);
                }
            }
            if(!n.getName().matches("Object"))
                System.err.println(""+n.getName()+" is "+n.getFather().getName()+"'s child!");
        }
        for (Type n : types){
            for(Attribute a: n.getAttributes()){
                Type atType = null;
                for(Type t:types){
                    if(t.matchName(a.getType().getName())){
                        atType = t;
                    }
                }
                if(atType==null && !a.getType().isSelfType()){
                    //TODO: no such type error
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
                    //TODO: no such type error
                }
                else if(atType!=null){
                    m.setReturnType(atType);
                }
            }
        }
    }

    private boolean dfs(TreeMap<Type, color> mark, Type head){
        boolean ret = false;
        if(mark.get(head).equals(color.gray))
            return true;
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

    public boolean isRedefined(){
        for(Type t: types){
            ArrayList<Attribute> attributes = (ArrayList<Attribute>)t.getAttributes().clone();
            Type par = t;
            while(!par.matchName("Object")){
                par = par.getFather();
                for(Attribute ta:attributes){
                    if(par.getAttributes().contains(ta)){
                        //TODO: redefined attribute error
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
                        if (!dupl.getFormals().equals(ta.getFormals())){
                            //TODO: redefined method error
                        }
                    }
                }
                methods.addAll(par.getMethods());
            }
        }
        return false;
    }

    public void addToHead(Method method) {
        head.peek().addMethod(method);
    }

    public void addToHead(Attribute attribute) {
        head.peek().addMethod(attribute);
    }

    private enum color{
        white,black,gray;
    }
}
