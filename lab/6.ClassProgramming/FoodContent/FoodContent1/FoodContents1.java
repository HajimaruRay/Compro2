import java.util.Scanner;
import java.util.ArrayList;

class Food 
{
    void printinfo(String foodName, int w1, ArrayList<String> ingrediant) // สร้าง method รับค่า
	{ 
		//ปริ้น
		System.out.println(foodName);
		System.out.println(w1);
		for (int i = 0;i < ingrediant.size();i++)
		{
			System.out.print(ingrediant.get(i) + " ");
		}
		System.out.println();
	}

	int addContent(Scanner sc,int w1,ArrayList<String> ingrediant) // สร้าง method รับค่า
	{
    	String content1 = sc.next(); // รับวัตถุดิบอันต่อไป
		ingrediant.add(content1); // ใส่วัตถุดิบที่รับเมื่อกี้ลงarrayList
		w1 = sc.nextInt() + w1; // เพิ่มค่าน้ำหนักตามที่โจทย์สั่ง
		return w1; // คืนค่่า w1 เพื่อให้ค่า w1อัพเดท
	}
}

public class FoodContents1 
{
    public static void main(String[] args) 
	{
    	Scanner sc = new Scanner(System.in); //สร้าง scanner
		Food food = new Food(); // สร้าง object food
    	String foodName = sc.next();
    	String content1 = sc.next();
    	int w1 = sc.nextInt();
    	int q = sc.nextInt();

		ArrayList<String> ingrediant = new ArrayList<>();
		ingrediant.add(content1); // ใส่วัตถุดิบเเรกลงarrayList
		    
	    while(q != 0) 
		{
	        if(q == 1) 
			{
				food.printinfo(foodName, w1, ingrediant); // ส่งค่าไปให้ printinfo ใน class food
	        } 
    	    else if(q == 2) 
			{
    		    w1 = food.addContent(sc,w1,ingrediant); // ส่งค่าไปให้ addContent ใน class food
    	    }
    	    q = sc.nextInt();
	    }
		sc.close();
	}
}