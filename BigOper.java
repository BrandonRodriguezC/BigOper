import java.util.ArrayList;

public class BigOper {
	// Functional methods
	public static int base = 10;

	/**
	 * Checks if the Vector <String []> has numbers lower than the Base <Integer> if
	 * all of them are lower than the base returns True <Boolean> else returns False
	 * <Boolean>
	 */
	public static boolean checkNumber(String vec[], int base) {
		for (int i = 0; i < vec.length; i++) {
			if (Integer.parseInt(vec[i]) > base) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Checks if the Number <String> has numbers lower than the Base <Integer> if
	 * all of them are lower than the base returns True <Boolean> else returns False
	 * <Boolean>
	 */
	public static boolean checkNumber(String number, int base) {
		for (int i = 0; i < number.length(); i++) {
			if (Character.getNumericValue(number.charAt(i)) > base) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Appends "0" at the beginning Times<Integer> times to the number <String> then
	 * returns a String with the result
	 */
	public static String appendZeros(String number, int times) {
		for (int i = 0; i < times; i++) {
			number = "0" + number;
		}
		return number;
	}

	/**
	 * Appends "0" at the end Times<Integer> times to the number <String> then
	 * returns a String with the result
	 */
	public static String appendZerosFinal(String num, int times) {

		for (int i = 0; i < times; i++) {
			num = num + "0";
		}
		return num;
	}

	/**
	 * Finds the complement number form for the number<String> and returns it as a
	 * String
	 */
	public static String complement(String number) {
		String result = "";
		for (int i = 0; i < number.length(); i++) {
			result += String.valueOf(Math.abs(Character.getNumericValue(number.charAt(i)) - 9));
		}
		return result;
	}

	/**
	 * Compares two A <String> and B <String> and finds if they are equal and prints
	 * the character value where it is different
	 */
	public static void compare(String a, String b) {
		if (a.equals(b)) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

		System.out.println();
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) != b.charAt(i)) {
				// System.err.print(a.charAt(i));
				System.out.print(a.charAt(i));
			} else {
				System.out.print(a.charAt(i));
			}
		}
		System.out.println();
		for (int g = 0; g < b.length(); g++) {
			if (a.charAt(g) != b.charAt(g)) {
				System.err.print(b.charAt(g));
			} else {
				System.out.print(b.charAt(g));
			}
		}
	}

	/**
	 * Compares Num1 <String> and Num2 <String> and finds if Num1 is mayor than Num2
	 * then returns True <Boolean> else it returns False <Boolean>
	 */
	public static boolean mayorThan(String num1, String num2) {
		if (num1.length() < num2.length()) {
			return false;
		} else if (num1.length() == num2.length()) {

			for (int i = 0; i < num1.length(); i++) {

				if (Character.getNumericValue(num1.charAt(i)) > Character.getNumericValue(num2.charAt(i))) {
					return true;
				} else if (Character.getNumericValue(num1.charAt(i)) < Character.getNumericValue(num2.charAt(i))) {
					return false;
				}

			}

		}
		return true;
	}

	/**
	 * Subtracts 1 to a Number <ArrayList<Integer>> then returns the result as an
	 * ArrayList<Integer>
	 */
	public static ArrayList<Integer> sustractionOne(ArrayList<Integer> number) {
		int i = number.size() - 1;
		if (number.get(i) == 0) {
			while (number.get(i) == 0) {
				number.set(i, 9);
				i--;
			}
		}
		if (i == 0 && number.get(i) - 1 == 0) {
			number.remove(number.get(i));
		} else {
			number.set(i, number.get(i) - 1);
		}
		return number;

	}

	/**
	 * Adds 1 to a Number <ArrayList<Integer>> then returns the result as an
	 * ArrayList<Integer>
	 */
	public static ArrayList<Integer> plusOne(ArrayList<Integer> number) {
		int position = number.size() - 1;
		int num = number.get(position);
		if (num == 9) {
			while (number.get(position) == 9 && position > 0) {
				number.set(position, 0);
				position--;
			}
		}
		if (position == -1) {
			number.add(0, 1);
		} else {
			number.set(position, num + 1);
		}

		return number;

	}

	/**
	 * Creates a NewNumber <ArrayList<Integer>> based on a Number <String> then
	 * returns the NewNumber
	 */
	public static ArrayList<Integer> creatingNumber(String number) {
		ArrayList<Integer> newNumber = new ArrayList<Integer>();
		for (int i = 0; i < number.length(); i++) {
			newNumber.add(Character.getNumericValue(number.charAt(i)));
		}
		return newNumber;
	}

	/**
	 * Creates a Result <String> based on a Number <ArrayList<Integer>> then returns
	 * the Result
	 */
	public static String arrayListToString(ArrayList<Integer> number) {
		String result = "";
		for (int i = 0; i < number.size(); i++) {
			result += number.get(i);
		}
		return result;
	}

	// Principal methods

	/**
	 * Computes a Factorial based on a Number <Integer> and returns it as a List
	 * <ArrayList<Integer>>
	 */
	public static ArrayList<Integer> factorial(int numero) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		int carry = 0;
		int unit, number;
		for (int i = 1; i < numero + 1; i++) {
			for (int j = list.size() - 1; j > -1; j--) {
				number = list.get(j) * i;
				unit = number % 10;
				if (carry != 0) {
					unit += carry;
					carry = unit / 10;
					unit %= 10;
				}
				list.set(j, unit);
				carry = number / 10 + carry;
			}
			while (carry != 0) {
				number = carry;
				unit = number % 10;
				list.add(0, unit);
				carry = number / 10;
			}

		}
		return list;
	}

