package rabin_karp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by grigort on 11/7/2018.
 */
public class RabinKarpTest {

    @Test
    public void rabinKarpTest(){
        String txt = "Geeks for Geeks";
        String pat = "Geek";
        Integer []expected = {0,10};
        System.out.println(RabinKarp.search(txt,pat,101));
        Integer [] resullt = RabinKarp.search(txt,pat,101).toArray(new Integer[1]);
        Assertions.assertArrayEquals(expected,resullt);
    }
}
