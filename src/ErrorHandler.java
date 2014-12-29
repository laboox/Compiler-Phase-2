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
    static private boolean anyError = false;

    public static void setAnyError(){
        anyError = true;
    }

    public static boolean isAnyError() {
        return anyError;
    }

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
        int sc = t.getCharPositionInLine() +1;
        System.out.printf("in line: %d at char: %d\n%s\n",ln,sc,lines.get(ln-1));
        anyError =true;
        for (int i = 0; i <sc-1 ; i++) {
            if(Character.isWhitespace(lines.get(ln-1).charAt(i)))
                System.out.print(lines.get(ln - 1).charAt(i));
            else
                System.out.print(" ");
        }
        System.out.println("^");
    }

    static void noSuchParent(Type t){
        System.out.println("parent of type");
        printTokenLine(t.getToken());
        System.out.println("is not defined or is not inheritable.");
        System.out.println();
        anyError =true;
    }

    static void typeErr(Token t) throws Pass2Error {
        System.out.println("static type of expression doesn't conform to type of variable "+t.getText());
        printTokenLine(t);
        System.out.println();
        anyError=true;
        throw new Pass2Error();
    }
    static void duplicateTypes(Type t1, Type t2){
        System.out.println("types");
        printTokenLine(t1.getToken());
        printTokenLine(t2.getToken());
        System.out.println("are redefined.");
        System.out.println();
        anyError =true;
    }

    static void conditionErr(Token t) throws Pass2Error {
        printTokenLine(t);
        System.out.println("condition must has Bool type");
        System.out.println();
        anyError=true;
        throw new Pass2Error();
    }

    public static void noSuchType(Token token, Boolean dostop) throws Pass2Error {
        System.out.println("type of");
        printTokenLine(token);
        System.out.println("not exists.");
        System.out.println();
        anyError =true;
        if(dostop)
            throw new Pass2Error();
    }

    public static void invalidIdRedefined(Token token) throws Pass2Error {
        System.out.println("variable "+token.getText()+" is redefined in this scope");
        printTokenLine(token);
        anyError=true;
        throw new Pass2Error();
    }

    public static void noSuchVar(Token token) throws Pass2Error {
        System.out.println("variable " + token.getText());
        printTokenLine(token);
        System.out.println("is not defined in this scope.");
        System.out.println();
        anyError =true;
        throw new Pass2Error();
    }

    public static void invalidFeatureRedefine(Feature f1, Feature f2){
        System.out.println("features");
        printTokenLine(f1.getToken());
        printTokenLine(f2.getToken());
        System.out.println("are redefined invalidly.");
        System.out.println();
        anyError =true;
    }

    public static void invalidFeatureName(Feature f){
        System.out.println("cant name feature");
        printTokenLine(f.getToken());
        System.out.println(f.getName());
        System.out.println();
        anyError =true;
    }

    public static void repeatedFormals(Formal f1, Formal f2){
        System.out.println("formals");
        printTokenLine(f1.getToken());
        printTokenLine(f2.getToken());
        System.out.println("are repeated.");
        anyError =true;
    }

    public static void cyclicGraph(Type head) {
        System.out.println("inheritance graph is cyclic");
        String start = head.getName();
        while(!head.getFather().matchName(start)){
            System.out.print(head.getName() + " -> ");
            head = head.getFather();
        }
        System.out.println(start);
        anyError =true;
    }

    public static void exitScopeErr() {
        System.out.println("existScope: can't remove scope from an empty symbol table.");
        System.out.println();
        anyError =true;
    }

    public static void lookUpErr() {
        System.out.println("lookup: no scope in symbol table.");
        System.out.println();
        anyError =true;
    }

    public static void probErr() {
        System.out.println("lookup: no scope in symbol table.");
        System.out.println();
        anyError =true;
    }

    public static void addIdErr() {
        System.out.println("addId: can't add a symbol without a scope.");
        System.out.println();
        anyError =true;
    }

    public static void noSuchMethod(Token token) throws Pass2Error {
        System.out.println("method");
        printTokenLine(token);
        System.out.println("not defines.");
        anyError = true;
        throw new Pass2Error();
    }

    public static void invalidArgType(Token token) throws Pass2Error {
        System.out.println("argument");
        printTokenLine(token);
        System.out.println("is not valid.");
        System.out.println();
        anyError = true;
        throw new Pass2Error();
    }

    public static void unopErr(Token token, String type) throws Pass2Error {
        System.out.println("operation on");
        printTokenLine(token);
        System.out.println("performed on "+type+". that not supported.");
        System.out.println();
        anyError = true;
        throw new Pass2Error();
    }

    public static void biopErr(Token t1,Token t2, String type1, String type2) throws Pass2Error {
        System.out.println("operation on");
        printTokenLine(t1);
        System.out.println("&");
        printTokenLine(t2);
        System.out.println("performed on " + type1 + " and " + type2 + ". that not supported.");
        System.out.println();
        anyError = true;
        throw new Pass2Error();
    }

    public static void invalidSelfUsage(Token t, boolean dostop) throws Pass2Error {
        System.out.println("invalid use of self word");
        printTokenLine(t);
        System.out.println();
        anyError = true;
        if(dostop)
            throw new Pass2Error();
    }

    public static void notAncestor(Token token, Type t1, Type t2) throws Pass2Error {
        System.out.println("type "+t1.getName()+" is not ancestor of "+t2.getName());
        printTokenLine(token);
        System.out.println();
        anyError = true;
        throw new Pass2Error();
    }
}