	/**
	 * Computes the addition of two numbers based on Number1 <String> and Number2
	 * <String>, returns the result as Result <String>
	 */
	public static String addition1(String num1, String num2) {

		int size = Math.abs(num1.length() - num2.length());

		if (num1.length() < num2.length()) {
			num1 = appendZeros(num1, size);
		} else {
			num2 = appendZeros(num2, size);
		}

		if (checkNumber(num1, base) && checkNumber(num2, base)) {
			String result = "";
			int carry = 0, number, unit;
			for (int i = num2.length() - 1; i >= 0; i--) {
				number = Character.getNumericValue(num1.charAt(i)) + Character.getNumericValue(num2.charAt(i));
				unit = number % base;
				if (carry != 0) {
					unit = carry + unit;
					carry = unit / base;
					unit %= base;
				}
				result = String.valueOf(unit) + result;
				carry = number / base + carry;
			}
			if (carry > 0) {
				result = carry + result;
				carry = 0;
			}
			return result;
		} else {
			return "Numeros invalidos para la operacion con la base";
		}
	}

	/**
	 * Computes the addition of two numbers based on Number1 <String> and Number2
	 * <String>, returns the result as List <ArrayList<Integer>>
	 */
	public static ArrayList<Integer> addition2(String num1, String num2) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		int size = Math.abs(num1.length() - num2.length());

		if (num1.length() < num2.length()) {
			num1 = appendZeros(num1, size);
		} else {
			num2 = appendZeros(num2, size);
		}

