package home.pmyn;

import home.pmyn.antlr.parser.DefaultVisitor;
import home.pmyn.antlr.PmynLexer;
import home.pmyn.antlr.PmynParser;
import java.io.IOException;
import java.util.Collections;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class FunctionApp {

  public static void main(String[] args) throws IOException {
    //String fileName = "src/main/resources/code/if_else_stmt.pmyn";
    //String fileName = "src/test/resources/code/function_map.pmyn";
    String fileName = "src/test/resources/code/arithmetic_expression.pmyn";
    CharStream input = CharStreams.fromFileName(fileName);
    PmynLexer lexer = new PmynLexer(input);
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    PmynParser parser = new PmynParser(tokens);
    ParseTree parseTree = parser.compilationUnit();

    DefaultVisitor visitor = new DefaultVisitor();
    visitor.visit(parseTree);
  }
}
