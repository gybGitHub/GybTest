package com.gem.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.gem.mapper.EmployeeMapper;
import com.gem.vo.Employee;

public class T1 {

	public static void main(String[] args) throws IOException {
	
		  // mybatis的配置文件
        // 使用类加载器加载mybatis的配置文件（它也加载关联的映射文件）
        InputStream is = Resources.getResourceAsStream("mybatis.xml");
        // 构建SqlSessionFactory,通过SqlSessionFactory来获取session
        SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(is);
        // 通过SqlSessionFactory获取session
        SqlSession session = sf.openSession();
       // 查询一条记录，给他指定的sql和参数，参数要与你配置时给定参数类型一致否则会报类型异常
        EmployeeMapper mapper=session.getMapper(EmployeeMapper.class);
        List<Employee> list = mapper.getAllEmployee();
        
        // 打印list
        System.out.println(list);
        for (Employee emp : list) {
            System.out.println(emp.getEmpId()+"\t"+emp.getEmpName());
			
		}
	}

}
