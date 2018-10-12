package id.MLPT.Servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import id.MLPT.Config.KoneksiDatabase;
import id.MLPT.Data.DataKaryawan;
import id.MLPT.DAO.TampilData;


/**
 * Servlet implementation class TampilkanDataKaryawan
 */
@WebServlet("/TampilkanDataKaryawan")
public class TampilkanDataKaryawan extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TampilkanDataKaryawan() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		TampilData muncul = new TampilData();
		
		for (DataKaryawan value : muncul.TampilData()) {
            System.out.println(value.getNama());
        }
		
		
		
		
		request.setAttribute("empList", muncul.TampilData());
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/TampilkanDataKaryawan.jsp");
		rd.forward(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
