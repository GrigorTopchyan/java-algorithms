package hofman_coding;

/**
 * Created by grigort on 11/14/2018.
 */
public class Main {
    public static void main(String[] args) {
        Hofman hofman = new Hofman();
        char [] charArray = {'a','b','c','d','e','f'};
        int [] charFrequency = {5,9,12,13,16,45};
        hofman.printHofmanCode(hofman.constructHofmanTree(charArray,charFrequency));
    }
}
