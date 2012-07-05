//CLASA TEREN
class Street extends Slot{
	
        protected Player proprietar;
	private int pret;
        private int pret_casa;
	private int nr_case=0;
	private int hotel=0;
	private Oras oras;
	private int chirii[]=new int[6];
        private boolean ipotecata;
	
	//Metode de baza
	public Street(int pret, int pret_c, String nume,Oras x, int[] v_chirii){
		this.pret=pret;
                this.pret_casa=pret_c;
                this.nume=nume;
		this.oras=x;
		this.chirii=v_chirii;
	}
        
        public boolean isIpotecata() {
        return ipotecata;
    }

        public void setIpotecata(boolean ipotecata) {
        this.ipotecata = ipotecata;
    }
    
	public int getPretCasa(){
		return this.pret;
	}
	public int getNumarCase(){
		return nr_case;
	}
	public boolean getHotel(){
		if(hotel==0)
			return false;
		else
			return true;
	}
	public Oras getOras(){
		return this.oras;
	}
	public String getNumeOras(){
		return getOras().toString();
	}
	public int calculateRent(){
		int s=0;
		if (this.isIpotecata()==false)
		{
		if(nr_case==0 && hotel==0)
			s=chirii[0]*2;
		else if(nr_case==0 && hotel==0)
			s=chirii[0];
		else if(nr_case>0)
			s=chirii[nr_case];
		else 
			s=chirii[5];
		}
		return s;
	}
        
        @Override
	public String toString(){
		return this.getNumeOras()+" "+this.nume;
	}
	
	//ACTIUNI

	public void Construieste(int nr){
			if(nr_case+nr<=5)
				{
				if(nr_case+nr >4)
					{
					nr_case=0;
					hotel=1;
					}
				else 
					nr_case+=nr;
				}
			
	}

}