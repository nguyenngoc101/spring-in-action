package com.ngocnv.beanScope;

import com.ngocnv.config.CDPlayerConfig;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by framgia on 01/11/2016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class NotepadTest extends TestCase {

    @Autowired
    Notepad notepad;

    @Test
    public void test() {
        notepad.count();
    }

    @Test
    public void test2() {
        notepad.count();
    }
}
