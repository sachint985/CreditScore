package com.creditscore.servlets;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.creditscore.data.GetData;
import com.creditscore.model.Pan;

public class CheckScore extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String pan = req.getParameter("pan");
		boolean match = false;
		List<Pan> list = GetData.getData();
		double score = 0;
		for(Pan p : list) {
			if(p.getPan().equalsIgnoreCase(pan)) {
				score = p.getScore();
				match = true;
			}
		}
		
		if(match) {
			if(score < 5) {
				resp.sendRedirect("NotEligible");
			}
			else {
				resp.sendRedirect("Eligible");
			}
		}
		else {
			resp.sendRedirect("Invalid");
		}
		
		resp.getWriter().write(pan);
	}

}
