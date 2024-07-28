package TestExample;

public class TestExample {

	public int square(int n) {
		return n*n;
	}
	
	public int Sum(int a, int b) {
		
		return a+b;
	}
	
	public boolean isValid(String password) {
		
		if (password.length()>=5 && password.length()<+10) {
			return true;
			
			}else
				return false;
	}
}
