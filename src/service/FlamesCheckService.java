package service;

public class FlamesCheckService {

	
	public int findFlames(String name1, String name2) {
		String temp1 = name1.trim();
		String temp2 = name2.trim();
		temp1 = name1.toLowerCase();
		temp2 = name2.toLowerCase();
		String temp1_split[] = name1.split(" ");
		String temp2_split[] = name2.split(" ");
		temp1 = "";
		temp2 = "";
		for (int i = 0; i < temp1_split.length; i++) {
			temp1 = temp1 + temp1_split[i];
		}
		for (int i = 0; i < temp2_split.length; i++) {
			temp2 = temp2 + temp2_split[i];
		}
		int length = temp1.length() + name2.length();
		boolean temp_check[] = new boolean[name2.length()];
		for (int i = 0; i < temp2.length(); i++) {
			temp_check[i] = false;
		}
		for (int i = 0; i < temp1.length(); i++) {
			for (int j = 0; j < temp2.length(); j++) {
				if ((temp_check[j] == false) && (temp1.charAt(i) == temp2.charAt(j))) {
					temp_check[j] = true;
					length = length - 2;
					break;
				}
			}
		}
		boolean flames_check[] = new boolean[6];
		for (int i = 0; i < 6; i++) {
			flames_check[i] = true;
		}
		int count = 6;
		int k = 1, deleted_letters = 0;
		int j;
		for (j = 0; j <= count; j++) {
			if (k <= length) {
				if (j == count) {
					j = 0;
				}
				if (flames_check[j] == true) {
					k = k + 1;
				}
			}
			if ((k - 1) == length) {
				deleted_letters = deleted_letters + 1;
				flames_check[j] = false;
				k = 1;
			}
			if (deleted_letters == 6) {
				return j;
			}
		}
		return 0;
	}
	
	
}
