package com.bootcamp.misc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * The Class DepartmentController
 *
 * @author Kris Sunu Purnandaru
 */
@Controller
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @RequestMapping(value = "/listDept", method = RequestMethod.GET)
    public ModelAndView listDepartment(ModelAndView model) {
        List<Department> listDepartment = departmentService.getAllDepartments();
        model.addObject("listDepartment", listDepartment);
        model.setViewName("departments");
        return model;
    }
}
