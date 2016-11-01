package com.ngocnv.beanScope;

import com.ngocnv.config.CDPlayerConfig;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * Created by framgia on 01/11/2016.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
@WebAppConfiguration

public class StoreServiceTest extends TestCase {

    @Autowired
    StoreService storeService;

    @Test
    public void test() {
        System.out.println(storeService.getShoppingCart());
    }

}
