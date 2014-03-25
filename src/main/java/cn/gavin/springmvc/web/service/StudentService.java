package cn.gavin.springmvc.web.service;

import javax.annotation.Resource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service(value="sService")
public class StudentService {

	@Resource
	private TeacherService tService;
	
	@Resource
	private JdbcTemplate jdbcTemplate;
	
	@Transactional(propagation = Propagation.REQUIRED)
	public void addStudent(){
		String sql = "insert into student(name) values('st0')";
		jdbcTemplate.execute(sql);
//		try{
//			int a = Integer.parseInt("s");
//		}catch(Exception e){
//			throw new RuntimeException();
//		}
//		tService.addTeacher();
//		tService.addTeacher6();
//		tService.addTeacher1();
		tService.addTeacher3();
//		tService.addTeacher4();
//		tService.addTeacher5();
		
//		throw new RuntimeException();
	}
	
	
	@Transactional(propagation = Propagation.MANDATORY)
	public void addStudent1(){
		String sql = "insert into student(name) values('st1')";
		jdbcTemplate.execute(sql);
	}
	
	@Transactional(propagation = Propagation.NESTED)
	public void addStudent2(){
		String sql = "insert into student(name) values('st2')";
		jdbcTemplate.execute(sql);
		tService.addTeacher2();
//		throw new RuntimeException();
	}
	
	@Transactional(propagation = Propagation.NEVER)
	public void addStudent3(){
		String sql = "insert into student(name) values('st3')";
		jdbcTemplate.execute(sql);
		tService.addTeacher6();
		throw new RuntimeException();
	}
	
	@Transactional(propagation = Propagation.NOT_SUPPORTED)
	public void addStudent4(){
		String sql = "insert into student(name) values('st4')";
		jdbcTemplate.execute(sql);
		tService.addTeacher4();
		throw new RuntimeException();
	}
	
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void addStudent5(){
		String sql = "insert into student(name) values('st5')";
		jdbcTemplate.execute(sql);
		tService.addTeacher5();
		throw new RuntimeException();
	}
	
	@Transactional(propagation = Propagation.SUPPORTS)
	public void addStudent6(){
		String sql = "insert into student(name) values('st6')";
		jdbcTemplate.execute(sql);
		tService.addTeacher6();
		throw new RuntimeException();
	}


	public TeacherService gettService() {
		return tService;
	}


	public void settService(TeacherService tService) {
		this.tService = tService;
	}
}
