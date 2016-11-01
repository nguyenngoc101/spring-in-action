package com.ngocnv.common;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * Created by framgia on 01/11/2016.
 */

@Component
public class Cookies implements Dessert {
    @Override public void taste() {
        System.out.println("taste from Cookies");
    }
}
