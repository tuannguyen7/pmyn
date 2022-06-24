package home.pmyn;

import home.pmyn.antlr.PmynLexer;
import home.pmyn.antlr.PmynParser;
import home.pmyn.antlr.parser.DefaultVisitor;
import java.io.IOException;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DefaultPmynTestSuite {

  Logger log = LoggerFactory.getLogger(this.getClass());

  public void compare(String in, String out) {
    CharStream input = null;
    try {
      input = CharStreams.fromFileName(in);
    } catch (IOException e) {
      log.error("Error reading " + out, e);
      return;
    }
    PmynLexer lexer = new PmynLexer(input);
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    PmynParser parser = new PmynParser(tokens);
    ParseTree parseTree = parser.compilationUnit();

    DefaultVisitor visitor = new DefaultVisitor();
    visitor.visit(parseTree);
  }
}
