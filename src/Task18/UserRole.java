package Task18;


public class UserRole {

	public static void main(String[] args) {
		for(UserRoleEnum role : UserRoleEnum.values()){
			System.out.println(role+" has"+role.getAccessLevel());
		}
	}
}
