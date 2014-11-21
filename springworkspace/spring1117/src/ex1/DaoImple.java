package ex1;

public class DaoImple implements Dao {

	@Override
	public void fifth() {
		String[] ar = { "±è¿ì¸®", "¾ç¼¼¾ğ", "±èÇöÃ¶", "±èÁ¾±Ô", "±è°æ¹Î", "¼·¼·ÀÌ" };
		
		for(int i =0; i <= ar.length; i++){
			System.out.println("ºñÁö´Ï½º ·ÎÁ÷:" + ar[i]);
		}

	}
}
