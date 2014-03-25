package cn.gavin.springmvc.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TeacherService {

	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	/**
	 * REQUIRED
	 */
	@Transactional(propagation = Propagation.REQUIRED)
	public void addTeacher(){
		String sql = "insert into teacher(name) values ('t0')";
		jdbcTemplate.execute(sql);
//		throw new RuntimeException();
	}
	
	
	/**
	 * MANDATORY
	 */
	@Transactional(propagation = Propagation.MANDATORY)
	public void addTeacher1(){
		String sql = "insert into teacher(name) values ('t1')";
		jdbcTemplate.execute(sql);
	}
	
	
	/**
	 * NESTED
	 */
	@Transactional(propagation = Propagation.NESTED)
	public void addTeacher2(){
		String sql = "insert into teacher(name) values ('t2')";
		jdbcTemplate.execute(sql);
	}
	
	
	/**
	 * NEVER
	 */
	@Transactional(propagation = Propagation.NEVER)
	public void addTeacher3(){
		String sql = "insert into teacher(name) values ('t3')";
		jdbcTemplate.execute(sql);
	}
	
	
	/**
	 * NOT_SUPPORTED
	 */
	@Transactional(propagation = Propagation.NOT_SUPPORTED)
	public void addTeacher4(){
		String sql = "insert into teacher(name) values ('t4')";
		jdbcTemplate.execute(sql);
		throw new RuntimeException();
	}
	
	
	/**
	 * REQUIRES_NEW
	 */
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void addTeacher5(){
		String sql = "insert into teacher(name) values ('t5')";
		jdbcTemplate.execute(sql);
	}
	
	
	/**
	 * SUPPORTS
	 */
	@Transactional(propagation = Propagation.SUPPORTS)
	public void addTeacher6(){
		String sql = "insert into teacher(name) values ('t6')";
		jdbcTemplate.execute(sql);
	}
}
