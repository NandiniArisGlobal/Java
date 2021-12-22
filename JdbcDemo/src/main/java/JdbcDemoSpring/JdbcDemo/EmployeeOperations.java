package JdbcDemoSpring.JdbcDemo;

import org.springframework.jdbc.core.JdbcTemplate;



public class EmployeeOperations {
JdbcTemplate jdbcTemplate;



//public JdbcTemplate getJdbcTemplate() {
//	return jdbcTemplate;
//}



public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
	this.jdbcTemplate = jdbcTemplate;
}



int insert(Db emp) {
	String name=emp.getName();
	String id=emp.getId();
	String email=emp.getEmail();
	String salary=emp.getSalary();
	
	   String query="insert into Db values('"+name+"','"+id+"','"+email+"','"+salary+"')";
	   int result=jdbcTemplate.update(query);
	   return result;
}
}
