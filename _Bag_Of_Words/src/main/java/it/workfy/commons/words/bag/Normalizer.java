/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.workfy.commons.words.bag;

/**
 *
 * @author julio
 */
public class Normalizer {

    public String normailze( String text ) {
        String newText = String.valueOf( text.toLowerCase() );
        newText = newText.replaceAll( "/[^\\w]/" , " " );
        newText = text.replaceAll( "\\s+" , " " );
        newText = StopWordsUtil.removeStopWords( newText );
        return newText;
    }

}
