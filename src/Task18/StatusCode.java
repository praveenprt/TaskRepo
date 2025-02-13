package Task18;

public class StatusCode {
	public static void main(String[] args) {
		StatusCodeEnum status = StatusCodeEnum.SUCCESS;
		
		System.out.println("Status "+ status);
		System.out.println("Message"+ status.getMessage());
	}

}
