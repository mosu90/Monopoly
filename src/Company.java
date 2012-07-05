class Company extends Slot{
        protected Player proprietar;
        protected boolean ipotecata;
        protected int pret;
	
        //Metode de baza
    public Company(int pret, String nume){
		this.pret=pret;
		this.nume=nume;
	}
    
    public boolean isIpotecata() {
        return ipotecata;
    }

    public void setIpotecata(boolean ipotecata) {
        this.ipotecata = ipotecata;
    }

    public int getPret() {
        return pret;
    }

    public Player getProprietar() {
        return proprietar;
    }

    public void setProprietar(Player proprietar) {
        this.proprietar = proprietar;
    }
	
    //MOD:Calculate rent in functie de cate sunt
    public int calculateRent(){
		int s=0;
		if(!this.isIpotecata()){
			//calculeaza
		}
		return s;
		
	}
    
    @Override
    public String toString(){
		return this.nume;
	}
}