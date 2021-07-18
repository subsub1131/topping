package map.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MapMarkerServlet
 */
@WebServlet("/MapMarkerServlet")
public class MapMarkerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MapMarkerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	public void ajaxGetRegData(@requestParam String 지역명, @requestParam string 관광지(선택한거)){
		// 1, 지역 코드 정보를 불러온다.
		Map<String,String> regCode = mapService.getInfo(지역명);
		// 2. 관광지 코드 정보를 불러온다.
		Map<String,String> choiceCode = mapService.getInfo(관광지);
		
		
		// 이 작업은 따로 class 만들어서 해주는게 좋음. 보통 이런 작업은 controller 단에서 하지 않음.
		try{
			for(int i=0;i<regCode.length; i++){
				// 여기서 디비에서 가져온 정보랑 param 으로 가져온 정보 매칭해서 코드를 가져와
				a = map.get("지역명");
				b = map.get("관광지");
				// 작업 후 코드 합치고 다시 다시 그 코드로 select 로 정보 가져오기
				mapService.getAllInfo(a+b);
				
		
		
		
	}

}
