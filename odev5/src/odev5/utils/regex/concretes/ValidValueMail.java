package odev5.utils.regex.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import odev5.utils.regex.abstracts.Reg;

public class ValidValueMail  implements Reg{

	public void isItValidValueMail(String mailAdress) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isItValidValue(String value) {
        String patternString="^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern = Pattern.compile(patternString);
		Matcher status=pattern.matcher(value);
				
		 ;
		 if(status.matches()) {
				System.out.println("Mail adresi geçerli.");
				return true;
		 }else {
			 
				System.out.println("Mail adresi geçersiz.");
				return false;

		 }
	}
	
}
