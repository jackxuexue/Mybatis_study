package com.jackxue.dao;

import com.jackxue.domain.Student;
import com.jackxue.domain.Teacher;
import com.jackxue.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.util.List;

public class TestDao {
    public static void main(String[] args) {
        SqlSession sqlSesion = MybatisUtils.getSqlSesion();
        StudentMapper mapper = sqlSesion.getMapper(StudentMapper.class);
        Student student = mapper.getStudent(1);
        System.out.println(student);
        sqlSesion.close();
    }

    @Test
    public void getStudents(){
        SqlSession sqlSesion = MybatisUtils.getSqlSesion();
        StudentMapper mapper = sqlSesion.getMapper(StudentMapper.class);
        List<Student> students = mapper.getStudents();
        for (Student student : students) {
            System.out.println(student);
        }
        sqlSesion.close();
    }
    @Test
    public void testTeacher(){
        SqlSession sqlSesion = MybatisUtils.getSqlSesion();
        TeacherMapper mapper = sqlSesion.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacher(1);
        System.out.println(teacher);
        sqlSesion.close();
    }
}
