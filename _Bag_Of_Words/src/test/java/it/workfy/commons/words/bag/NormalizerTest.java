package it.workfy.commons.words.bag;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static it.workfy.commons.words.bag.StopWordsUtil.STOP_WORDS;

/**
 *
 * @author julio
 */
public class NormalizerTest {

    private Normalizer normalizer;

    @Before
    public void init() {
        normalizer = new Normalizer();
    }

    @Test
    public void testNormailze() {
        final String notWord = ".;''[]-+*";
        List<String> words = Arrays.asList( "Julio" , "Cesar " , " Nunes " , " Souza" );
        int max = STOP_WORDS.size();
        List<String> stops = new ArrayList<>();

        final StringBuilder sb = new StringBuilder( notWord );
        words.stream().forEach( word -> {
            final String stop = STOP_WORDS.get( new Random().nextInt( max ) );
            stops.add( stop );
            sb.append( word ).append( " " ).append( stop );
        } );
        String normalized = normalizer.normailze( sb.toString() );

        System.out.println( normalized );

        words.stream().forEach( word -> {
            Assert.assertTrue( normalized.contains( word.toLowerCase() ) );
        } );

        stops.stream().forEach( stop -> {
            Assert.assertFalse( normalized.contains( stop ) );
        } );

        Assert.assertFalse( normalized.contains( notWord ) );

    }

}
