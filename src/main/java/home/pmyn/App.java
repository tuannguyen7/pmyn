package home.pmyn;

import home.pmyn.antlr.parser.DefaultVisitor;
import home.pmyn.antlr.PmynLexer;
import home.pmyn.antlr.PmynParser;
import home.pmyn.antlr.parser.LoggingListener;
import home.pmyn.antlr.parser.VisitorListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class App {

  public static void main(String[] args) throws IOException {
    App app = new App();
    String fileName = "src/test/resources/code/inner_scope.pmyn";

    if (args.length == 0) {
      app.readFile(fileName);
      return;
    }

    String firstArg = args[0];
    if ("-i".equals(firstArg)) {
      app.interactive();
    } else {
      app.readFile(firstArg);
    }
  }

  public void readFile(String fileName) throws IOException {
    CharStream input = CharStreams.fromFileName(fileName);
    PmynLexer lexer = new PmynLexer(input);
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    PmynParser parser = new PmynParser(tokens);
    ParseTree parseTree = parser.compilationUnit();

    DefaultVisitor visitor = new DefaultVisitor();
    visitor.visit(parseTree);
  }

  public void interactive() {
    try {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String stmt = br.readLine();
      int line = 1;
      PmynParser parser = new PmynParser(null);
      DefaultVisitor visitor = new DefaultVisitor();
      VisitorListener listener = new LoggingListener();
      visitor.addListener(listener);

      while (stmt != null) {
        if (stmt.length() == 0) {
          continue;
        }
        stmt += "\n";

        if (isEndWithOpenBracket(stmt)) {
          // wait for the } to close block code
          while (!isEndWithCloseBracket(stmt)) {
            stmt += br.readLine() + "\n";
            line++;
          }
        }

        CharStream input = CharStreams.fromString(stmt+"\n");
        PmynLexer lexer = new PmynLexer(input);
        lexer.setLine(line);
        lexer.setCharPositionInLine(0);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        parser.setInputStream(tokens);
        visitor.visit(parser.stat());

        stmt = br.readLine();
        line++;
      }
    } catch (Exception e) {
      System.out.println(e);
    }
  }

  public static boolean isEndWithOpenBracket(String s) {
    return s.length() > 0 && s.charAt(s.length() - 2) == '{';
  }

  public static boolean isEndWithCloseBracket(String s) {
    return s.length() > 0 && s.charAt(s.length() - 2) == '}';
  }
}
