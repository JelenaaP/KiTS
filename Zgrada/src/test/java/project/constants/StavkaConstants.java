package project.constants;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class StavkaConstants {
	private static final Calendar datKreiranja;
	
	static {
	    datKreiranja = GregorianCalendar.getInstance();
	    datKreiranja.clear();
	    datKreiranja.set(2018 , 0 , 1);
	}
	public static final Long DB_ID = 1L;

	public static final Date DB_DAT_KREIRANJA = datKreiranja.getTime();   
	public static final String DB_IME = "stavka1";
	public static final String DB_OPIS = "opis stavke";
	public static final Long DB_KREATOR_ID = 1L;
	public static final Long DB_SEDNICA_ID = 3L;
	
	public static final int DB_COUNT = 1;
	public static final int DB_COUNT_WITH_KREATOR=1;
	
	public static final Date NEW_DAT_KREIRANJA = datKreiranja.getTime();   
	public static final String NEW_IME = "stavka2";
	public static final String NEW_OPIS = "opis stavke2";
}
