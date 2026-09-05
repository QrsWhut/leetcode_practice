package com.rsqu.leetcode.hot100.p0138_copy_random_list;

import java.util.HashMap;
import java.util.Map;

public class Hot1000138CopyRandomList {

    static class Node {
        int val;
        Node next;
        Node random;

        Node(int val) {
            this.val = val;
        }
    }

    public Node copyRandomList(Node head) {
        Map<Node, Node> map = new HashMap<>();
        for (Node node = head; node != null; node = node.next) {
            map.put(node, new Node(node.val));
        }
        for (Node node = head; node != null; node = node.next) {
            Node newNode = map.get(node);
            newNode.next = map.get(node.next);
            newNode.random = map.get(node.random);
        }
        return map.get(head);
    }

    public static void main(String[] args) {
        Hot1000138CopyRandomList solution = new Hot1000138CopyRandomList();
    }
}