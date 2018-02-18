package project.constants;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class ObavestenjeConstants {
	private static final Calendar datKreiranja;
	
		static {
		    datKreiranja = GregorianCalendar.getInstance();
		    datKreiranja.clear();
		    datKreiranja.set(2018, 01, 01);
		}
		public static final Long DB_ID = 2L;
		
		public static final Date DB_DAT_KREIRANJA = datKreiranja.getTime();
		public static final String DB_IME = "obavestenje1";
		public static final String DB_OPIS = "opis obavestenja1";
		public static final Long DB_KREATOR_ID = 1L;
		public static final Long DB_ZGRADA_ID = 1L;
		
		public static final Date NEW_DAT_KREIRANJA = datKreiranja.getTime();
		public static final String NEW_IME = "Obavestenje2";
		public static final String NEW_OPIS = "Opis obavestenja2";
		
		public static final int DB_COUNT = 2;
		public static final int DB_COUNT_WITH_ZGRADA = 2;
		public static final int DB_COUNT_WITH_KREATOR = 2;
}