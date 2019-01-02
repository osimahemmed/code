package com.cache.main;

import com.cache.lru.LRUCache;

public class CacheManager {

	public static void main(String[] args) {
		int cacheSize = 4;
		LRUCache cache = new LRUCache(cacheSize);
		
		cache.put(4);
		cache.printCacheState();

		cache.put(2);
		cache.printCacheState();

		cache.put(1);
		cache.printCacheState();

		cache.put(1);
		cache.printCacheState();

		cache.put(4);
		cache.printCacheState();

		cache.put(3);
		cache.printCacheState();
		cache.put(7);
		cache.printCacheState();
		cache.put(8);
		cache.printCacheState();
		cache.put(3);
		cache.printCacheState();
	}
}
