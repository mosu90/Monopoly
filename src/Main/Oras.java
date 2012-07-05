package Main;


import Slots.Street;

//CLASA ORAS
public class Oras{
	private String nume;
	private Street[] terenuri=new Street[2];
	private static int i=0;
	public Oras(String x){
		this.nume=x;
	}
	public Street[] Strazi(){
		return this.terenuri;
	}
	public String toString(){
		return this.nume;
	}
	public void addTeren(Street x){
		if(i<=3)
			{
			terenuri[i]=x;
			i++;
			}
		else
			System.out.println("Prea multe terenuri adaugate");
	}
}