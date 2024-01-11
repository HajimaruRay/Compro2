import java.util.Scanner;

public class Spellchecking2 { //(แนะนำให้ลงไปอ่าน main ก่อน)
    static int countmatch(String dictionary , String name){ // ฟังก์ชั่น เช็ค ว่า คำในคลังคำศัพท์ กับ คำศัพท์ที่รับมา ตรงกันแค่ไหน
        int match = 0;
        int N = 0;
        if (dictionary.length() >= name.length()){ // เช็คก่อนว่า คำในคลังคำศัพท์ กับ คำศัพท์ที่รับเข้ามา ใครยาวกว่ากัน เราจะให้ตัวที่สั้นกว่าเป็นตัว บอกจำนวน loop
            N = name.length(); 
        }
        else {
            N = dictionary.length();
        }
        for (int i=0; i<N; i++){
            if (dictionary.charAt(i) == name.charAt(i)){ // ลูปเช็คว่า ตัวอักษร ระหว่าง คำในคลังคำศัพท์ และ คำศัพท์ที่รับมา ตรงกันกี่ตัว 
                // เช่น คำว่า ant และ cnt สังเกตว่า มี 2 ตำแหน่งที่ซ้ำกันคือ n และ t ดังนั้นเราจะเก็บค่าจำนวนที่มันซ้ำกันไว้ใน match
                match +=1;
            }
        }

        return match; // return ค่า match ไปใช้
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // รับว่าจะมีคำศัพท์ทั้งหมดกี่คำ
        String dictionary[] = new String[N];
        int max = -1 ; 
        for (int i=0; i<N; i++){
            dictionary[i] = sc.next(); // รับว่าในคลังคำศัพท์ จะมีคำว่าอะไรบ้าง
        }
        String zname = "";  // กำหนด String เปล่า ไว้เพื่อจะ print ข้อความ
        int word = sc.nextInt();          
        for (int i=0; i<word; i++){ // loop ชั้นแรก ตามจำนวน คำศัพท์ที่จะรับมา
            max = -1;
            String name = sc.next();
            boolean correct = false; // boolean เช็คว่า คำที่รับมา ตรงกับคำในคำศัพท์มั้ย ถ้าไม่ตรง เราจะ ไป print อีกที นึงข้างล่าง
            for (int j=0; j<N; j++){ // loop ชั้นที่สอง ตามจำนวน คลังคำศัพท์ เพื่อจะเช็คว่า คำที่รับเข้ามา ตรงคำไหนที่สุด เราจะแก้เป็นคำนั้น 
                if (dictionary[j].equals(name)){ // เช็ค เงื่อนไข ว่า ถ้า มันเหมือนคำในคลังเป๊ะๆ ก็ให้ print ออกมาเลย
                    System.out.println(dictionary[j]);
                    correct = true;
                    break;
                }
                else {
                    if (countmatch(dictionary[j] , name) > max){ // ถ้าไม่เหมือน เราจะส่ง คลังคำศัพท์ และ คำศัพท์ที่รับมา ไปเช็คใน function
                        // แล้วนำมาเทียบกับ max 
                        max = countmatch(dictionary[j], name);  // ถ้ามากกว่า max เราจะให้ ค่า max เปลี่ยน เป็น ตัวที่มากสุด
                        zname = dictionary[j]; // จากนั้นเราจะให้ String เปล่า กลายเป็น คำในคลังคำศัพท์ ที่ใกล้เคียง กับ คำศัพท์ที่รับมา มากที่สุด เช่น
                        // หากในคลัง มีคำว่า ant และ cat  ||  รับ คำว่า cnt มา
                        // โปรแกรมจะแก้เป็นคำว่า ant เพราะ cnt กับ ant มี ค่าตำแหน่งตัวอักษรที่เหมือนกัน 2 ตัว คือ n กับ t 
                    }
                }
            }
            if (!correct){ 
                System.out.println(zname);
            }
        }
        sc.close();
    }
}
