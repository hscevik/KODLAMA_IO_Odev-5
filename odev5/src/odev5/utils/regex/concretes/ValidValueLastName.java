package odev5.utils.regex.concretes;

import odev5.utils.regex.abstracts.Reg;

public class ValidValueLastName implements Reg{

	@Override
	public boolean isItValidValue(String value) {
		if(value.length()<2) {
			System.out.println("Soyad en az 2 haneli olmalý");
			return false;
		}else {
			System.out.println("Soyad  2  haneye eþit veya büyük.");

			return true;
		}

				
			}
	}


