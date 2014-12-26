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
        if(args.length<=0){
            System.out.println("Please Enter the file name.");
            System.exit(0);
        }
        FileReader coolFile = new FileReader(args[0]);
        ErrorHandler.setCoolFile(coolFile);
        coolFile.close();
        coolFile = new FileReader(args[0]);

        coolLexer lexer = new coolLexer(new ANTLRInputStream(coolFile));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        typesGraph = new InheritanceGraph();
        coolParser cp = new coolParser(tokens, typesGraph);
        cp.cool();
        typesGraph.completeGraph();
        System.out.println("graph isCyclic: " + typesGraph.isCyclic());
    }
}
