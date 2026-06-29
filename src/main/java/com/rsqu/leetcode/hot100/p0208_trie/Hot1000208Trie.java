package com.rsqu.leetcode.hot100.p0208_trie;

/**
 * 208. 实现 Trie（前缀树）。
 */
public class Hot1000208Trie {

    private static final int LOWERCASE_LETTER_COUNT = 26;
    private static final char FIRST_LOWERCASE_LETTER = 'a';

    /**
     * 空根节点，不代表任何字符。
     */
    private final TrieNode root;

    /**
     * 初始化前缀树。
     */
    public Hot1000208Trie() {
        root = new TrieNode();
    }

    /**
     * 示例入口。
     *
     * @param args 命令行参数
     */
    public static void main(String[] args) {
        Hot1000208Trie trie = new Hot1000208Trie();
        trie.insert("apple");
        assert trie.search("apple");
        assert !trie.search("app");
        assert trie.startsWith("app");
        trie.insert("app");
        assert trie.search("app");
    }

    /**
     * 向前缀树中插入单词。
     *
     * @param word 待插入的单词
     */
    public void insert(String word) {
        TrieNode currentNode = root;
        for (int i = 0; i < word.length(); i++) {
            int childIndex = word.charAt(i) - FIRST_LOWERCASE_LETTER;
            if (currentNode.children[childIndex] == null) {
                currentNode.children[childIndex] = new TrieNode();
            }
            currentNode = currentNode.children[childIndex];
        }
        currentNode.end = true;
    }

    /**
     * 判断单词是否已经完整插入。
     *
     * @param word 待查询的单词
     * @return 单词存在返回 true，否则返回 false
     */
    public boolean search(String word) {
        TrieNode node = searchPrefix(word);
        return node != null && node.end;
    }

    /**
     * 判断是否存在指定前缀。
     *
     * @param prefix 待查询的前缀
     * @return 前缀存在返回 true，否则返回 false
     */
    public boolean startsWith(String prefix) {
        return searchPrefix(prefix) != null;
    }

    /**
     * 查找前缀末尾对应的节点。
     *
     * @param prefix 待查找的前缀
     * @return 前缀存在时返回末尾节点，否则返回 null
     */
    private TrieNode searchPrefix(String prefix) {
        TrieNode currentNode = root;
        for (int i = 0; i < prefix.length(); i++) {
            int childIndex = prefix.charAt(i) - FIRST_LOWERCASE_LETTER;
            if (currentNode.children[childIndex] == null) {
                return null;
            }
            currentNode = currentNode.children[childIndex];
        }
        return currentNode;
    }

    /**
     * 前缀树节点。
     */
    private static class TrieNode {

        /**
         * 当前节点的下一层小写字母节点。
         */
        private final TrieNode[] children = new TrieNode[LOWERCASE_LETTER_COUNT];

        /**
         * 当前节点是否为完整单词的结尾。
         */
        private boolean end;
    }
}
