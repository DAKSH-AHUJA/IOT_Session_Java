package day11;
class TrieNode {
    TrieNode[] children = new TrieNode[26];
    boolean isEnd;
}
public class Trie {

    TrieNode root = new TrieNode();

    void insert(String word) {
        TrieNode current = root;

        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'a';

            if (current.children[index] == null) {

                current.children[index] = new TrieNode();

            }
            current = current.children[index];
        }
        current.isEnd = true;

    }
    public static void main(String[] args) {
        Trie t = new Trie();
        t.insert("cat");

        t.insert("car");

        t.insert("can");
       System.out.println("Words inserted");
    }

}

