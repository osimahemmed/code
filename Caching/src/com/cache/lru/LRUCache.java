package com.cache.lru;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.cache.util.DoublyLinkedList;
import com.cache.util.Node;

public class LRUCache {

	private DoublyLinkedList pageList;
	private Map<Integer, Node> pageMap;

	public LRUCache(int cacheSize) {
		pageList = new DoublyLinkedList(cacheSize);
		pageMap = new ConcurrentHashMap<Integer, Node>();
	}

	public void put(int data) {
		Node pageNode = null;
		if (pageMap.containsKey(data)) {
			pageNode = pageMap.get(data);
			pageList.movePageToHead(pageNode);
		} else {
			if (pageList.getCurrentSize() == pageList.getSize()) {
				pageMap.remove(pageList.getTail().getData());
			}
			pageNode = pageList.addPageToList(data);
			pageMap.put(data, pageNode);
		}
	}

	public void printCacheState() {
		pageList.printList();
		System.out.println();
	}
}
