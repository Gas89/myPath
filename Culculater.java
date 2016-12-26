
public class Culculater{
	
	private int result;
	
	public void add(int... param){
		for(int num : param){
			this.result+=num;
		}
	
	}
	public int getResult(){
		return this.result;
	}
	public void clearResult(){
		this.result=0;
	}


}