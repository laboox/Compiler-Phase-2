import org.antlr.v4.runtime.Token;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by sina on 12/26/14.
 */
public class ErrorHandler {

    static private ArrayList<String> lines;

    public static void setCoolFile(FileReader coolFile) throws IOException {
        BufferedReader coolFileReader = new BufferedReader(coolFile);
        lines = new ArrayList<String>();
        while(coolFileReader.ready()){
            lines.add(coolFileReader.readLine());
        }
        coolFileReader.close();
    }

    static void printTokenLine(Token t){
        int ln = t.getLine();
        int sc = t.getStartIndex();
        System.out.printf("in line: %d at char: %d\n%s\n",ln,sc,lines.get(ln));
        for (int i = 0; i <sc-1 ; i++) {
            System.out.print(' ');
        }
        System.out.println("^\n");
    }

    static void duplicateTypes(Type t1, Type t2){
        System.out.printf("types\n");
        printTokenLine(t1.getToken());
        printTokenLine(t2.getToken());
        System.out.println("are redefined.");
    }
}
