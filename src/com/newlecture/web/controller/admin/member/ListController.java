package com.newlecture.web.controller.admin.member;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.newlecture.web.entity.Member;
import com.newlecture.web.service.MemberService;


@WebServlet("/admin/member/list")
public class ListController extends HttpServlet {
   @Override
   protected void service(HttpServletRequest requset, HttpServletResponse response)
         throws ServletException, IOException {
      // TODO Auto-generated method stub
	   
	   int size =10;
	   
	   String size_= requset.getParameter("size");
	   
	   if(size_!=null)
		   size =Integer.parseInt(size_);
	   
      PrintWriter out = response.getWriter();

      MemberService service = new MemberService();
      List<Member> list = service.getList();

      String html = "<table border='1'>";

      for (int i=0; i<size; i++) {
          Member m = list.get(i);
          html += "<tr>";
          html += "<td>"+ i +"</td><td>" + m.getNicname() + "</td><td>" + m.getName() + "</td>";
          html += "</tr>";
       }


      html += "</table>";

      out.println(html);
   }
}