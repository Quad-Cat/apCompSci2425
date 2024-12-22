/*
 *	Author:
 *  Date:
 *	Collaborator(s):
*/

import pkg.*;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Cipher cat = new Cipher();
		
		System.out.println(cat.keyedEncode("go to this link: mrpoole.com. you should buy the domain", 17));
		
		String message1 = cat.encode("6v lvp u5vuy5 y1z5 qpsqy5r");
		System.out.println("1. " + message1);
		
		String message2 = cat.encode("sv8vq17r 1r q25 85rq");
		System.out.println("2. " + message2);

		String message3 = cat.encode("q25 z5l qv wpx85s f 1r gg");
		System.out.println("3. " + message3);

		String message4 = cat.keyedEncode("z8r8v 6yzzc 64r8 oys sx z8r8v 6y4z6 ty 18t oys 9yqz", 33);
		System.out.println("4. " + message4);
		
		String message5 = cat.encode("29y4 v4 v2q9w1r 05sr5l wpx85s 1r z5l qv d");
		System.out.println("5. " + message5);

		String message6 = cat.keyedEncode("a8 1oy 92 1kx rxdj in 4", 8);
		System.out.println("6. " + message6);
		
		
		// for (int i = 0; i<=36; i++) {
		// 	String message7 = cat.keyedEncode("549q94u8 q3t sxys0u3 q7u 2e vqb47y9u bq7yqr1u 3q2u8", i);
		// 	System.out.println(i + ". " + message7);
		// }
		
		//DOES NOT WORK; DOES NOT HAVE AN OUTPUT
		String message7 = cat.keyedEncode("549q94u8 q3t sxys0u3 q7u 2e vqb47y9u bq7yqr1u 3q2u8", 13);
		System.out.println("7. " + message7);
		
		
		String message8 = cat.encode("lvpo5 rp775rr4pyyl 7vxuy5q56 q25 41srq r57q1vw");
		System.out.println("8. " + message8);
		
		System.out.println("\n\n");
		
		// for (int i = 0; i<=36; i++) {
		// 	String messageH1 = cat.keyedEncode("u4y i1e i5 i6ita5c 314c1i66e1 i5f by6i5 hea5c zbi58 u4y", i);
		// 	System.out.println(i + ". " + messageH1);
		// }
		String messageH1 = cat.keyedEncode("u4y i1e i5 i6ita5c 314c1i66e1 i5f by6i5 hea5c zbi58 u4y", 27);
		System.out.println("H 1. " + messageH1);
		
		// for (int i = 0; i<=36; i++) {
		// 	String messageH2 = cat.keyedEncode("amlb mfhp7fcj jlgq fo tap s9a bjlslql aflipa lb hlg9b 210z t9ct", i);
		// 	System.out.println(i + ". " + messageH2);
		// }
		String messageH2 = cat.keyedEncode("amlb mfhp7fcj jlgq fo tap s9a bjlslql aflipa lb hlg9b 210z t9ct", 16);
		System.out.println("H 2. " + messageH2);
		
	}
}
