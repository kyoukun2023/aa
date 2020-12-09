package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.SenseiDAO;

/**
 * Servlet implementation class SenseiServlet
 */
@WebServlet("/SenseiServlet")
public class SenseiServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		request.setCharacterEncoding("UTF-8");
		String rink =request.getParameter("rink");
		if(rink==null) {
		//フォワード
		RequestDispatcher dispatcher=request.getRequestDispatcher("/WEB-INF/jsp/index.jsp");
		dispatcher.forward(request, response);
		}else if(rink.equals("kyoutou")) {
		RequestDispatcher dispatcher=request.getRequestDispatcher("/WEB-INF/jsp/senseiTouroku.jsp");
		dispatcher.forward(request, response);

		}


	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		request.setCharacterEncoding("UTF-8");

		String SenseID=request.getParameter("SenseID");
		String SenseName=request.getParameter("SenseName");
		String yakuwari=request.getParameter("yakuwari");
		String errorMsg=null;

		ArrayList<String> errList = new ArrayList<String>();

		if(SenseID=="") {
			errorMsg="教員名が入力されていません。";
			errList.add(errorMsg);

		}
		if(SenseName=="") {
			errorMsg="教員IDが入力されていません。";
			errList.add(errorMsg);

		}
		request.setAttribute("errList", errList);

		if(errorMsg!=null) {

			//エラーメッセージを設定(setAttribute)
			request.setAttribute("errorMsg",errorMsg);

			RequestDispatcher dispatcher=	request.getRequestDispatcher("/WEB-INF/jsp/senseiTouroku.jsp");
			dispatcher.forward(request, response);


		}else{

			SenseiDAO teacherDAO = new SenseiDAO();
			teacherDAO.newTeacher(SenseID,SenseName,yakuwari);

			RequestDispatcher dispatcher=request.getRequestDispatcher("/WEB-INF/jsp/kyoutouroku.jsp");
			dispatcher.forward(request, response);
		}

	}

}
