package net.objecthunter.exp4j.tokenizer;

public class StringToken extends Token {
    private final String value;

    public String getValue() {
        return value;
    }

    public StringToken(String value) {
        super(TOKEN_STRING);
        this.value = value;
    }
    
}
