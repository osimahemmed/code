package com.cache.purge;

import java.util.Map;

import com.cache.util.Cacheable;
import com.cache.util.Node;

public class PurgeCache implements Runnable {

	private Map<Integer, Node> pageMap;

	public PurgeCache(Map<Integer, Node> map) {
		this.pageMap = map;
	}

	@Override
	public void run() {
		try {
			while (true) {
				java.util.Set keySet = pageMap.keySet();
				java.util.Iterator keys = keySet.iterator();
				while (keys.hasNext()) {
					Object key = keys.next();
					Cacheable value = (Cacheable) pageMap.get(key);
					if (value.isExpired()) {
						pageMap.remove(key);
					}
				}

				Thread.sleep(5000);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return;
	}

}
