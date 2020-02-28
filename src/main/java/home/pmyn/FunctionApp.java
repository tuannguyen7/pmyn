package home.pmyn;

import home.pmyn.antlr.parser.MyVisitor;
import home.pmyn.antlr.PmynLexer;
import home.pmyn.antlr.PmynParser;
import java.io.IOException;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class FunctionApp {

  public static void main(String[] args) throws IOException {
    CharStream input = CharStreams.fromFileName("src/main/resources/test_func2.pmyn");
    //CharStream input = CharStreams.fromFileName("src/main/resources/HelloWorld.pmyn");
    PmynLexer lexer = new PmynLexer(input);
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    PmynParser parser = new PmynParser(tokens);
    ParseTree parseTree = parser.compilationUnit();

    MyVisitor visitor = new MyVisitor();
    visitor.visit(parseTree);

  }
}
