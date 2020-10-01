package spcx.sandbox.enableautoconfigdemo;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@EnableAutoConfiguration(exclude= DataSourceAutoConfiguration.class)
class EnableAutoConfigDemoApplicationTests
{

}
