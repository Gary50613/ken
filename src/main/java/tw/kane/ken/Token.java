package tw.kane.ken;

public class Token {

    public TokenType type;
    public String value;
    public Position position;

    public Token(TokenType type, String value, Position position) {
        this.type = type;
        this.value = value;
        this.position = new Position();
        this.position.jumpTo(position.col, position.row);
    }

    public static String[] DIGITS = {"0","1","2","3","4","5","6","7","8","9"};

    public enum TokenType {
        SPACE(" "),
        PLUS("+"),
        MINUS("-"),
        MULTIPLE("*"),
        DIV("/"),
        LPAREN("("),
        RPAREN(")"),
        MID_LPAREN("["),
        MID_RPAREN("]"),
        BIG_LPAREN("{"),
        BIG_RPAREN("}"),
        QUOTE("\""),
        SINGLE_QUOTE("'"),
        COMMA(","),
        SEMICOLON(";"),
        ESCAPE("\\"),
        NEW_LINE("\n"),
        STRING("STRING"),
        INTEGER("INTEGER"),
        VARIABLE("VARIABLE"),
        FLOAT("FLOAT"),
        TRUE("true"),
        FALSE("false"),
        FUNCTION("function"),
        IF("if"),
        ELSE("else"),
        LET("let "),
        METHOD("method");

        private final String name;

        TokenType(String name) {
            this.name = name;
        }

        public int length() {
            return name.length();
        }

        public String getName() {
            return name;
        }
    }
}
