import java.io.*;
import java.util.Scanner;

public class SatPix 
{

	public static void main(String[] args) throws IOException
	{
		boolean[][] booleanArr = fileToBoolArray("satpix.in");
		int sizeOfLargestPasture;
		
		/* YOUR CODE GOES HERE */
		
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("satpix.out")));
		out.println(sizeOfLargestPasture);
		out.close();
		}
	
	private static boolean[][] fileToBoolArray(String fileName) throws FileNotFoundException, IOException
	{
		Scanner scan = new Scanner(new File(fileName));
		int col = scan.nextInt();
		int rows = scan.nextInt();
		for(int i = 0; i < rows; i++)
		{
			for(int k = 0; k < col; k++)
			{
				String line = scan.next();
				if (line.charAt(k) == '*')
				{
					booleanArr[i][k] = true;
				}
				else
				{
					booleanArr[i][k] = false;
				}
			}
			
			
		}
		
		//This helper method converts the input file into a 2D array of booleans
	}

	private static int recursivelyMeasureAndMarkPasture(int row, int col, boolean[][] arr)
	{
		//This recursive method employs the flood-fill algorithm to
		//count the size of a single pasture and "mark" it so it is not double-counted
		return 0;
	}
	
}