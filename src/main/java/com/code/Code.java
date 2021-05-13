package com.code;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Code {
	
	public int Suma(int a, int b) {
		int c = a + b;
		return c;
	}
	
	public int Resta(int a, int b) {
		int c = a - b;
		return c;
	}
	
	public int Multiplicacion(int a, int b) {
		int c = a * b;
		return c;
	}
	
	public int Division(int a, int b) {
		int c = a / b;
		return c;
	}
	
	public int Contador(int x) {
		int T = x + 1;
		return T;
	}
	
	public String GetActualHour() {
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
		String actualHour = "Actual hour = " + format.format(calendar.getTime());
        return actualHour;
    }
	
	public String GetActualDate() {
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat format = new SimpleDateFormat("dd MMMM yyyy");
		String actualDate = "Actual date = " + format.format(calendar.getTime());
        return actualDate;
    }
	
	public String GetReportDate() {
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy - hh:mm:ss");
		String actualReportDate = "Report Date = " + format.format(calendar.getTime());
        return actualReportDate;
    }

}
