package odev5.utils.regex.concretes;

import odev5.utils.regex.abstracts.Reg;

public class ValidValuePassword implements Reg{

	@Override
	public boolean isItValidValue(String value) {
if(value.length()<6) {
	System.out.println("Parola en az 6 haneli olmal�");
	return false;
}else {
	System.out.println("Parola  6 haneden b�y�k.");

	return true;
}

		
	}

}
