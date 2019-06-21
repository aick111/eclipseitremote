/**
* @Title: StudentServiceImpl.java
* @Package org.wqd.service.Impl
* @Description: TODO		描述该文件做什么
* @author wqdeng
* @date 2019年5月20日
* @version V1.0
*/
package org.wqd.service.Impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.wqd.dao.StudentMapper;
import org.wqd.entity.Student;
import org.wqd.service.StudentService;

/**
 * @Description: TODO 描述这个类的作用
 * @author wqdeng
 * @date 2019年5月20日 下午5:55:54
 *
 */
@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentMapper studentMapper;

	/* 
	 * 
	 */
	@Override
	public Student queryObject(Integer id) {
		// TODO Auto-generated method stub
		return studentMapper.queryObject(id);
	}

	/* 
	 * 
	 */
	@Override
	public List<Student> queryList(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	 * 
	 */
	@Override
	public int queryTotal(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return 0;
	}

	/* 
	 * 
	 */
	@Override
	public int save(Student student) {
		// TODO Auto-generated method stub
		return studentMapper.save(student);
	}

	/* 
	 * 
	 */
	@Override
	public int update(Student student) {
		// TODO Auto-generated method stub
		return 0;
	}

	/* 
	 * 
	 */
	@Override
	public int delete(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	/* 
	 * 
	 */
	@Override
	public int deleteBatch(Integer[] ids) {
		// TODO Auto-generated method stub
		return 0;
	}

}
