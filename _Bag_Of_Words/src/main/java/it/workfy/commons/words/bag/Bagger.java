package it.workfy.commons.words.bag;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author julio
 */
public class Bagger {

    public Map<String , Integer> getBagOfWords( final String text ) {
        final Map<String , Integer> bag = new HashMap<>();

        final String normalizedText = Normalizer.normailze( text );
        final List<String> words = StopWordsUtil.removeStopWords( normalizedText );

        words.stream().forEach( word -> {
            Integer times = bag.get( word );
            if ( times != null && times > 0 ) {
                times++;
                bag.put( word , times );
            }
            else {
                bag.put( word , 1 );
            }
        } );

        return bag;
    }

}
