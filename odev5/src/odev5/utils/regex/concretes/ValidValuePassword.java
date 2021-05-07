package odev5.utils.regex.concretes;

import odev5.utils.regex.abstracts.Reg;

public class ValidValuePassword implements Reg{

	@Override
	public boolean isItValidValue(String value) {
if(value.length()<6) {
	System.out.println("Parola en az 6 haneli olmalý");
	return false;
}else {
	System.out.println("Parola  6 haneden büyük.");

	return true;
}

		
	}

}
