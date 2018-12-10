package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest {
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put("1", 1000);
		System.out.println(map);
		
		List list = new ArrayList();
		list.add(map);
		System.out.println(list);
		
		String[] strArr = new String[]{"hello","world"};
	}
}
