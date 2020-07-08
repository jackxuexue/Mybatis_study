package com.jackxue.dao;

import com.jackxue.domain.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface TeacherMapper {
    public abstract Teacher getTeacher(@Param("tid") int id);
    public abstract Teacher getTeacher2(@Param("tid") int id);
    public abstract List<Teacher> findTeacher(Map map);

    public abstract List<Teacher> findTeacherByIDs(List<Integer> list);

    public abstract List<Teacher> findTeacherByIDs2(Map map);
}
