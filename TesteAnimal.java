
public class TesteAnimal {
	
	
	public static void main (String args[])
	{
		cachorro donita = new cachorro("Donita",2,"latido","corre");
		cavalo spirit = new cavalo("Spirit",9,"relincho","corre");
		preguica roger = new preguica("Roger",8,"ronca","sobe em �rvores");
		
		System.out.println("\nNome: "+donita.getNome()+"\nIdade: "+donita.getIdade()+"\nSom: "+donita.getSom()+"\nLocomo��o: "+donita.getLocomocao());
		System.out.println("\n**************************");
		System.out.println("\nNome: "+spirit.getNome()+"\nIdade: "+spirit.getIdade()+"\nSom: "+spirit.getSom()+"\nLocomo��o: "+spirit.getLocomocao());
		System.out.println("\n**************************");
		System.out.println("\nNome: "+roger.getNome()+"\nIdade: "+roger.getIdade()+"\nSom: "+roger.getSom()+"\nLocomo��o: "+roger.getLocomocao());
		
	}
}
