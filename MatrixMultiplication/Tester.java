
public class Tester {

	public static void main(String[] args) {
		int a[][]={{1,2,-2,0},
				   {-3,4,7,2},
				   {6,0,3,1}};
		int b[][]={{-1,3},
				   {0,9},
				   {1,-11},
				   {4,-5}};
		MatixMult multiply=new MatixMult();
		int c[][]=multiply.mult(a,b);
		
		for(int row = 0; row < c.length; row++)
		{
			for(int col = 0; col < c[row].length; col++)
			{
				System.out.print(c[row][col] + "\t");
			}
			System.out.println(" ");
		}


	}

}
