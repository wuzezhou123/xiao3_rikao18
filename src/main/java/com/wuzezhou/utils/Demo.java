package com.wuzezhou.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo {
	public static void main(String[] args) throws ParseException, IOException {
		 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		Date dateByInitMonth = DateUtil.getDateByInitMonth(new Date());
		String format=sdf.format(dateByInitMonth);
		Date dateByFullMonth = DateUtil.getDateByFullMonth(new Date());
		String fmt=sdf.format(dateByFullMonth);
		System.out.println(format);
		System.out.println(fmt);
		String sql = "select * from t_order where create_time>='"+format+"' and create_time<='"+fmt+"' ";
		System.out.println(sql);
		String extendName = FileUtil.getExtendName("list.jsp");
		System.out.println(extendName);
		InputStream f=new FileInputStream("D:\\a.txt");
		String readTextFile = StreamUtil.readTextFile(f);
		System.out.println(readTextFile);
		 String readTextFile2 = StreamUtil.readTextFile(new File("d:\\a.txt"));
		 System.out.println(readTextFile2);
		 
	}
}
