
public class HolaMundo {
	public static void main(String[] args){
	int result=0;	
	
	for(int i=0;i<=100;i++){
		for(int j=0;j<=100;j++){
			result += i+j;
		}
	}
	System.out.println(result);
	}

}