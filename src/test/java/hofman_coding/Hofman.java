package hofman_coding;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by grigort on 11/14/2018.
 */
public class Hofman {
    public HofmanNode constructHofmanTree(char [] charArray,int [] charFrequency){
        PriorityQueue<HofmanNode> priorityQueue = new PriorityQueue<>(Comparator.comparingInt(HofmanNode::getData));
        for (int i = 0; i < charArray.length; i++){
            priorityQueue.add(new HofmanNode(charFrequency[i],charArray[i]));
        }
        while (priorityQueue.size() > 1){
            HofmanNode left = priorityQueue.poll();
            HofmanNode right = priorityQueue.poll();
            HofmanNode parent = new HofmanNode(left.getData() + right.getData(), '-');
            parent.left = left;
            parent.right = right;
            priorityQueue.add(parent);
        }
        return priorityQueue.poll();
    }
    public void printHofmanCode(HofmanNode root){
        printHofmanCode(root,"");
    }

    private void printHofmanCode(HofmanNode root, String s){
        if (root.left == null && root.right == null && Character.isLetter(root.getCharacter())){
            System.out.println(root.getCharacter() + ":" + s);
        }else {
            printHofmanCode(root.left, s + "0");
            printHofmanCode(root.right, s + "1");
        }
    }
}
