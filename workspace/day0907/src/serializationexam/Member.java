package serializationexam;

import java.io.Serializable;

public class Member implements Serializable{
	// 직렬화를 위한 고유한 식별자
	private static final long serialVersionUID = 6516515155151515L;
	private String id;
	private String name;
	
	public Member(String id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + "]";
	}
	
	
	
	
	
}
