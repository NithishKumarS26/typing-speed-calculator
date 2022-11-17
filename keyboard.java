package Nitish;

import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class keyboard {
	static String[] words = {"Dhoni", "finishes", "off", "in", "style","and","India", "lift", "the", "worldcup"};
	
		public static void main(String[] args) throws InterruptedException{
			System.out.println("3");
			TimeUnit.SECONDS.sleep(1);
			
			System.out.println("2");
			TimeUnit.SECONDS.sleep(1);
			
			System.out.println("1");
			TimeUnit.SECONDS.sleep(1);
			
			System.out.println();
			for (int i=0; i<10; i++)
			{
				System.out.print(words[i] + " ");
			}
			System.out.println();
			
			double start = LocalTime.now().toNanoOfDay();
			
			Scanner scan = new Scanner(System.in);
			String typedWords = scan.nextLine();
			
			System.out.println(typedWords);
	
			double end = LocalTime.now().toNanoOfDay();
			double elapsedTime = end - start;
			double seconds = elapsedTime / 1000000000.0;
			System.out.println(seconds);
			
			int numChars = typedWords.length();
			int wpm = (int) ((((double) numChars / 5) / seconds) * 60);
			int cpm = wpm/5;
			System.out.println("Your wpm is " + wpm + "!");
			System.out.println("Your cpm is " + cpm + "!");
		}

}