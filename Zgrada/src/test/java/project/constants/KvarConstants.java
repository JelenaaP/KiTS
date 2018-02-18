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
		    datKreiranja.set(2018, 04, 01);
		    datZakazivanja = GregorianCalendar.getInstance();
		    datZakazivanja.clear();
		    datZakazivanja.set(2018, 04, 05);
		    datPopravke = GregorianCalendar.getInstance();
		    datPopravke.clear();
		    datPopravke.set(2018, 04, 06);

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
		public static final int DB_COUNT = 1;
		
		public static final Date NEW_DAT_KREIRANJA = datKreiranja.getTime();
		public static final String NEW_IME = "kvar2";
		public static final String NEW_OPIS = "opis kvara2";
		public static final Long DB_ID_REFERENCED = 1L;
		public static final int DB_COUNT_KVAR_KOMENTARI = 2;
		
		public static final Long DB_KORISNIK_SERVISA_ID = 3L;
		public static final int DB_COUNT_WITH_KORISNIK_SERVISA_ID = 1;
}