package raj;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class CourseController {
	@RequestMapping("/")
	public ModelAndView courses(@RequestParam("cname") String coursename,HttpSession session) {		
   ModelAndView mv=new ModelAndView();
   mv.addObject("cname",coursename);
   mv.setViewName("course.jsp");
return mv;
  
	}
	

}
