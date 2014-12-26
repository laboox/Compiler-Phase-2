import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ANTLRInputStream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by sina on 12/23/14.
 */
public class Main {

    private static InheritanceGraph typesGraph;

    public static void main(String[] args) throws IOException {
        coolBaseListener cbl = new coolBaseListener();
        coolLexer cl = new coolLexer(new ANTLRInputStream(new FileReader("/home/aida/IdeaProjects/coolP2/examples/er1.cl")));
        org.antlr.v4.runtime.CommonTokenStream tokens = new org.antlr.v4.runtime.CommonTokenStream(cl);
        typesGraph = new InheritanceGraph();
        coolParser cp = new coolParser(tokens, typesGraph);
        cp.cool();
        typesGraph.completeGraph();
        System.out.println("graph isCyclic: " + typesGraph.isCyclic());
    }
}
