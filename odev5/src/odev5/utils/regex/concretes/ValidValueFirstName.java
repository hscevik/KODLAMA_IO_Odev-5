package odev5.utils.regex.concretes;

import odev5.utils.regex.abstracts.Reg;

public class ValidValueFirstName implements Reg {

	@Override
	public boolean isItValidValue(String value) {
		if(value.length()<2) {
			System.out.println("�sim en az 2 haneli olmal�");
			return false;
		}else {
			System.out.println("�sim  2 haneye e�it veya  b�y�k.");

			return true;
		}

				
			}
	}


