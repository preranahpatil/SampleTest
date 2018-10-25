

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class Addition {
	static String filename;
	public static void main(String[] args) throws IOException {
		
		if (args.length == 0) 
		{
			System.out.println("No command line arguments found."); 
			System.exit(0);
		}
		
		Addition add=new Addition();
		long result=0L;
		String input_string= args[0];
		if(args.length<2)
		{
			result= add.addvalue(input_string,"");
		}
		else

			if(args[1].equalsIgnoreCase("-f"))
			{

				if(args.length>2)
				{
					filename=args[2];
					result=add.addvalue(input_string,args[1]);
				}
				else
				{
					System.out.print("Please give proper arguments with file name");
					System.exit(0);
				}
			}

			else
				if (args[1].equalsIgnoreCase("-x"))
				{
					result=add.addvalue(input_string,args[1]);
				}

		System.out.print(result);
	}

	public long addvalue(String s, String operation) throws IOException
	{  

		long sum=0L;
		char[] svalues=s.toCharArray();
		HashMap<Character, Integer> map = new HashMap<>();
		map.put('1', 1);
		map.put('2',2);
		map.put('3',3);
		map.put('4',4);
		map.put('5',5);
		map.put('6',6);
		map.put('7',7);
		map.put('8',8);
		map.put('9',9);
		map.put('a',10);
		map.put('b',11);
		map.put('c',12);
		map.put('d',13);
		map.put('e',14);
		map.put('f',15);
		
		switch(operation)
		{
		case "-x": 
			for(int i=0;i<svalues.length;i++)
			{ 
				if(map.containsKey(svalues[i]))	
					sum+=map.get(svalues[i]);
			}
			break;
		case "-f": BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
		writer.write(s);
		writer.close();
		File file = new File(filename);
		BufferedReader br = new BufferedReader(new FileReader(file));
		s = br.readLine();
		br.close();
		default:
			for(int i=0;i<svalues.length;i++)
			{ 
				if(Character.isDigit(svalues[i])&&map.containsKey(svalues[i]))
					sum+=map.get(svalues[i]);
			}
			break;
		}
		return sum;

	}

}

