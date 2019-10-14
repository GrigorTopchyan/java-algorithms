package searching;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Created by grigort on 10/30/2018.
 */
public class SearchTest {
    @Test
    public void interpolationSearchShouldReturnIndexOfElementInArray(){
        int [] arr = {1,2,3,4,5};
        Assertions.assertEquals(2, Searching.interpolationSearch(3,arr));
    }

    @Test
    public void jumpSearchShouldReturnIndexOfElementInArray(){
        int [] arr = {1,2,3,4,5};
        Assertions.assertEquals(2, Searching.jumpSearch(3,arr));
    }

    @Test
    public void exponentialSearchShouldReturnIndexOfElementInArray(){
        int [] arr = {1,2,3,4,5};
        Assertions.assertEquals(2, Searching.exponentialSearch(3,arr));
    }

}
