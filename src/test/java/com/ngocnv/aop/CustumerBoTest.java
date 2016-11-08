package com.ngocnv.aop;

import com.ngocnv.config.CDPlayerConfig;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by framgia on 08/11/2016.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CustumerBoTest extends TestCase {

    @Autowired
    private CustumerBo custumerBo;


    @Test
    public void testAOP() throws Exception {
        custumerBo.addCustumer();
    }


}
