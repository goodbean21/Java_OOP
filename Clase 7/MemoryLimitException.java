public class MemoryLimitException extends Exception{
	private float maxPermitted;

	public float getMaxPermite(){
		return maxPermitted;
	}

	public MemoryLimitException(float maxPermitted, String message){

		super(message);

		this.maxPermitted = maxPermitted;
	}
	
}