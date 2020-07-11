package kanwaljeetsm;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HousieGame {
	
	static {
		System.out.println("Let's get some numbers!");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int randomNum = 0, count = 0;
		List<Integer> list = new ArrayList<Integer>();
		list.add(0);
		Random random = new Random();
		
loop:	while(count < 91) {
			randomNum = random.nextInt(91);
			
			for(int i = 0; i < list.size(); i++) {
				
				if(randomNum == list.get(i)) {
					continue loop;
				}
			}
			
			list.add(randomNum);
			System.out.println(randomNum);
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			count++;
		}
	}
}
