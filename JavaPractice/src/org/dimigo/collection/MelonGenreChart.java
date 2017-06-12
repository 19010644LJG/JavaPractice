/**
 * 
 */
package org.dimigo.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <pre>
 * org.dimigo.collection
 *   |_MelonGenreChart
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 6. 5.
 * </pre>
 * 
 * @author : 이준구
 * @version : 1.0
 */
public class MelonGenreChart {
	
	public static void main(String[] args) {
		
		List<Music> balladeList = new ArrayList<>();
		List<Music> danceList = new ArrayList<>();
		Map<String, List<Music>> map = new HashMap<>();
		map.put("[발라드]", balladeList);
		map.put("[댄스]", danceList);
		
		balladeList.add( new Music("팔레트","아이유"));
		danceList.add( new Music("I LUV IT", "PSY"));
		danceList.add( new Music("맞지?","언니쓰"));
		
		System.out.println("-- << 멜론 장르별 챠트 >> --");
		printMap(map);
		
		danceList.set(1, new Music("SIGNAL", "트와이스"));
		System.out.println("-- << 댄스 2위 곡 변경 >> --");
		printMap(map);
		
		danceList.remove(0);
		System.out.println("-- << 댄스 1위 곡 삭제 >> --");
		printMap(map);
		
		danceList.clear();
		balladeList.clear();
		map.clear();
		System.out.println("-- << 전체 리스트 삭제 >> --");
		printMap(map);
	}

	private static void printMap(Map<String, List<Music>> map) {
		for(String key : map.keySet()) {
			System.out.println(key);
			
			for(int i = 0; i < map.get(key).size(); i++) {
				
				System.out.println((i+1)+". "+map.get(key).get(i));
			}
		}
		System.out.println();
	}
}