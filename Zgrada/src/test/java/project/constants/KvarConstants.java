package project.constants;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class KvarConstants {
	private static final Calendar datKreiranja;
	private static final Calendar datZakazivanja;
	private static final Calendar datPopravke;
	
		static {
		    datKreiranja = GregorianCalendar.getInstance();
		    datKreiranja.clear();
		    datKreiranja.set(5 , 1 , 2018);
		    datZakazivanja = GregorianCalendar.getInstance();
		    datZakazivanja.clear();
		    datZakazivanja.set(5, 1, 2018);
		    datPopravke = GregorianCalendar.getInstance();
		    datPopravke.clear();
		    datPopravke.set(6, 1, 2018);

		}
		public static final Long DB_ID = 1L;
		
		public static final Date DB_DAT_KREIRANJA = datKreiranja.getTime();   
		public static final Date DB_DAT_ZAKAZIVANJA = datZakazivanja.getTime(); 
		public static final Date DB_DAT_POPRAVKE = datPopravke.getTime();
		public static final String DB_IME = "kvar1";
		public static final String DB_OPIS = "opis kvara1";
		public static final Boolean DB_POPRAVLJEN  = true;
		public static final Long DB_KREATOR_ID = 1L;
		public static final Long DB_ZGRADA_ID = 1L;
		public static final Long DB_KORISNIK_SERVISA_ID = 1L;
		public static final int DB_COUNT = 1;
		public static final int DB_COUNT_WITH_RADNIK = 1;
		
		public static final Date NEW_DAT_KREIRANJA = datKreiranja.getTime();
		public static final String NEW_IME = "kvar2";
		public static final String NEW_OPIS = "opis kvara2";
		public static final int NEW_ZGRADA_ID = 1;
		public static final int NEW_KREATOR_ID = 1;
		public static final Long DB_ID_REFERENCED = 1L;
		public static final int DB_COUNT_KVAR_KOMENTARI = 1;
}