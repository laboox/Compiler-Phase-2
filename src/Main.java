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
        if(!typesGraph.haveMain()){
            System.out.println("no main function found.");
            System.out.println();
            ErrorHandler.setAnyError();
        }
        if(typesGraph.isCyclic()){
            System.out.println("Cant perform any other error check! pls solve this.");
            System.out.println();
            System.exit(0);
        }
        typesGraph.isRedefined();
        if(ErrorHandler.isAnyError()){
            System.out.println("Cant continue compile because of errors.");
            System.out.println();
            System.exit(0);
        }

        System.out.println(typesGraph.isFather(new Type("A"), new Type("A")));
        System.out.println(typesGraph.isFather(new Type("D"),new Type("C")));
        System.out.println(typesGraph.isFather(new Type("C"), new Type("A")));
        System.out.println(typesGraph.grandMate(new Type("F"),new Type("C")));
        System.out.println(typesGraph.grandMate(new Type("B"),new Type("A")));
        System.out.println(typesGraph.grandMate(new Type("D"), new Type("Object")));
        System.out.println(typesGraph.grandMate(new Type("D"), new Type("C")));

        //System.out.println("graph isCyclic: " + typesGraph.isCyclic());
    }
}
