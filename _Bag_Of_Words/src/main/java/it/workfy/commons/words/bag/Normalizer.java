package it.workfy.commons.words.bag;

/**
 *
 * @author julio
 */
class Normalizer {

    public static String normailze( String text ) {
        if ( text == null ) {
            return "";
        }
        String newText = String.valueOf( text.toLowerCase() );
        newText = newText.replaceAll( "/[^\\w]/" , " " );
        newText = newText.replace( DOT , " " );
        newText = newText.replace( "'" , " " );
        newText = newText.replace( "\"" , " " );
        newText = newText.replaceAll( "\\s+" , " " );
        return newText;
    }
    public static final String DOT = "\\.";

}
