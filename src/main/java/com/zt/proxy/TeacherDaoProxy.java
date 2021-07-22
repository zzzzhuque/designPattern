package com.zt.proxy;

public class TeacherDaoProxy implements ITeacherDao {
    TeacherDao teacherDao;

    TeacherDaoProxy(TeacherDao teacherDao) {
        this.teacherDao = teacherDao;
    }

    @Override
    public void teach() {
        System.out.println("老师进入教室");
        teacherDao.teach();
        System.out.println("老师结束授课");
    }
}
