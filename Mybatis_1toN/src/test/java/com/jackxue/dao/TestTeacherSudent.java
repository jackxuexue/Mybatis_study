package com.jackxue.dao;

import com.jackxue.domain.Teacher;
import com.jackxue.utils.MybatisUtils;
import com.sun.org.apache.xpath.internal.axes.HasPositionalPredChecker;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestTeacherSudent {
    @Test
    public void testGetTeacher(){
        SqlSession sqlSesion = MybatisUtils.getSqlSesion();
        TeacherMapper mapper = sqlSesion.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacher(1);

        System.out.println(teacher);
        sqlSesion.close();
    }

    @Test
    public void testGetTeacher2(){
        SqlSession sqlSesion = MybatisUtils.getSqlSesion();
        TeacherMapper mapper = sqlSesion.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacher2(1);

        System.out.println(teacher);
        sqlSesion.close();
    }

    @Test
    public void findTeacher(){
        SqlSession sqlSesion = MybatisUtils.getSqlSesion();
        TeacherMapper mapper = sqlSesion.getMapper(TeacherMapper.class);
        Map map = new HashMap();
        map.put("id", 1);
//        map.put("name", "");
        List<Teacher> teachers = mapper.findTeacher(map);

        System.out.println(teachers);
        sqlSesion.close();
    }

    @Test
    public void findTeacherByIds(){
        SqlSession sqlSesion = MybatisUtils.getSqlSesion();
        TeacherMapper mapper = sqlSesion.getMapper(TeacherMapper.class);
        List<Integer> ids = new ArrayList<Integer>();
        ids.add(1);
        ids.add(2);
        List<Teacher> teachers = mapper.findTeacherByIDs(ids);

        System.out.println(teachers);
        sqlSesion.close();
    }

    @Test
    public void findTeacherByIds2(){
        SqlSession sqlSesion = MybatisUtils.getSqlSesion();
        TeacherMapper mapper = sqlSesion.getMapper(TeacherMapper.class);
        Map map = new HashMap();
        List<Integer> ids = new ArrayList<Integer>();
        ids.add(1);
        ids.add(2);
        map.put("ids", ids);
        List<Teacher> teachers = mapper.findTeacherByIDs2(map);

        System.out.println(teachers);
        sqlSesion.close();
    }


}
