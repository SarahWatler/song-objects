import java.util.ArrayList;

public class SongRunner
	{
static ArrayList <Song> jam = new ArrayList <Song>();
static int longestIndex;
		public static void main(String[] args)
			{
				
	
				// comment
				jam.add(new Song ("I am the greatest", "Logic", 187));
				jam.add(new Song ("Don't stop believing", "journey", 270));
				jam.add(new Song ("tear in my heart", "twenty one pilots", 196));
				jam.add(new Song ("animal", "Mike Snow", 163));
				jam.add(new Song ("House Party", "Sam Hunt", 191));
				System.out.println(jam.size());
		
				printlist1();
				cut10();
				printlist1();
				star();
				printlist1();
				
				removeLongest();
				printlist1();
				
				
				
				
			}
		public static void printlist1 ()
		{
			
			for (int i = 0; i < jam.size(); i++)
				{
				System.out.println(jam.get(i).getArtist() + " sings " + jam.get(i).getTitle() + " and it is " + jam.get(i).getLength() + " seconds ");
				}
		}
		public static void cut10 ()
		{
			for (int i = 0; i < jam.size(); i++)
				{
					jam.get(i).setLength(jam.get(i).getLength()- 10);
					//System.out.println( " (part 2)" + jam.get(i).getArtist() + " sings " + jam.get(i).getTitle() + " and it is " + jam.get(i).getLength() - 10 () + " seconds if you subtract 10 ");
				}
			System.out.println();
		
		}
		public static void star()
		{
			for (int i = 0; i < jam.size(); i++)
				{
					jam.get(i).setArtist("Sarah Watler");
					//System.out.println(jam.get(i).getArtist + " sings " + jam.get(i).getTitle() + " and it is " + jam.get(i).getLength());
				}
			System.out.println();
		}
		 
		public static void titleLength()
		{
			
		}
		public static void removeLongest ()
		{
			int longest = 0;
			for (int i = 0; i < jam.size(); i++)
				{
					
					if (jam.get(i).getTitle().length() > longest)
						{
						longest = (jam.get(i).getTitle().length());
					 longestIndex = i;
						}
						
							
						
					
					
					
				
				//System.out.println(jam.get(i).getArtist + " sings " + jam.get(i).getTitle() + " and it is " + jam.get(i).getLength() + " seconds if you subtract 10 ");
				}
			
			jam.remove(longestIndex);
		
				
			}
		
	}
