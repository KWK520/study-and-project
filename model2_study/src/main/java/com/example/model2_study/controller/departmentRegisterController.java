package com.example.model2_study.controller;

import com.example.model2_study.dao.DepartmentDao;
import com.example.model2_study.dao.DepartmentDaoImp;
import com.example.model2_study.dto.DepartmentDto;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/dept/register.do")
public class departmentRegisterController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/views/dept/register.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int register=0;
        DepartmentDao deptDao = null;
        String deptNo=req.getParameter("dept_no");
        try {
            DepartmentDto deptDto = new DepartmentDto();
            deptDto.setDeptNo(req.getParameter("deptNo"));
            deptDto.setDeptName(req.getParameter("deptName"));
            deptDao=new DepartmentDaoImp();
            register=deptDao.insert(deptDto);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if(register==0){
            resp.sendRedirect("./register.do");
        }else{
            resp.sendRedirect("./detail.do?dept_no="+deptNo);
        }
    }
}
