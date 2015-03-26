package test;

public class C {
	private int m = - 1;
	private int n = -2;
	
	public C(){
		m = 1;
		n = 2;
	}
	public C (int m, int n){
		setM(m);
		setN(n);
	}
	public int getM(){
		return m;
	}
	public int getN(){
		return n;
	}
	public void setM(int m){
		this.m = m;
	}
	public void setN(int n){
		this.n = n;
	}
	public void metode1(){
		System.out.println("C sin methode1!");
	}
	public void metode2(){
		metode1();
	}
	public String toString(){
		return "m = " + m + ", n = " + n;
	}
}
