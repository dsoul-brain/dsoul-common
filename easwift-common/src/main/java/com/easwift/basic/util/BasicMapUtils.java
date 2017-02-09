package com.easwift.basic.util;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @descrpiton [Map工具类]
 * @author [dingwei.tang]
 * @date [2017年2月9日 下午1:48:55]
 */
public class BasicMapUtils {

	/**
	 * 将Map中指定key的value转换字符串中的"<", ">" 为 "&lt;", "&gt;"
	 * 
	 * @param map
	 *            需要转换的Map
	 * @param key
	 *            指定key
	 * @return 转换后Map
	 */
	public static final void escape(Map<String, Object> map, String key) {
		Object o = map.get(key);
		if (o == null || !(o instanceof String)) {
			return;
		}
		String s = (String) o;
		s = BasicStringUtils.escape(s);
		map.put(key, s);
	}

	public static final void keyToCamelCase(List<Map<String, Object>> mapList) {
		keyToCamelCase(mapList, null);
	}

	public static final void keyToCamelCase(List<Map<String, Object>> mapList, String separator) {
		for (Map<String, Object> map : mapList) {
			keyToCamelCase(map, separator);
		}
	}

	public static void keyToCamelCase(Map<String, Object> map) {
		keyToCamelCase(map, null);
	}

	public static void keyToCamelCase(Map<String, Object> map, String separator) {
		for (Entry<String, Object> entry : map.entrySet()) {
			map.remove(entry.getKey());
			map.put(BasicStringUtils.toCamelCase(entry.getKey(), separator), entry.getValue());
		}
	}

}
