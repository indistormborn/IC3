package recovery;

import parser.*;

import java.util.*;


public class First { //implementa os conjuntos first p/ alguns n.terminais

    static public final RecoverySet methoddecl = new RecoverySet();
    static public final RecoverySet vardecl = new RecoverySet();
    static public final RecoverySet classlist = new RecoverySet();
    static public final RecoverySet constructdecl = new RecoverySet();
    static public final RecoverySet statlist = new RecoverySet();
    static public final RecoverySet program = classlist;

    static {
        methoddecl.add(new Integer(LangXConstants.INT));
        methoddecl.add(new Integer(LangXConstants.STRING));
        methoddecl.add(new Integer(LangXConstants.IDENTIFIER));
        methoddecl.add(new Integer(LangXConstants.CHAR));
        methoddecl.add(new Integer(LangXConstants.FLOAT));

        vardecl.add(new Integer(LangXConstants.INT));
        vardecl.add(new Integer(LangXConstants.STRING));
        vardecl.add(new Integer(LangXConstants.IDENTIFIER));
        vardecl.add(new Integer(LangXConstants.CHAR));
        vardecl.add(new Integer(LangXConstants.FLOAT));
        vardecl.add(new Integer(LangXConstants.BOOLEAN));

        classlist.add(new Integer(LangXConstants.CLASS));

        constructdecl.add(new Integer(LangXConstants.CONSTRUCTOR));

        statlist.addAll(vardecl);
        statlist.add(new Integer(LangXConstants.IDENTIFIER)); // first do atribstat
        statlist.add(new Integer(LangXConstants.PRINT));
        statlist.add(new Integer(LangXConstants.READ));
        statlist.add(new Integer(LangXConstants.RETURN));
        statlist.add(new Integer(LangXConstants.SUPER));
        statlist.add(new Integer(LangXConstants.IF));
        statlist.add(new Integer(LangXConstants.FOR));
        statlist.add(new Integer(LangXConstants.LBRACE));
        statlist.add(new Integer(LangXConstants.BREAK));
        statlist.add(new Integer(LangXConstants.SEMICOLON));       
    }
}
