package String;

// Q.3> Array to String Convert: Give an one array and convert the Character array into String.
// char a [] = [B,e, , R,e,m,e,m,b,e,r,e,d, ,F,o,r, ,G,o,o,d,!] ---------> "Be Remembered For Good!"

public class ArrayToString_3 {

	public static void main(String[] args) {
		
		char a [] = {'B','e',' ','R','e','m','e','m','b','e','r','e','d',' ','F','o','r',' ','G','o','o','d','!'}; 

        // Convert the character array to a string
        String result = new String(a); 
		System.out.println(result);
	}
}
