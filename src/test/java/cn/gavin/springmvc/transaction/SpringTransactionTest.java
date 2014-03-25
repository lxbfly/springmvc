package cn.gavin.springmvc.transaction;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import cn.gavin.springmvc.web.service.StudentService;

public class SpringTransactionTest {

	/**
	 * For maven build
	 * 
	 * private StudentService sService;
	 * 
	 * @Before public void setUp() throws Exception {
	 * @SuppressWarnings("resource") BeanFactory context = new
	 *                               FileSystemXmlApplicationContext(
	 *                               "src/test/resources/applicationContext.xml"
	 *                               ); sService = (StudentService)
	 *                               context.getBean("sService"); }
	 * 
	 *                               // 会开启事务，在事务范围内使用则使用同一个事务，否则开启新事务
	 * @Test public void testRequires() { sService.addStudent(); }
	 * 
	 *       // 无论何时自身都会开启事务
	 * @Test public void testRequiresNew() { sService.addStudent5(); }
	 * 
	 *       // 自身不会开启事务，在事务范围使用抛出异常
	 * @Test public void testNever() { sService.addStudent(); }
	 * 
	 *       // 自身不会开启事务，在事务范围内使用挂起事务，运行完毕恢复事务
	 * @Test public void testNotSupport() { sService.addStudent4(); }
	 * 
	 *       // 自身不会开启事务，在事务范围内使用挂起事务，运行完毕恢复事务
	 * @Test public void testNotSupport1() { sService.addStudent(); }
	 * 
	 *       // 自身不会开启事务，在事务范围内则使用相同事务，否则不使用事务
	 * @Test public void testSupport() { sService.addStudent6(); }
	 * 
	 *       // 自身不开启事务，必须在事务环境使用否则报错
	 * @Test public void testMandatory() { sService.addStudent1(); }
	 * 
	 *       // 如果没有事务环境其特性同Propagation.REQUIRED,否则嵌套运行事务
	 * @Test public void testNested() { sService.addStudent2(); }
	 */
}
