package com.victorromano.restcourse;

import com.victorromano.restcourse.test.UserAction;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

//@RunWith(SpringRunner.class)
//@SpringBootTest
public class RestCourseApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Test
    public void test() {
        UserAction test = UserAction.valueOf("REMOVED");
        System.out.println(test.getName() + " " +  test.ordinal());
        UserAction removed = UserAction.REMOVED;
        System.out.println(removed.getName());
    }

}
