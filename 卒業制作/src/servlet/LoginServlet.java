package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.LoginDAO;
import model.Teacher;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//フォワード
				RequestDispatcher dispatcher=request.getRequestDispatcher("/WEB-INF/jsp/index.jsp");
				dispatcher.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//リクエストパラメータの取得
				request.setCharacterEncoding("UTF-8");
				//"userId"はjspからもらってくる時の名前
				String userId = request.getParameter("loginID");
				String pass = request.getParameter("loginPass");
				//ログイン処理の実行

				LoginDAO dao = new LoginDAO();
				Teacher result = dao.userOut(userId, pass);

				//ログイン処理の成否によって処理を分岐
				if(result != null) {
					//ログイン成功時
					//セッションスコープにユーザIDを保存
					HttpSession session= request.getSession();
					session.setAttribute("userinfo", result);

				//フォワード
						RequestDispatcher dispatcher=request.getRequestDispatcher("/WEB-INF/jsp/teacherMenu.jsp");
							dispatcher.forward(request, response);
				}else {//ログイン失敗時
					String error="違います";
					request.setAttribute("error", error);
					//リダイレクト
					response.sendRedirect("/卒業制作/LoginServlet");


				}

	}

}
