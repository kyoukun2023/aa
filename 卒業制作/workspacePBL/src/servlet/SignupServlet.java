package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.TeacherDAO;

/**
 * Servlet implementation class SignupServlet
 */
@WebServlet("/SignupServlet")
public class SignupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher dispatcher=request.getRequestDispatcher("/WEB-INF/jsp/signup.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@SuppressWarnings("unused")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");

		String teacherName=(String) request.getParameter("teacherName");
		String teacherID=(String) request.getParameter("teacherID");
		String loginPass=(String) request.getParameter("loginPass");
		String kakupw=(String) request.getParameter("kakupw");
		String errorMsg=null;


		ArrayList<String> errList = new ArrayList<String>();

		if(teacherName=="") {
			errorMsg="教員名が入力されていません。";
			errList.add(errorMsg);

		}
		if(teacherID=="") {
			errorMsg="教員IDが入力されていません。";
			errList.add(errorMsg);

		}if(loginPass=="") {
			errorMsg="パスワードが入力されていません。";
			errList.add(errorMsg);

		}
		 if(kakupw=="") {
			errorMsg="確認用パスワードが入力されていません。";
			errList.add(errorMsg);

		 }

		 if(!loginPass.equals(kakupw)) {
			errorMsg="パスワード不一致です。";
			errList.add(errorMsg);
		}

		request.setAttribute("errList", errList);


		if(errorMsg!=null) {

			//エラーメッセージを設定(setAttribute)
			request.setAttribute("errorMsg",errorMsg);

			RequestDispatcher dispatcher=	request.getRequestDispatcher("/WEB-INF/jsp/signup.jsp");
			dispatcher.forward(request, response);


		}else{

			TeacherDAO teacherDAO = new TeacherDAO();
			teacherDAO.newTeacher(teacherID,teacherName,loginPass);

			RequestDispatcher dispatcher=request.getRequestDispatcher("/WEB-INF/jsp/signupdone.jsp");
			dispatcher.forward(request, response);
		}

}
}

