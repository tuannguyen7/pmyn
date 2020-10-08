package home.pmyn;

import home.pmyn.antlr.parser.MyVisitor;
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
    //CharStream input = CharStreams.fromFileName("src/main/resources/test_func2.pmyn");
    //CharStream input = CharStreams.fromFileName("src/main/resources/test_map.pmyn");
    //CharStream input = CharStreams.fromFileName("src/main/resources/code/test_creating_object.pmyn");
    //CharStream input = CharStreams.fromFileName("src/main/resources/code/mock_order_01.pmyn");
    CharStream input = CharStreams.fromFileName("src/main/resources/code/mock_order_02.pmyn");
    PmynLexer lexer = new PmynLexer(input);
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    PmynParser parser = new PmynParser(tokens);
    ParseTree parseTree = parser.compilationUnit();

    MyVisitor visitor = new MyVisitor(Collections.emptyMap());
    visitor.visit(parseTree);

  }
}
