import java.util.*;

/**
 * Created by sina on 12/23/14.
 */
public class InheritanceGraph {
    ArrayList<ArrayList<Node> > graph;
    ArrayList<Node> nodes;

    public InheritanceGraph() {
        nodes = new ArrayList<Node>();
        Node Obj = new Node("Object");
        nodes.add(Obj);
        nodes.add(new Node("IO",Obj));
        nodes.add(new Node("String", Obj));
        nodes.add(new Node("Int",Obj));
        nodes.add(new Node("Bool", Obj));
    }

    public void AddNode(String name, String parent){
        if(nodes.contains(name)){
            //TODO: handle duplicate type name
        }
        nodes.add(new Node(name,parent));
    }

    public void completeGraph(){
        for(Node n:nodes){
            if(n.getFather()==null && !n.matchName("Object")){
                Node father = null;
                for(Node f: nodes){
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
    }

    private boolean dfs(TreeMap<Node, color> mark, Node head){
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
        TreeMap<Node, color> mark = new TreeMap<Node, color>();
        for (int i = 0; i < nodes.size(); i++) {
            mark.put(nodes.get(i), color.white);
        }
        for (Node n : nodes) {
            if(mark.get(n).equals(color.white)) {
                if(dfs(mark,n))
                    return true;
            }
        }
        return false;
    }

    private enum color{
        white,black,gray;
    }
}
