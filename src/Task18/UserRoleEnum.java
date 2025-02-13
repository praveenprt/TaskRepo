package Task18;

public enum UserRoleEnum {
ADMIN("Full access"),
	USER("Limited access"),
	GUEST("Read Only access");
	
	private final String accessLevel;
	
	private UserRoleEnum(String accesslevel) {
	this.accessLevel = accesslevel;
	}
	
	public String getAccessLevel() {
		return accessLevel;
	}
}
