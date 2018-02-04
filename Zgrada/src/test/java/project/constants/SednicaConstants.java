package project.constants;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class SednicaConstants {
	private static final Calendar datKreiranja;
	private static final Calendar datZakazivanja;
	
	static {
	    datKreiranja = GregorianCalendar.getInstance();
	    datKreiranja.clear();
	    datKreiranja.set(5 , 1 , 2018);
	    datZakazivanja = GregorianCalendar.getInstance();
	    datZakazivanja.clear();
	    datZakazivanja.set(5, 1, 2018);
	}
	public static final Long DB_ID = 1L;
	
	public static final Boolean DB_AKTIVNA = false; 
	public static final Date DB_DAT_KREIRANJA = datKreiranja.getTime();   
	public static final Date DB_DAT_ZAKAZIVANJA = datZakazivanja.getTime(); 
	public static final Long DB_KREATOR_ID = 1L;
	public static final Long DB_ZGRADA_ID = 1L;
	
	public static final int DB_COUNT = 1;
	public static final int DB_COUNT_WITH_ZGRADA=1;
	public static final int DB_COUNT_WITH_KREATOR=1;
	
	public static final Boolean NEW_AKTIVNA = true; 
	public static final Date NEW_DAT_KREIRANJA = datKreiranja.getTime();   
	public static final Date NEW_DAT_ZAKAZIVANJA = datZakazivanja.getTime(); 
	
}
