package com.rsqu.leetcode.hot100.p0146_lru_cache;

import java.util.HashMap;
import java.util.Map;

/**
 * LRU 缓存。
 */
public class LRUCache {

    private static final int NOT_FOUND = -1;

    private final int capacity;

    private final Map<Integer, CacheNode> cacheMap;

    private final CacheNode head;

    private final CacheNode tail;

    /**
     * 初始化指定容量的缓存。
     *
     * @param capacity 缓存容量
     */
    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.cacheMap = new HashMap<>(capacity);
        this.head = new CacheNode(0, 0);
        this.tail = new CacheNode(0, 0);
        head.next = tail;
        tail.prev = head;
    }

    /**
     * 获取缓存值。
     *
     * @param key 缓存键
     * @return 缓存值，不存在时返回 -1
     */
    public int get(int key) {
        CacheNode node = cacheMap.get(key);
        if (node == null) {
            return NOT_FOUND;
        }
        moveToHead(node);
        return node.value;
    }

    /**
     * 写入缓存值。
     *
     * @param key 缓存键
     * @param value 缓存值
     */
    public void put(int key, int value) {
        CacheNode node = cacheMap.get(key);
        if (node != null) {
            node.value = value;
            moveToHead(node);
            return;
        }

        CacheNode newNode = new CacheNode(key, value);
        cacheMap.put(key, newNode);
        addToHead(newNode);
        if (cacheMap.size() > capacity) {
            CacheNode removedNode = removeTail();
            cacheMap.remove(removedNode.key);
        }
    }

    private void moveToHead(CacheNode node) {
        removeNode(node);
        addToHead(node);
    }

    private void addToHead(CacheNode node) {
        node.prev = head;
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
    }

    private void removeNode(CacheNode node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private CacheNode removeTail() {
        CacheNode removedNode = tail.prev;
        removeNode(removedNode);
        return removedNode;
    }

    private static class CacheNode {

        private final int key;

        private int value;

        private CacheNode prev;

        private CacheNode next;

        private CacheNode(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
}
