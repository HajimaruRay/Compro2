import java.util.Scanner;
import java.util.ArrayList;

class Food1
{

    int kcal;
    Food1 (int kcal)
    {
        this.kcal = kcal;
    }
    void printinfo(String foodName, String content1,int w1,ArrayList<String> ingrediant) // สร้าง method รับค่า
	{ 
		//ปริ้น
		System.out.println(foodName);
		System.out.println(w1 + " " + kcal);
		for (int i = 0;i < ingrediant.size();i++)
		{
			System.out.print(ingrediant.get(i) + " ");
		}
		//System.out.println();
	}

	int addContent(Scanner sc,int w1,ArrayList<String> ingrediant) // สร้าง method รับค่า
	{
    	String content1 = sc.next(); // รับวัตถุดิบอันต่อไป
		ingrediant.add(content1); // ใส่วัตถุดิบที่รับเมื่อกี้ลงarrayList
        int least = w1; // เก้บค่าน้ำหนักไว้สองที่
		w1 = sc.nextInt(); // เพิ่มค่าน้ำหนักตามที่โจทย์สั่ง
        int kcalperw1 = sc.nextInt(); //รับค่าคำนวณเเคล 
        kcal = (w1 * kcalperw1) + kcal; // (น้ำหนัก * เเคลต่อน้ำหนัก) + เเคลอันที่เเล้ว
        w1 += least; // น้ำหนักใหม่ + น้ำหนักเก่า
		return w1; // คืนค่่า w1 เพื่อให้ค่า w1อัพเดท
	}
}

public class FoodContents2
{
    public static void main(String[] args) 
	{
    	Scanner sc = new Scanner(System.in); //สร้าง scanner
        int kcal = 1;
    	String foodName = sc.next();
    	String content1 = sc.next();
    	int w1 = sc.nextInt();
        int kcalperw1 = sc.nextInt(); //รับค่าคำนวณเเคลต่อน้ำหนัก
        kcal = w1 * kcalperw1; // น้ำหนัก * เเคล
    	int q = sc.nextInt();
        Food1 food = new Food1(kcal); // สร้าง object food
		ArrayList<String> ingrediant = new ArrayList<>();
		ingrediant.add(content1); // ใส่วัตถุดิบเเรกลงarrayList
		    
	    while(q != 0) 
		{
	        if(q == 1) 
			{
				food.printinfo(foodName, content1, w1, ingrediant); // ส่งค่าไปให้ printinfo ใน class food
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