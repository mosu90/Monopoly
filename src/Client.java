
import java.util.Random;
class Client{
	private Player[] players =new Player[6];
	private static int p_idx=0;
	public static Slot[] board;
	public static int zars[]=new int[2];
	public static int next_pos=-1;
	private void addPlayer(Player x){
		players[p_idx]=x;
		p_idx++;
	}
	private void initializeaza(){
		board = new Slot[2];
		Oras NewYork = new Oras("New York");
		int[] v_chirii={6,30,90,270,400,550};
		Street Avenue = new Street(100,50,"Avenue",NewYork,v_chirii);
		Street Broadway = new Street(120,70,"Broadway",NewYork,v_chirii);
		NewYork.addTeren(Avenue);
		NewYork.addTeren(Broadway);
		board[0]=Avenue;
		board[1]=Broadway;
		this.addPlayer(new Player("Player1",1500,1));
		this.addPlayer(new Player("Player2",1500,2));
	}
	public int[] Roll(){
		int zaruri[]=new int[2];
		Random generator = new Random();
		int zar1 = generator.nextInt(6) + 1;
		int zar2 = generator.nextInt(6) + 1;
		zaruri[0]=zar1;
		zaruri[1]=zar2;
		zars=zaruri;
		return zaruri;
	}
	public void Move(){
		next_pos= (players[p_idx].getPozBoard() + this.Roll()[0]+this.Roll()[1]);
	}
	public void Move(int x){
		next_pos=x;
	}
	public void play()
	{
		for(Player x:players)
				if(x!=null){
					if(next_pos==-1)
						this.Move();
					x.setPozBoard(next_pos);
					next_pos=-1;
					SlotOptions Optiuni=new SlotOptions(x.getPozBoard(),x,this);
					Optiuni.Show();
				}
	}
	public static void main(String[] args)
	{
		Client joc=new Client();
		joc.initializeaza();
		joc.play();
		System.out.println(joc.players[0].getName()+" "+joc.players[0].getSuma());
		System.out.println(joc.players[1].getName()+" "+joc.players[1].getSuma());
	}
}