		int carry = 0, number, unit;
		for (int i = num2.length() - 1; i >= 0; i--) {
			number = Character.getNumericValue(num1.charAt(i)) + Character.getNumericValue(num2.charAt(i));
			unit = number % base;
			if (carry != 0) {
				unit = carry + unit;
				carry = unit / base;
				unit %= base;
			}
			list.add(0, unit);
			carry = number / base + carry;
		}
		while (carry != 0) {
			number = carry;
			unit = number % 10;
			list.add(0, unit);
			carry = number / 10;
		}
		return list;

	}

	/**
	 * Computes the subtraction of two numbers based on Number1 <String> and Number2
	 * <String>, returns the result as List <ArrayList<Integer>>
	 */
	public static ArrayList<Integer> subtraction(String num1, String num2) {
		int sign = 1;
		
		if (mayorThan(num2, num1)) {
			String aux = num1;
			num1 = num2;
			num2 = aux;
			sign = -1;
		}

		int size = Math.abs(num1.length() - num2.length());

		int carryAddition;

		if (num1.length() < num2.length()) {
			num1 = appendZeros(num1, size);
		} else {
			num2 = appendZeros(num2, size);
		}
		num2 = complement(num2);

			ArrayList<Integer> list = new ArrayList<Integer>();
			int carry = 0, number, unit;
			for (int i = num2.length() - 1; i >= 0; i--) {
				number = Character.getNumericValue(num1.charAt(i)) + Character.getNumericValue(num2.charAt(i));
				unit = number % base;
				if (carry != 0) {
					unit = carry + unit;
					carry = unit / base;
					unit %= base;
				}
				list.add(0, unit);
				carry = number / base + carry;
			}
			int position = list.size() - 1;
			while (carry != 0) {
				carryAddition = list.get(position) + carry;
				carry = carryAddition / base;
				carryAddition %= base;
				if (position >= 0) {
					list.set(position, carryAddition);
				} else {
					list.add(0, carryAddition);
				}
				position--;
			}
			list.set(0, list.get(0) * sign);
			while(list.get(0)==0) {
				list.remove(0);
			}
			return list;
		
	}

	/**
	 * Computes the multiplication of two numbers based on Number1 <String> and Number2
	 * <String>, returns the result as a result <ArrayList<Integer>>
	 */
	public static ArrayList<Integer> multiplication(String number1, String number2) {
		if (mayorThan(number2, number1)) {
			String aux = number1;
			number1 = number2;
			number2 = aux;
		}
		ArrayList<Integer> num1= creatingNumber(number1);
		ArrayList<Integer> num2= creatingNumber(number2);
		String result = "";
		ArrayList<String> nums = new ArrayList<String>();
		int number, unit, carry=0;
		
		for (int i = num2.size()-1; i >= 0; i--) {
			
			for (int j = num1.size()-1; j >=0; j--) {
				number= num2.get(i)*num1.get(j);
				unit= number%base;
				if (carry != 0) {
					unit += carry;
					carry = unit / base;
					unit %= base;
				}
				result=unit+result;
				carry = number / base + carry;
			}
			while (carry != 0) {
				number = carry;
				unit = number % 10;
				result=unit+result;
				carry = number / 10;
			}
			nums.add(result);
			result="";
		}
		int size= nums.size();
		for (int i = 0; i < nums.size(); i++) {
			nums.set(i, appendZerosFinal(nums.get(i), i));
		}
		for (int i = size-1; i >=1; i--) {
			nums.set(i-1, addition1(nums.get(i), nums.get(i-1)));
			nums.remove(i);
		}
		return creatingNumber(nums.get(0));
	}

	/**
	 * Computes the division of two numbers based on Number1 <String> and Number2
	 * <String>, returns the result as a result <ArrayList<Integer>>
	 */
	public static ArrayList<Integer> division(String number1 , String number2) {
		int countStart=0;
		int countEnd=number2.length();
		String shortN="";
		int unit=0;
		int end=number1.length();
		ArrayList<Integer> result=new ArrayList<Integer> ();
		
		while(countEnd<end+1) {
			shortN=shortN+number1.substring(countStart, countEnd);
			
			if(mayorThan(number2,shortN )) {
				unit=0;
			}else {
				while(mayorThan(shortN, number2)) {
					shortN=arrayListToString(subtraction(shortN, number2));
					unit++;
				}
			}
			
			result.add(unit);
			
			unit=0;
			countStart=countEnd;
			countEnd++;
		}
		
		return result;
	}
	
}
