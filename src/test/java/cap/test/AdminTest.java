package cap.test;

import cap.bean.Admin;
import cap.service.AdminService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AdminTest {
    ApplicationContext context = null;

    @Before
    public void init() {
        context = new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    @Test
    public void testAdmin() {
        //ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        Admin admin = (Admin) context.getBean("admin1");
        System.out.println(admin.getId() + ":" + admin.getUsername() + ":" + admin.getPassword());
    }

    @Test
    public void testAdmin2() {
        //ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        Admin admin = (Admin) context.getBean("admin11");
        System.out.println(admin.getId() + ":" + admin.getUsername() + ":" + admin.getPassword());
    }

    @Test
    public void testAdmin3() {
        //ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        Admin admin = (Admin) context.getBean("admin111");
        System.out.println(admin.getId() + ":" + admin.getUsername() + ":" + admin.getPassword());
    }

    @Test
    public void testSayHello() {
        AdminService adminService = (AdminService) context.getBean("Service2");
        System.out.println(adminService.sayHello());

    }

    @Test
    public void testAdmin1() {
        Admin admin = new Admin();
        admin.setId(1);
        admin.setUsername("zdw");
        admin.setPassword("zdw");
        System.out.println(admin.getId() + ":" + admin.getUsername() + ":" + admin.getPassword());
    }
}