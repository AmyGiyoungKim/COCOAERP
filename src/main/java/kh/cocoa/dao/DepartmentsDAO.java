package kh.cocoa.dao;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DepartmentsDAO {

    public String getDeptName();
}