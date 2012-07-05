package Slots;


import Slots.Company;

class Transport extends Company{
	//Metode de baza
	public Transport(int pret, String nume){
		super(pret, nume);
	}
	
        @Override
        public int calculateRent(){
		int s=0;
		if(!this.isIpotecata()){
			//calculeaza
		}
		return s;
		
	}
}