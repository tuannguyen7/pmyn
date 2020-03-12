package home.pmyn;

import home.pmyn.antlr.PmynLexer;
import home.pmyn.antlr.PmynParser;
import home.pmyn.antlr.parser.MyVisitor;
import java.io.IOException;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Test;

public class TestPmyn {

  @Test
  public void testParentheses() throws IOException {
    CharStream input = CharStreams.fromFileName("src/test/resources/test_parentheses1.pmyn");
    PmynLexer lexer = new PmynLexer(input);
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    PmynParser parser = new PmynParser(tokens);
    ParseTree parseTree = parser.compilationUnit();

    MyVisitor visitor = new MyVisitor();
    visitor.visit(parseTree);
  }
}
