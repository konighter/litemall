package org.linlinjava.litemall.db;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringRunner.class)
public class DbTest {
    private static final Logger log = LoggerFactory.getLogger("tex");
    @Test
    public void test() {
        for (int i = 405; i<= 433; i++) {
            double tex = i * 0.04;
            double bankPay = i * 0.4;


            log.info("计算结果,  总价: {}, 网签: {}, 成本: {} 贷款: {}, 税费: {}, 首付: {} ", 451, i, 451 + tex, bankPay, tex, 451 - bankPay + tex + 11.54);



        }



    }

}
