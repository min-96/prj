package com.newlecture.web.controller.admin.notice;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


	
	@WebServlet("/admin/notice/reg")
	public class RegController extends HttpServlet {
	   @Override
	   protected void service(HttpServletRequest request, HttpServletResponse response)
	         throws ServletException, IOException {
		   
		   
		   request.setCharacterEncoding("UTF-8");
		   
		   String title = request.getParameter("title");
		   if(title != null ) 
			   System.out.printf("title is %s\n",title);
			   
//		   PrintWriter out = response.getWriter();
		  // String [] titles = request.getParameterValues("titles");
		 
		   
		   
		   String file = request.getParameter("file");
		   String [] foods = request.getParameterValues("food");
		   
		   
//		   for(int i =0; i<titles.length; i++)
//			   System.out.printf("title is %s\n",titles[i]);
			   
		   for(int i =0; i<foods.length; i++)
		       System.out.printf("foods is %s\n",foods[i]);
		   
		   System.out.printf("file is %s\n",file);
		   
	   }
}
