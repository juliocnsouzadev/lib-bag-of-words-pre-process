package it.workfy.commons.words.bag;

/**
 *
 * @author julio
 */
class Normalizer {

    public static String normailze( String text ) {
        String newText = String.valueOf( text.toLowerCase() );
        newText = newText.replaceAll( "/[^\\w]/" , " " );
        newText = newText.replaceAll( DOT , " " );
        newText = newText.replaceAll( COMMA , " " );
        newText = newText.replaceAll( ";$" , " " );
        newText = newText.replaceAll( ":$" , " " );
        newText = newText.replace( "'" , " " );
        newText = newText.replace( "\"" , " " );
        newText = newText.replaceAll( "”$" , " " );
        newText = text.replaceAll( "\\s+" , " " );
        return newText;
    }
    public static final String COMMA = ",$";
    public static final String DOT = "\\.";

}
