package com.springMvc.pll;

import com.springMvc.pll.entity.Student;
import com.springMvc.pll.entity.User;
import com.springMvc.pll.repository.StudentRepository;
import com.springMvc.pll.repository.UserRepository;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by longlong.pan on 2016/6/23.
 */
public class UserMapperTest {
    SqlSessionFactory sqlSessionFactory;
    @Before
    public void initFactory() throws IOException {
        String resource = "mybatis/config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }
    @Test
    public void testUserMapper(){
        SqlSession sqlSession=sqlSessionFactory.openSession();
        String statment="mapper.UserMapper.selectById";
        User user=sqlSession.selectOne(statment,1);
        System.out.println("++++++++++++++"+user);
        sqlSession.close();
    }
    @Test
    public void testStudentMapper(){
        SqlSession sqlSession=sqlSessionFactory.openSession();
        StudentRepository studentRepository=sqlSession.getMapper(StudentRepository.class);
        Student student=studentRepository.selectById(1);
        System.out.println("++++++++++++++"+student);
        sqlSession.close();
    }
}
