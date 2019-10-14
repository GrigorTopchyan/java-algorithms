package hofman_coding;

/**
 * Created by grigort on 11/14/2018.
 */
public class HofmanNode {
    private int data;
    private char character;

    public int getData() {
        return data;
    }

    public char getCharacter() {
        return character;
    }

    HofmanNode left;
    HofmanNode right;

    public HofmanNode(int data, char c) {
        this.data = data;
        this.character = c;
    }
}
