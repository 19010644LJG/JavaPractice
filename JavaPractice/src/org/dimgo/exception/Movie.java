/**
 * 
 */
package org.dimgo.exception;

/**
 *<pre>
 * org.dimgo.exception
 * 	 |_Movie
 *
 * 1. 개요 : 
 * 2. 작성일 : 2017. 5. 29. 
 * </pre>
 * 
 * @author : 이준구
 * @version : 1.0
 */
public class Movie {
	private String Title;
	private int limitage;

	public Movie(String title, int limitage) {
		super();
		Title = title;
		this.limitage = limitage;
	}
	public String getTitle() {
		return Title;
	}

	public int getLimitage() {
		return limitage;
	}
	public void buyTicket(int age) throws Exception{
		if(age < limitage){
			throw new Exception(Title + "은/는" + limitage + "세 이상 관람가입니다." );
		}
		System.out.println(Title+" 즐감하세요.");
		
	}
}

