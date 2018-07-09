package it.workfy.commons.words.bag;

import java.util.Map;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author julio
 */
public class BaggerTest {

    public BaggerTest() {
    }

    @Test
    public void testGetBagOfWords() {
        final Bagger bagger = new Bagger();
        final Map<String , Integer> bagOfWords = bagger.getBagOfWords( sample() );

        System.out.println( bagOfWords );

        bagOfWords.keySet().stream().forEach( word -> {
            Assert.assertFalse( StopWordsUtil.STOP_WORDS.contains( word ) );
            Assert.assertFalse( word.contains( Normalizer.DOT ) );

            if ( word.contains( "\"" ) ) {
                System.out.println( word.replace( "\"" , "-" ) );
            }
        } );

    }

    private String sample() {
        return "A Holanda tem uma forte política anti-bullying: desde 2015 as escolas primárias e secundárias são "
                + "obrigadas por lei a combater os casos de bullying."
                + "Nas escolas primárias, crianças são ensinadas desde os 4 anos a fazerem um sinal de \"pare\" com "
                + "as mãos quando não gostam de uma situação ou quando acham que algum colega ultrapassou algum limite."
                + " Além disso, são estimuladas a logo conversar com um adulto sobre a situação."
                + "Em 2016, o número de crianças que alegaram ter sofrido bullying na educação primária caiu para 10% – "
                + "comparado a 14% em 2014. Nas escolas secundárias caiu de 11% em 2014 para 8% em 2016, segundo o"
                + " Ministério da Educação."
                + "“Aqui ninguém implica com ninguém. A gente respeita as diferenças e até rimos delas. Acho que isso "
                + "é reflexo da educação que recebemos nas escolas e em casa desde muito 'cedo', diz Faye, de 14 anos, "
                + "aluna de uma escola secundária em Amsterdã.";
    }
}
