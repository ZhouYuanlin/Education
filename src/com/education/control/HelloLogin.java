package com.education.control;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.education.service.StudentService;

@Controller
public class HelloLogin {

	@Autowired
	StudentService studentService;

//	@RequestMapping("/login")
//	public ModelAndView login(@RequestParam(value = "zh") String num,
//			@RequestParam(value = "password") String password,
//			Map<String, Object> map) {
//		Boolean flag = studentService.login(num, password);
//		ModelAndView mav = new ModelAndView();
//
//		mav.addObject(map);
//		if (flag != true) {
//			map.put("test1", "fail");
//			return mav;
//		} else {
//			map.put("test1", "success");
//			return mav;
//		}
	//}
	
	@RequestMapping("/login")
	public ModelAndView login(Map<String, Object> map){
		ModelAndView mav = new ModelAndView();
		map.put("test1", "fail");
		return mav;
	}

}
