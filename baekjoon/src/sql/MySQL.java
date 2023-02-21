package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MySQL {
	public MySQL(String Query) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test2?serverTimezone=UTC", "test", "test");
			Statement stmt = conn.createStatement();

			//stmt.executeUpdate(Query);
			ResultSet rs = stmt.executeQuery(Query);
			
			//rs.get ~~~~ 자바식으로 생각
			//id pw -> getInt
			//name -> getString
			//get(int) 방식은 데이터베이스 컬럼순서 (없는 컬럼 번호일경우 에러)
			//get string 방식은 데이터베이스 컬럼명 (불일치시 에러)
			
			while(rs.next()) {
				System.out.println("id: " + rs.getInt("id"));
				System.out.println("pw: " + rs.getInt("pw"));
				System.out.println("name: " + rs.getString("name"));
				System.out.println("--------------------");
			}
			//수정, 삭제, 삽입은 DB쪽에서 이루어지는 작업이기 때문에 값을 받아올 필요가 없다.
			
			//하지만 select는 조회이기 때문에 DB로부터 조회된 데이터들을 받아온다.
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String id = "2"; // 컴포넌트에서 getText()로 받아와서 변수에 저장했다고 가정.
		//String pw = "1234";
		//String name = "JS";
		//내가 넣을 값이 정수인지, 문자인지, 시간인지 등등(DB에서의 자료형)
		//문자는 무조건 홑따옴표, 
		
		//MySQL mysql = new MySQL("insert into member values('"+id+"','"+pw+"','"+name+"')");
		MySQL mysql = new MySQL("select * from member");
	}

}
