package com.example.model2_study.dao;

import com.example.model2_study.EmployeesDBConnection;
import com.example.model2_study.dto.DepartmentDto;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;
public class DepartmentDaoImp implements DepartmentDao {
    private Connection conn;
    private PreparedStatement ps;
    private ResultSet rs;
    public DepartmentDaoImp() throws Exception {
        conn= EmployeesDBConnection.getConnection();
    }

    @Override
    public void close() {
        try{
            if(rs!=null) rs.close();
            if(ps!=null) ps.close();
            if(conn!=null) conn.close();
        } catch(Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public List<DepartmentDto> findAll() throws Exception {
        List<DepartmentDto> list = null;
        String sql = "select * from departments ";
        ps = conn.prepareStatement(sql);
        rs = ps.executeQuery();
        if (rs.next()){
            DepartmentDto dto = new DepartmentDto();
            dto = new DepartmentDto();
            dto.setDeptNo(rs.getString("dept_no"));
            dto.setDeptName(rs.getString("dept_name"));
        }
        return list;
    }

    @Override
    public DepartmentDto findById(String id) throws Exception {
        DepartmentDto dto = null;
        String sql = "select * from departments where dept_no = ?";
        ps = conn.prepareStatement(sql);
        ps.setString(1, id);
        rs = ps.executeQuery();
        if (rs.next()){
            dto = new DepartmentDto();
            dto.setDeptNo(rs.getString("dept_no"));
            dto.setDeptName(rs.getString("dept_name"));
        }
        return dto;
    }

    @Override
    public int deleteById(String id) throws Exception {
        int delete = 0;
        String sql = "delete from departments where dept_no = ?";
        ps = conn.prepareStatement(sql);
        ps.setString(1, id);
        delete = ps.executeUpdate();
        return delete;
    }

    @Override
    public int update(DepartmentDto departmentDto) throws Exception {
        int update = 0;
        String sql="update departments set dept_no = ?, dept_name = ? where dept_no = ?";
        ps = conn.prepareStatement(sql);
        ps.setString(1, departmentDto.getDeptName());
        ps.setString(2, departmentDto.getDeptNo());
        update = ps.executeUpdate();
        return update;
    }

    @Override
    public int insert(DepartmentDto departmentDto) throws Exception {
        int insert = 0;
        String sql="insert into departments (dept_no,dept_name) values (?,?)";
        ps = conn.prepareStatement(sql);
        ps.setString(1, departmentDto.getDeptNo());
        ps.setString(2, departmentDto.getDeptName());
        insert = ps.executeUpdate();
        return insert;
    }
}
