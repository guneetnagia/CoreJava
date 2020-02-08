package guneet.threading;

import java.util.UUID;

public class Class11Token {
	private UUID uid;
	private int tokenNo;
	private String description;
	public UUID getUid() {
		return uid;
	}
	public void setUid(UUID uid) {
		this.uid = uid;
	}
	public int getTokenNo() {
		return tokenNo;
	}
	public void setTokenNo(int tokenNo) {
		this.tokenNo = tokenNo;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Class11Token [uid=" + uid + ", tokenNo=" + tokenNo + ", description=" + description + "]";
	}
	
	
}
