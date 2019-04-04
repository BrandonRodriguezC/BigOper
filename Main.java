import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.math.BigInteger;
import java.util.ArrayList;

public class Main {
public static int format=10;
	public static void main(String[] args) throws IOException {
//		long startTime = System.nanoTime();
		
//		String num2="3463445674562325209801345812395078080864664808987979798712412412498098098098098124124858755803253051352035023513850139502835813513";
//		String num1="827365827638562836590980598205802385765765757578048102840180481009009809809808043243243242424080980980980984414324242424242424028305820850283058203580238512572176410235288523723";
		
//		printList(BigOper.addition2(num1, num2));
//		System.out.println();
//		printList(BigOper.subtraction(num1, num2));
//		System.out.println();
//		printList(BigOper.multiplication(num1, num2));
//		System.out.println();
//		printList(BigOper.division(num1, num2));
//		System.out.println();
		
//		BigInteger number1= new BigInteger(num1);
//	    BigInteger number2= new BigInteger(num2);
//	    System.out.println(number1.add(number2));
//	    System.out.println(number1.subtract(number2));
//	    System.out.println(number1.multiply(number2));
//		System.out.println(number1.divide(number2));
		
//		long endTime = System.nanoTime();
//		System.out.println("Took " + (endTime - startTime) + " ns");
		
//		String s="827365827638562836590980598205802385765765757581511548514742806218811155622203121324107907233068960779693396826822340522340522152430679606086311254932273536086026549738124337236";
//		String r="827365827638562836590980598205802385765765757574584657165618155799208463997412965162378577615093001182268572001826144326144325904180962094479805152228203489058326270732452710210";
//		String m="2865536597015458754577519625116424729237814556072928842159005514878769783188513977418804750981651890353711177469428621576470143771930747225170011642809801664633780113933505634987708180033439651401665918120962211968538357968874915718176495640538373018617297800511596605186557305189784618777672063527504468899";
//		String d="238885175452655787834405809049947657783710402360";
//		
//		String sb="827365827638562836590980598205802385765765757581511548514742806218811155622203121324107907233068960779693396826822340522340522152430679606086311254932273536086026549738124337236";
//		String rb="827365827638562836590980598205802385765765757574584657165618155799208463997412965162378577615093001182268572001826144326144325904180962094479805152228203489058326270732452710210";
//		String mb="2865536597015458754577519625116424729237814556072928842159005514878769783188513977418804750981651890353711177469428621576470143771930747225170011642809801664633780113933505634987708180033439651401665918120962211968538357968874915718176495640538373018617297800511596605186557305189784618777672063527504468899";
//		String db="238885175452655787834405809049947657783710402360";
		
		//BigOper.compare(s, sb);
		//BigOper.compare(r, rb);
		//BigOper.compare(m, mb);
		//BigOper.compare(d, db);
		//B-5128306 ns BR- 122138192
		
		/**
		 * -Revisar division 10/10
		 */
		
		pc2Read(); 
	}

	public static void process(String vec[]) {
		if(vec[0].equals("1")) {
			printList(BigOper.factorial(Integer.parseInt(vec[1])));
		}else if(vec[0].equals("2")) {
			printList(BigOper.addition2(vec[1], vec[2]));
		}else if(vec[0].equals("3")) {
			printList(BigOper.subtraction(vec[1], vec[2]));
		}else if(vec[0].equals("4")) {
			printList(BigOper.multiplication(vec[1], vec[2]));
		}else if(vec[0].equals("5")) {
			printList(BigOper.division(vec[1], vec[2]));
		}
	}

	public static void pc2Read() throws IOException {
		String line, vec[] = null;
		BufferedReader buffer = new BufferedReader(new InputStreamReader(
				System.in));

		try {
			while ((line = buffer.readLine()).length() > 0) {
				vec = line.split(" ");
				process(vec);
			}
		} catch (NullPointerException e) {
		}
		buffer.close();
	}
	
	/**
	 * Takes a List <ArrayList<Integer>> and print it node by node
	 */
	public static void printList(ArrayList<Integer> list) {
		for (int g = 0; g < list.size(); g++) {
			if((g+1)%format==0) {
				System.out.print(list.get(g)+"\n");
			}else {
			System.out.print(list.get(g));}
		}
	}

}
