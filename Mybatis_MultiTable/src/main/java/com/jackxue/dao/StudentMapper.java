package com.jackxue.dao;

import com.jackxue.domain.Student;

import java.util.List;

public interface StudentMapper {
    public abstract Student getStudent(int id);
    public abstract List<Student> getStudents();
}
