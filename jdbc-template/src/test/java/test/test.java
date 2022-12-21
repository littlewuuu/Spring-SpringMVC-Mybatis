package test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:templatw.xml")
public class test {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void test(){
        String sql = "insert into tb_user values(null,?,?,?,?)";
        jdbcTemplate.update(sql,"lisi",12,"男",123);
    }

}
