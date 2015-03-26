package test;

public class D extends C{
	private int i = -3;
	
	public D(int i){
		setI(i);
	}
	public int getI(){
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	public void metode1() {
		System.out.println("D sin metode1!");
	}
	public String getINM1(){
		int m = getM();
		int n = getN();
		int i = this.i;
		return "M = "+ m + ", N = " + n + ", I = " + i;
	}
	public String getINM2(){
		C getNM = new C();
		int i = this.i;
		return getNM + ", i = " + i;
	}
	public String toString(){
		return getINM1();
		//return getINM2();
	}
}
