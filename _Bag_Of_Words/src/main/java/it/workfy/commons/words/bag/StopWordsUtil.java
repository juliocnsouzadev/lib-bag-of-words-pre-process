package it.workfy.commons.words.bag;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author julio
 */
class StopWordsUtil {

    public static final List<String> STOP_WORDS = new ArrayList<>();

    public static List<String> removeStopWords( String text ) {
        if ( text == null ) {
            return null;
        }

        List<String> newWords = new ArrayList<>();

        for ( String word : text.toLowerCase().split( " " ) ) {

            if ( word == null ) {
                continue;
            }

            word = word.replace( "\"" , "" )
                    .replace( "'" , "" )
                    .replace( "\\." , "" )
                    .replace( "," , "" )
                    .replace( ":" , "" )
                    .replace( "*" , "" )
                    .replace( "!" , "" )
                    .replace( "?" , "" )
                    .replace( ";" , "" );

            if ( word.isEmpty() ) {
                continue;
            }

            if ( STOP_WORDS.contains( word ) ) {
                continue;
            }
            newWords.add( word );
        }

        return newWords;
    }

    static {
        STOP_WORDS.add( "de" );
        STOP_WORDS.add( "a" );
        STOP_WORDS.add( "o" );
        STOP_WORDS.add( "que" );
        STOP_WORDS.add( "e" );
        STOP_WORDS.add( "do" );
        STOP_WORDS.add( "da" );
        STOP_WORDS.add( "em" );
        STOP_WORDS.add( "um" );
        STOP_WORDS.add( "para" );
        STOP_WORDS.add( "é" );
        STOP_WORDS.add( "com" );
        STOP_WORDS.add( "não" );
        STOP_WORDS.add( "uma" );
        STOP_WORDS.add( "os" );
        STOP_WORDS.add( "no" );
        STOP_WORDS.add( "se" );
        STOP_WORDS.add( "na" );
        STOP_WORDS.add( "por" );
        STOP_WORDS.add( "mais" );
        STOP_WORDS.add( "as" );
        STOP_WORDS.add( "dos" );
        STOP_WORDS.add( "como" );
        STOP_WORDS.add( "mas" );
        STOP_WORDS.add( "foi" );
        STOP_WORDS.add( "ao" );
        STOP_WORDS.add( "ele" );
        STOP_WORDS.add( "das" );
        STOP_WORDS.add( "tem" );
        STOP_WORDS.add( "à" );
        STOP_WORDS.add( "seu" );
        STOP_WORDS.add( "sua" );
        STOP_WORDS.add( "ou" );
        STOP_WORDS.add( "ser" );
        STOP_WORDS.add( "quando" );
        STOP_WORDS.add( "muito" );
        STOP_WORDS.add( "há" );
        STOP_WORDS.add( "nos" );
        STOP_WORDS.add( "já" );
        STOP_WORDS.add( "está" );
        STOP_WORDS.add( "eu" );
        STOP_WORDS.add( "também" );
        STOP_WORDS.add( "só" );
        STOP_WORDS.add( "pelo" );
        STOP_WORDS.add( "pela" );
        STOP_WORDS.add( "até" );
        STOP_WORDS.add( "isso" );
        STOP_WORDS.add( "ela" );
        STOP_WORDS.add( "entre" );
        STOP_WORDS.add( "era" );
        STOP_WORDS.add( "depois" );
        STOP_WORDS.add( "sem" );
        STOP_WORDS.add( "mesmo" );
        STOP_WORDS.add( "aos" );
        STOP_WORDS.add( "ter" );
        STOP_WORDS.add( "seus" );
        STOP_WORDS.add( "quem" );
        STOP_WORDS.add( "nas" );
        STOP_WORDS.add( "me" );
        STOP_WORDS.add( "esse" );
        STOP_WORDS.add( "eles" );
        STOP_WORDS.add( "estão" );
        STOP_WORDS.add( "você" );
        STOP_WORDS.add( "tinha" );
        STOP_WORDS.add( "foram" );
        STOP_WORDS.add( "essa" );
        STOP_WORDS.add( "num" );
        STOP_WORDS.add( "nem" );
        STOP_WORDS.add( "suas" );
        STOP_WORDS.add( "meu" );
        STOP_WORDS.add( "às" );
        STOP_WORDS.add( "minha" );
        STOP_WORDS.add( "têm" );
        STOP_WORDS.add( "numa" );
        STOP_WORDS.add( "pelos" );
        STOP_WORDS.add( "elas" );
        STOP_WORDS.add( "havia" );
        STOP_WORDS.add( "seja" );
        STOP_WORDS.add( "qual" );
        STOP_WORDS.add( "será" );
        STOP_WORDS.add( "nós" );
        STOP_WORDS.add( "tenho" );
        STOP_WORDS.add( "lhe" );
        STOP_WORDS.add( "deles" );
        STOP_WORDS.add( "essas" );
        STOP_WORDS.add( "esses" );
        STOP_WORDS.add( "pelas" );
        STOP_WORDS.add( "este" );
        STOP_WORDS.add( "fosse" );
        STOP_WORDS.add( "dele" );
        STOP_WORDS.add( "tu" );
        STOP_WORDS.add( "te" );
        STOP_WORDS.add( "vocês" );
        STOP_WORDS.add( "vos" );
        STOP_WORDS.add( "lhes" );
        STOP_WORDS.add( "meus" );
        STOP_WORDS.add( "minhas" );
        STOP_WORDS.add( "teu" );
        STOP_WORDS.add( "tua" );
        STOP_WORDS.add( "teus" );
        STOP_WORDS.add( "tuas" );
        STOP_WORDS.add( "nosso" );
        STOP_WORDS.add( "nossa" );
        STOP_WORDS.add( "nossos" );
        STOP_WORDS.add( "nossas" );
        STOP_WORDS.add( "dela" );
        STOP_WORDS.add( "delas" );
        STOP_WORDS.add( "esta" );
        STOP_WORDS.add( "estes" );
        STOP_WORDS.add( "estas" );
        STOP_WORDS.add( "aquele" );
        STOP_WORDS.add( "aquela" );
        STOP_WORDS.add( "aqueles" );
        STOP_WORDS.add( "aquelas" );
        STOP_WORDS.add( "isto" );
        STOP_WORDS.add( "aquilo" );
        STOP_WORDS.add( "estou" );
        STOP_WORDS.add( "está" );
        STOP_WORDS.add( "estamos" );
        STOP_WORDS.add( "estão" );
        STOP_WORDS.add( "estive" );
        STOP_WORDS.add( "esteve" );
        STOP_WORDS.add( "estivemos" );
        STOP_WORDS.add( "estiveram" );
        STOP_WORDS.add( "estava" );
        STOP_WORDS.add( "estávamos" );
        STOP_WORDS.add( "estavam" );
        STOP_WORDS.add( "estivera" );
        STOP_WORDS.add( "estivéramos" );
        STOP_WORDS.add( "esteja" );
        STOP_WORDS.add( "estejamos" );
        STOP_WORDS.add( "estejam" );
        STOP_WORDS.add( "estivesse" );
        STOP_WORDS.add( "estivéssemos" );
        STOP_WORDS.add( "estivessem" );
        STOP_WORDS.add( "estiver" );
        STOP_WORDS.add( "estivermos" );
        STOP_WORDS.add( "estiverem" );
        STOP_WORDS.add( "hei" );
        STOP_WORDS.add( "há" );
        STOP_WORDS.add( "havemos" );
        STOP_WORDS.add( "hão" );
        STOP_WORDS.add( "houve" );
        STOP_WORDS.add( "houvemos" );
        STOP_WORDS.add( "houveram" );
        STOP_WORDS.add( "houvera" );
        STOP_WORDS.add( "houvéramos" );
        STOP_WORDS.add( "haja" );
        STOP_WORDS.add( "hajamos" );
        STOP_WORDS.add( "hajam" );
        STOP_WORDS.add( "houvesse" );
        STOP_WORDS.add( "houvéssemos" );
        STOP_WORDS.add( "houvessem" );
        STOP_WORDS.add( "houver" );
        STOP_WORDS.add( "houvermos" );
        STOP_WORDS.add( "houverem" );
        STOP_WORDS.add( "houverei" );
        STOP_WORDS.add( "houverá" );
        STOP_WORDS.add( "houveremos" );
        STOP_WORDS.add( "houverão" );
        STOP_WORDS.add( "houveria" );
        STOP_WORDS.add( "houveríamos" );
        STOP_WORDS.add( "houveriam" );
        STOP_WORDS.add( "sou" );
        STOP_WORDS.add( "somos" );
        STOP_WORDS.add( "são" );
        STOP_WORDS.add( "era" );
        STOP_WORDS.add( "éramos" );
        STOP_WORDS.add( "eram" );
        STOP_WORDS.add( "fui" );
        STOP_WORDS.add( "foi" );
        STOP_WORDS.add( "fomos" );
        STOP_WORDS.add( "foram" );
        STOP_WORDS.add( "fora" );
        STOP_WORDS.add( "fôramos" );
        STOP_WORDS.add( "seja" );
        STOP_WORDS.add( "sejamos" );
        STOP_WORDS.add( "sejam" );
        STOP_WORDS.add( "fosse" );
        STOP_WORDS.add( "fôssemos" );
        STOP_WORDS.add( "fossem" );
        STOP_WORDS.add( "for" );
        STOP_WORDS.add( "formos" );
        STOP_WORDS.add( "forem" );
        STOP_WORDS.add( "serei" );
        STOP_WORDS.add( "será" );
        STOP_WORDS.add( "seremos" );
        STOP_WORDS.add( "serão" );
        STOP_WORDS.add( "seria" );
        STOP_WORDS.add( "seríamos" );
        STOP_WORDS.add( "seriam" );
        STOP_WORDS.add( "tenho" );
        STOP_WORDS.add( "tem" );
        STOP_WORDS.add( "temos" );
        STOP_WORDS.add( "tém" );
        STOP_WORDS.add( "tinha" );
        STOP_WORDS.add( "tínhamos" );
        STOP_WORDS.add( "tinham" );
        STOP_WORDS.add( "tive" );
        STOP_WORDS.add( "teve" );
        STOP_WORDS.add( "tivemos" );
        STOP_WORDS.add( "tiveram" );
        STOP_WORDS.add( "tivera" );
        STOP_WORDS.add( "tivéramos" );
        STOP_WORDS.add( "tenha" );
        STOP_WORDS.add( "tenhamos" );
        STOP_WORDS.add( "tenham" );
        STOP_WORDS.add( "tivesse" );
        STOP_WORDS.add( "tivéssemos" );
        STOP_WORDS.add( "tivessem" );
        STOP_WORDS.add( "tiver" );
        STOP_WORDS.add( "tivermos" );
        STOP_WORDS.add( "tiverem" );
        STOP_WORDS.add( "terei" );
        STOP_WORDS.add( "terá" );
        STOP_WORDS.add( "teremos" );
        STOP_WORDS.add( "terão" );
        STOP_WORDS.add( "teria" );
        STOP_WORDS.add( "teríamos" );
        STOP_WORDS.add( "teriam" );

    }

}
