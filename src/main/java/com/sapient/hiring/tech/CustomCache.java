package com.sapient.hiring.tech;

import java.util.ArrayList;
import java.util.List;

public class CustomCache<K, V> {

	List<ListCache<K, V>> listCache;

	public CustomCache() {
		listCache = new ArrayList<>();
	}

	public void put(K key, V value) {
		System.out.println(key.getClass());
		
		if (listCache.isEmpty()) {
			add(key, value);
		} else {
			K k = listCache.get(0).getKey();
			System.out.println(key.getClass() instanceof k);
		}
	}

	public boolean remove(K key) {
		// TODO implement this method
		return false;
	}

	public V get(K key) {
		for (ListCache<K, V> cache : listCache) {
			if (cache.getKey().equals(key)) {
				return cache.getValue();
			}
		}
		return null;
	}

	private void add(K key, V value) {
		for (ListCache<K, V> cache : listCache) {
			if (cache.getKey().equals(key)) {
				return;
			}
		}
		listCache.add(new ListCache(key, value));
	}
}