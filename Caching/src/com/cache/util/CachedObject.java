package com.cache.util;

public class CachedObject implements Cacheable {

	private java.util.Date dateofExpiration = null;
	private Object identifier = null;
	public Object object = null;

	public CachedObject(Object obj, Object id, int minutesToLive) {
		this.object = obj;
		this.identifier = id;

		if (minutesToLive != 0) {
			dateofExpiration = new java.util.Date();
			java.util.Calendar cal = java.util.Calendar.getInstance();
			cal.setTime(dateofExpiration);
			cal.add(cal.MINUTE, minutesToLive);
			dateofExpiration = cal.getTime();
		}
	}

	public boolean isExpired() {
		if (dateofExpiration != null) {
			if (dateofExpiration.before(new java.util.Date())) {
				return true;
			} else {
				return false;
			}
		} else
			return false;
	}

	public Object getIdentifier() {
		return identifier;
	}
}
