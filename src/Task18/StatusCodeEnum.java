package Task18;

public enum StatusCodeEnum {

SUCCESS(" Complete Succesfully"),
ERROR(" Error occured"),
PENDING(" not completed");
	
	private final String message;
	private StatusCodeEnum(String message) {
		this.message = message;
	}
	public String getMessage () {
		return message;
	}
}
