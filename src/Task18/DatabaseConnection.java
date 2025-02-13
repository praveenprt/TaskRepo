package Task18;

public class DatabaseConnection {

	private DatabaseConnection() {}
	
	private static final class DatabaseConnectionHolder{
		private static final DatabaseConnection INSTANCE = new DatabaseConnection();
	}
	
	public static DatabaseConnection getINSTANCE() {
		return
				DatabaseConnectionHolder.INSTANCE;
	}
	
	public void connect() {
		System.out.println(" Connected ");
	}
	

	public void diconnect() {
		System.out.println(" Disconnected ");
	}
	
	public static void main(String[] args) {
		DatabaseConnection db = DatabaseConnection.getINSTANCE();
		db.connect();
		db.diconnect();
		
	}
}
