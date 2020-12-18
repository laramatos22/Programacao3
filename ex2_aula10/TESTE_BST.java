package ex2_aula10;

public class TESTE_BST {

	public static void main(String[] args) {
		BTS<Double> bst = new BTS<Double>();
		
		for(int i = 0; i < 10; i++)
		{
			double n = Math.random() * 30 + i;
			bst.insert(n);
		}
		
		for(Double d : bst)
		{
			System.out.printf("%.2f\n",d);
		}
		
		System.out.println(bst.size());
	}
}
