package trie;

import java.util.HashMap;

/**
 * Created by grigort on 10/30/2018.
 */
public class TrieNode {
    private HashMap<Character,TrieNode> children;
    private String content;
    private boolean isWord;

    public HashMap<Character, TrieNode> getChildren() {
        return children;
    }

    public void setChildren(HashMap<Character, TrieNode> children) {
        this.children = children;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isEndOfWord() {
        return isWord;
    }

    public void setEndOfWord(boolean word) {
        isWord = word;
    }
}
