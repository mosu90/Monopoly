class Player {
 private int cash,culoare;
 private String name;
 private Slot[] proprietati = new Slot[20];
 private static int nr_transporturi=0;
 private static int indx_prop=0;
 private static int poz_board=0;

public Player(String name, int suma,int culoare){
	 this.cash=suma;
	 this.name=name;
	 this.culoare=culoare;
 }
public String getName() {
	return name;
}
public int getSuma(){
	return this.cash;
}
public int getCuloare(){
	return this.culoare;
}
public Slot[] getProprietati(){
	return this.proprietati;
}
public boolean equals(Object o){
	if(o instanceof Player)
		return(((Player)o).culoare==culoare);
	else return false;
}
public int getNrTransporturi(){
	return nr_transporturi;
}
public void setTransporturi(int x){
	nr_transporturi=x;
}
public int getPozBoard(){
	return poz_board;
}
public void setPozBoard(int x){
	poz_board=x;
}
//ACTIUNI
public void payBank(int ammount){
	this.cash-=ammount;
}
public void payRent(int ammount, Player x){
	this.cash-=ammount;
	x.addMoney(ammount);
}
public void addMoney(int ammount){
	this.cash+=ammount;
}
public void addProperty(Slot x){
	this.proprietati[indx_prop]=x;
	indx_prop++;
}
}