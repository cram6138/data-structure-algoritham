package test;

import java.util.HashMap;
import java.util.Iterator;

public final class ImmutableClass {

	private final String name;
	private final Long phone;
	private final HashMap<String, String> testMap;
	
	public String getName() {
		return name;
	}
	public Long getPhone() {
		return phone;
	}
	public HashMap<String, String> getTestMap() {
		return (HashMap<String, String>) testMap.clone();
	}
	public ImmutableClass(String name, Long phone, HashMap<String, String> testMap) {
		super();
		this.name = name;
		this.phone = phone;
		String key;
		HashMap<String, String> hm = new HashMap<String, String>();
		Iterator<String> it = testMap.keySet().iterator();
		while (it.hasNext()) {
			key = it.next();
			hm.put(key, testMap.get(key));
		}
		this.testMap = hm;
	}
	
	
}
