package org.wqd.controller;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.wqd.entity.Student;
import org.wqd.service.Impl.StudentServiceImpl;

/**
 * @Description: TODO 123123
 * @author wqdeng
 * @date 2019年5月20日 下午5:57:25
 *
 */
@RequestMapping("controller")
@Controller
public class StudentController {

	@Autowired
	private StudentServiceImpl studentService;

	@RequestMapping("queryStuddentByNo")
	public String queryStudentByNo(@RequestParam("stuno") Integer id, Map<String, Object> map) {
		Student student = studentService.queryObject(id);
		if (null != student) {
			System.out.println(
					student.getStuNo() + "****" + student.getStuName() + "*****" + student.getStuAge() + "******");
			map.put("student", student);
		}
		return "result";
	}

	@RequestMapping("queryAddStudent")
	public String queryAddStudent(Student student, Map<String, Object> map) {
		int m = studentService.save(student);
		if (m == 1)
			System.out.println("提交成功");
		map.put("student", student);
		return "result";
	}
}
