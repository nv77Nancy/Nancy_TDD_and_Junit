package task8;

public class RemoveAfromString {
	public String remove(String string) {
		
		switch(string.length()) {
			case 0:
				break;
				
			case 1:
				if(string.charAt(0)=='A')	string="";
				break;
				
			default:
				char firstChar=string.charAt(0);
				char secondChar=string.charAt(1);
				
				if(firstChar=='A' && secondChar=='A') {
					string=string.substring(2,string.length());
				}
				else if(firstChar=='A') {
					string=string.substring(1,string.length());
				}
				else if(secondChar=='A') {
					string=firstChar+string.substring(2,string.length());
				}
				break;
		}
		
		return string;
	}
}