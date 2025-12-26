// Pprogram to reverse a given string without using any built-in reverse String


public class ReverseString{
	
	public static String reverseString(String text){
        String reverse = "";
		
		for(int i = text.length() - 1 ; i >= 0 ; i--){
			reverse += text.charAt(i);
		}
		
		return reverse;
	}
	
	public static void main(String[] args){
		String text = "ThisisTheEndOfWorld";
		
		String result =  reverseString(text);
		
		// Print reverse
		System.out.println("Reverse String = " + result);
	
	}
}