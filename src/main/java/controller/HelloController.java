package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	@RequestMapping("/yahoo")
	public ModelAndView a() {
		ModelAndView a = new ModelAndView();
		a.addObject("UserID/Email");
		a.addObject("msg", "How are you ?");
		a.addObject("Password");
		a.setViewName("Form");
		return a;
	}

	@PostMapping("/google")
	public ModelAndView b(@RequestParam("studentName") String name, @RequestParam("`studentHobby") String hobby) {
		ModelAndView b = new ModelAndView();
		Student s=new Student();
		s.setStudentName(name);
		s.setStudentHobby(hobby);
		b.addObject("s",s);
	
		b.setViewName("HelloPage");
		return b;
	}
}
