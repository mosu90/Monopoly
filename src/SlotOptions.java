
import java.util.Scanner;
//asta cred ca e in plus
class SlotOptions{
	private int nr_slot=0;
	private Player currentPlayer=null;
	private Client client=null;
	public SlotOptions(int x, Player p, Client z){
		this.nr_slot=x;
		this.currentPlayer=p;
		this.client=z;
	}
	public void Show(){
		Scanner in = new Scanner(System.in);
		if(nr_slot==0)
			{
			currentPlayer.addMoney(100);
			}
		else if(nr_slot==2 || nr_slot==16 || nr_slot==27)
		{
			//chance
			//roll again
		}
		else if(nr_slot==13 || nr_slot==22 || nr_slot==37){
			//community chest
			//roll again
		}
		else if(nr_slot==10)
		{
			int contor=0;//player contor
			boolean ies=false;
			if(ies==false)//daca(dai cu zaru)
				{
				if(contor<=3)//daca nr de aruncari e mai mic decat 3
						{
						if(client.zars[0]==client.zars[1])//daca e dubla
							client.Move();
						else
							contor++;
						}
				else //daca s-a ajuns la 3 aruncari plateste si mergi
						{
						currentPlayer.payBank(50);
						client.Move();
						}
				}
			else// daca platesc
				{
					currentPlayer.payBank(50);
					client.play();
				}
							
		}	
						
		else if(nr_slot==20){
			//next player sau mergi la start
		}
		else if(nr_slot==18 || nr_slot==24){
			//platim taxa la banca in functie de slot
		}
		else if(nr_slot==30){
			//dute la parnaie
		}
		else if(nr_slot==5 || nr_slot==35 || nr_slot==15 || nr_slot== 25 ){
			Object o=Client.board[nr_slot];
			Transport companie_transport=((Transport)o);
			}
		else if(nr_slot==8 || nr_slot==32)
		{
			Object o=Client.board[nr_slot];
			Company companie=((Company)o);
		}
		else
		{
			Object o=Client.board[nr_slot];
			Street teren=((Street)o);
		}
		
	}
	
}