
public class MonsterAlreadyDeadException extends Exception{
	
	public MonsterAlreadyDeadException() {
		super();
	}
	
	public MonsterAlreadyDeadException(String message) {
		super("MonsterAlreadyDeadException: " + message);
	}

}
