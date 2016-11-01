package com.ngocnv.config;

import com.ngocnv.beanScope.Notepad;
import com.ngocnv.common.Dessert;
import com.ngocnv.wiringBean.CompactDisc;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by framgia on 25/10/2016.
 */

@Configuration
//@ComponentScan(basePackageClasses = { CompactDisc.class, Dessert.class, Notepad.class})
@ComponentScan(basePackages = {"com.ngocnv"})
public class CDPlayerConfig {

}
