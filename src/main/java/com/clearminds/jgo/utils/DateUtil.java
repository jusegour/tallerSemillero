package com.clearminds.jgo.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

	public static String obtenerFecha() {
		Date fechaHoy = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		return sdf.format(fechaHoy);
	}

}
