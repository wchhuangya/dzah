/**
 * 项目  dzah-spring 
 * 创建时间  2015-6-24 上午11:12:47 
 * Copyright (c) 2015, wchhuangya All rights reserved.
 * wchhuangya 专有/保密源代码,未经许可禁止任何人通过任何* 渠道使用、修改源代码.
 */

package hello;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.client.RestTemplate;


/**
 * 类名: Application <br/> 
 * 功能: 可执行jar包的入口类 <br/> 
 * 创建日期: 2015-6-24 上午11:12:47 <br/> 
 *
 * @author wchya
 * @since Jdk 1.6
 * @see       
 *
 */
@SpringBootApplication
@EnableScheduling
public class Application implements CommandLineRunner {
	
	private static final Logger log = LoggerFactory.getLogger(Application.class);
	
	public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
    public void run(String... strings) throws Exception {
        RestTemplate restTemplate = new RestTemplate();
        Quote quote = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", Quote.class);
        log.info(quote.toString());
        
        log.info("Creating table...");
        
        jdbcTemplate.execute("DROP TABLE customers IF EXISTS");
        jdbcTemplate.execute("CREATE TABLE customers(id SERIAL, first_name VARCHAR(255), last_name VARCHAR(255))");
        
        //从完整姓名的数组中，把first name和last name分开，存入列表中
        //List<Object[]> splitUpNames = Arrays.asList("John Woo", "Jeff Dean", "Josh Bloch", "Josh Long").stream()
        List<Object[]> splitUpNames = new ArrayList<Object[]>();
        splitUpNames.add(new String[]{"John", "Woo"});
        splitUpNames.add(new String[]{"Jeff", "Dean"});
        splitUpNames.add(new String[]{"Josh", "Bloch"});
        splitUpNames.add(new String[]{"Josh", "Long"});
        
        for (Object[] arr : splitUpNames) {
			log.info(String.format("insert a customer's record for %s %s !", arr[0], arr[1]));
		}
        
        jdbcTemplate.batchUpdate("INSERT INTO customers(first_name, last_name) VALUES(?,?)", splitUpNames);
        
        log.info("the customer's info where first_name=John is:");
        List<Customer> list = jdbcTemplate.query("SELECT id, first_name, last_name FROM customers WHERE first_name = ?", 
        		new Object[] {"Josh"}, new RowMapper<Customer>(){
					@Override
					public Customer mapRow(ResultSet arg0, int arg1)
							throws SQLException {
						Customer ct = new Customer();
						ct.setId(arg0.getLong("id"));
						ct.setFirstName(arg0.getString("first_name"));
						ct.setLastName(arg0.getString("last_name"));
						return ct;
					}
        });
        for(Customer c : list)
        	System.out.println(c.toString());
    }
}
