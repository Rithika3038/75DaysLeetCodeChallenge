class Trie {
    Node root;

    public Trie() {
        root = new Node();
    }

    public void insert(String word) {
        Node temp = root;
        int len = word.length();
        for (int i = 0; i < len; i++) {
            if (temp.contains(word.charAt(i))) temp = temp.get(word.charAt(i));
            else {
                temp.nodes[word.charAt(i) - 'a'] = new Node();
                temp = temp.get(word.charAt(i));
            }
        }
        temp.isLastNode = true;
    }

    public boolean search(String word) {
        Node temp = root;
        int len = word.length();
        for (int i = 0; i < len; i++) {
            if (temp.contains(word.charAt(i))) temp = temp.get(word.charAt(i));
            else return false;
        }
        return temp.isLastNode;
    }

    public boolean startsWith(String prefix) {
        Node temp = root;
        int len = prefix.length();

        for (int i = 0; i < len; i++) {
            if (temp.contains(prefix.charAt(i))) temp = temp.get(prefix.charAt(i));
            else return false;
        }
        return true;
    }
}

class Node {
    Node[] nodes = new Node[26];
    boolean isLastNode = false;

    public boolean contains(char c) {
        return nodes[c - 'a'] != null;
    }

    public Node get(char c) {
        return nodes[c - 'a'];
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */