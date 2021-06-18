package com.ict.model;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class grades implements Command
{
	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response )
	{
		String result = "view/grades_result.jsp";
		String name = request.getParameter("name");
		// String kor = request.getParameter("kor");
		// String eng = request.getParameter("eng");
		// String math = request.getParameter("math");
		int kor = Integer.parseInt(request.getParameter("kor"));
		int eng = Integer.parseInt(request.getParameter("eng"));
		int math = Integer.parseInt(request.getParameter("math"));
		
		int sum = kor+eng+math;
		int avg = sum/3;
		String hak = "";
		if (avg>=90) 
		{
			hak = "A학점";
		}else if(avg>=80)
		{
			hak = "B학점";
		}else if(avg>=70)
		{
			hak = "C학점";
		}else
		{
			hak = "F학점";
		}
		// String grades = "총점 : "+sum+"/t/t평균 : "+avg+"/t/t학점 : "+hak;
		request.setAttribute("name", name);
		request.setAttribute("kor", kor);
		request.setAttribute("eng", eng);
		request.setAttribute("math", math);
		request.setAttribute("sum", sum);
		request.setAttribute("avg", avg);
		request.setAttribute("hak", hak);
		// request.setAttribute("grades", grades);
		return result;
	}
}
