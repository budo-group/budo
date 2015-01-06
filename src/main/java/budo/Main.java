package budo;

import java.io.FileInputStream;

import org.antlr.v4.runtime.ANTLRInputStream;

public class Main {
    public static void main(String[] args) throws Throwable {
        ANTLRInputStream antlrInputStream = new ANTLRInputStream(new FileInputStream("asdf.qwe"));
        System.err.println(antlrInputStream);
        // CommonTokenStream commonTokenStream=
    }
}