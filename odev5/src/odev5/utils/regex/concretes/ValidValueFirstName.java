package odev5.utils.regex.concretes;

import odev5.utils.regex.abstracts.Reg;

public class ValidValueFirstName implements Reg {

	@Override
	public boolean isItValidValue(String value) {
		if(value.length()<2) {
			System.out.println("Ýsim en az 2 haneli olmalý");
			return false;
		}else {
			System.out.println("Ýsim  2 haneye eþit veya  büyük.");

			return true;
		}

				
			}
	}


