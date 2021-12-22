

public class Q4 {

	
	static String entemp;
	static String detemp;
	
	static StringBuilder encrypted = new StringBuilder();
	static StringBuilder decrypted = new StringBuilder();
	
	static String encryptedStr="";
	static String decryptedStr="";
	
	public static void encrypt(String message,int key) {
	
		
	    for (char c : message.toCharArray()) {
	    	
	    if((int)c+key>126) {
	    	entemp = Character. toString((char) 32+(int)c+key-127);
	    	encrypted.append(entemp);
	    }
	    else {
	    	entemp = Character. toString((char) (int)c+key);
	    	encrypted.append(entemp);
	    }
	    }
	    
	    //shifting here
	    String output = encrypted.toString();
	    
	    String old = output ;
        char first = old.charAt(old.length()-1);
        
        String newString = first+old.substring(0,old.length()-1);
        
        encryptedStr= newString;
        
        System.out.println("encrypt(\""+message+"\""+","+key+") =>"+ encryptedStr);
        
			
	} 
	public static void decrypt(String message,int key) {
		
		String old = encryptedStr ;
		char last = old.charAt(0);
		
		String newString = old.substring(1,old.length())+last;
		 
		 
		 for (int c : newString.toCharArray()) {
			 
			 
			 if((int)c-key<32) {
			    	detemp = Character. toString((char)(int)c-key+127-32);
			    	decrypted.append(detemp);
			    }
			    else {
			    	detemp = Character. toString((char) (int)c-key);
			    	decrypted.append(detemp);
			    }
			   
			    }
		 
		 String output = decrypted.toString();
		 decryptedStr=output;
		 
		 System.out.println("decrypt(\"" +encryptedStr+ "\","+key+")=> " +"\""+ decryptedStr+"\"");
		
	}
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		String msg1="Lost time is never found again.";
		String msg2="Use it or lose it.";
		
		int key=17;
		
		encrypt(msg1,key);
		decrypt("?]!%&1&z~v1z%1 v(v$1w!' u1rxrz",key);
		
		System.out.println(" ");
		
		encrypt(msg2,key);
		decrypt("?f%v1z&1!$1}!%v1z&",key);
		
		
		
		
		

	}

}
