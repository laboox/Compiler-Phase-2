import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ANTLRInputStream;

import java.io.FileReader;
import java.io.IOException;

/**
 * Created by sina on 12/23/14.
 */
public class Main {

    private static InheritanceGraph typesGraph;
    private static SymbolTable symbolTable;

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
        coolFile.close();
        coolFile = new FileReader(args[0]);
        cool2Lexer lexer2 = new cool2Lexer(new ANTLRInputStream(coolFile));

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CommonTokenStream tokens2 = new CommonTokenStream(lexer2);

        typesGraph = new InheritanceGraph();
        pass1Parser pass1 = new pass1Parser(tokens, typesGraph);
        pass1.cool();
        try {
            typesGraph.completeGraph();
        } catch (Pass2Error pass2Error) {
        }
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
        typesGraph.printTypes();

        symbolTable = new SymbolTable(typesGraph);
        pass2Parser pass2 = new pass2Parser(tokens2, symbolTable);
        try {
            pass2.cool();
        } catch (Pass2Error pass2Error) {
            System.out.println("pass2 error comes. cant continue!");
            System.exit(0);
        }
    }
}
