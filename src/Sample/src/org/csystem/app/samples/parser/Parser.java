package org.csystem.app.samples.parser;

public class Parser {
    private Source m_source;

    public Parser()
    {
    }

    public Parser(Source source)
    {
        setSource(source);
    }

    public void setSource(Source source)
    {
        //...
        m_source = source;
    }

    public int doParseForDigits()
    {
        m_source.reset();
        int count = 0;
        int c;

        while ((c = m_source.getNextChar()) != -1)
            if (Character.isDigit(c))
                ++count;

        return count;
    }

    public int doParseForWhitespaces()
    {
        m_source.reset();
        int count = 0;
        int c;

        while ((c = m_source.getNextChar()) != -1)
            if (Character.isWhitespace(c))
                ++count;

        return count;
    }
    //...
}
