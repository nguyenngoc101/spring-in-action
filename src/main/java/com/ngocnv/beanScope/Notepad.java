package com.ngocnv.beanScope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by framgia on 01/11/2016.
 */

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class Notepad {

    private int count = 0;

    public void count() {
        count++;
        System.out.println("Count: " + count);
    }
}
