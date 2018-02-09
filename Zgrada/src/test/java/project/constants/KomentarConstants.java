package project.constants;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class KomentarConstants {

	private static final Calendar datKreiranja;
	
	static {
	    datKreiranja = GregorianCalendar.getInstance();
	    datKreiranja.clear();
	    datKreiranja.set(2015 , 0 , 1);
	    
	}

	public static final Long DB_ID = 1L;
	
	public static final Date DB_DAT_KREIRANJA = datKreiranja.getTime();
	public static final String DB_TEXT = "ovo je tekst komentara";
	public static final Long DB_KREATOR_ID = 1L;
	public static final Long DB_KVAR_ID = 1L;
	
	public static final Date NEW_DAT_KREIRANJA = datKreiranja.getTime();
	public static final String NEW_TEXT = "ovo je takodje komentar";
	public static final Long NEW_KREATOR_ID = 3L;
	public static final Long NEW_KVAR_ID = 1L;
	
	public static final int DB_COUNT = 2;
	public static final int DB_COUNT_WITH_KREATOR = 1;
	public static final int DB_COUNT_WITH_KVAR = 1;
}
