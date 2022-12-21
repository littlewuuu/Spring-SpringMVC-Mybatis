package com.mvc.controller;

import com.mvc.dao.EmployeeDAO;
import com.mvc.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeDAO employeeDAO;

    @GetMapping ("/employee")
    public String getEmployeeList(Model model){
        //请求域共享数据
        Collection<Employee> allEmployee = employeeDAO.getAll();
        model.addAttribute("employeeList",allEmployee);
        //返回逻辑视图
        return "employee_list";
    }

    @PostMapping("/employee")
    public String addEmployee(Employee employee){
        //保存信息
        employeeDAO.save(employee);
        //重定向，返回员工列表，但是要重新查询一次
        return "redirect:/employee";
    }
}
