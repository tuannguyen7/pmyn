package home.pmyn;

import home.pmyn.antlr.PmynLexer;
import home.pmyn.antlr.PmynParser;
import home.pmyn.antlr.parser.DefaultVisitor;
import java.io.IOException;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Test;

public class TestPmyn {

  @Test
  public void testParentheses() throws IOException {
    CharStream input = CharStreams.fromFileName("src/test/resources/code/test_parentheses1.pmyn");
    PmynLexer lexer = new PmynLexer(input);
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    PmynParser parser = new PmynParser(tokens);
    ParseTree parseTree = parser.compilationUnit();

    DefaultVisitor visitor = new DefaultVisitor();
    visitor.visit(parseTree);
  }

  @Test
  public void testParenObject() throws IOException {
    CharStream input = CharStreams.fromFileName("src/test/resources/code/object_reference.pmyn");
    PmynLexer lexer = new PmynLexer(input);
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    PmynParser parser = new PmynParser(tokens);
    ParseTree parseTree = parser.compilationUnit();

    DefaultVisitor visitor = new DefaultVisitor();
    visitor.visit(parseTree);
  }

  @Test
  public void testCreatingArray() throws IOException {
    CharStream input = CharStreams.fromFileName("src/test/resources/code/array_creating.pmyn");
    PmynLexer lexer = new PmynLexer(input);
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    PmynParser parser = new PmynParser(tokens);
    ParseTree parseTree = parser.compilationUnit();

    DefaultVisitor visitor = new DefaultVisitor();
    visitor.visit(parseTree);
  }

  @Test
  public void testGettingElementByIndexArray() throws IOException {
    CharStream input = CharStreams.fromFileName("src/test/resources/code/list_index.pmyn");
    PmynLexer lexer = new PmynLexer(input);
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    PmynParser parser = new PmynParser(tokens);
    ParseTree parseTree = parser.compilationUnit();

    DefaultVisitor visitor = new DefaultVisitor();
    visitor.visit(parseTree);
  }

  @Test
  public void testFunctionMap() throws IOException {
    CharStream input = CharStreams.fromFileName("src/test/resources/code/function_map.pmyn");
    PmynLexer lexer = new PmynLexer(input);
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    PmynParser parser = new PmynParser(tokens);
    ParseTree parseTree = parser.compilationUnit();

    DefaultVisitor visitor = new DefaultVisitor();
    visitor.visit(parseTree);
  }

  @Test
  public void testFunctionScope() throws IOException {
    CharStream input = CharStreams.fromFileName("src/test/resources/code/function_scope.pmyn");
    PmynLexer lexer = new PmynLexer(input);
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    PmynParser parser = new PmynParser(tokens);
    ParseTree parseTree = parser.compilationUnit();

    DefaultVisitor visitor = new DefaultVisitor();
    visitor.visit(parseTree);
  }
}
