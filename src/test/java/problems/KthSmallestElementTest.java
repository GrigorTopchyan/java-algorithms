package problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Created by grigort on 11/1/2018.
 */
public class KthSmallestElementTest {
    @Test
    public void KthSmallestElementTest() {
        int[] arr = {1, 2, 5, 8, 9, 3, 6, 4};
        Assertions.assertEquals(2, KthSmalestElement.kthSmalestElement(arr, 2));
    }
}
