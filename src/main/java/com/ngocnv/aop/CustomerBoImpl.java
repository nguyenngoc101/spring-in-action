package com.ngocnv.aop;

import org.springframework.stereotype.Component;

/**
 * Created by framgia on 08/11/2016.
 */

@Component
public class CustomerBoImpl implements CustumerBo {

    public void addCustumer() throws Exception {
        System.out.println("addCustomer() is running");
    }

    public String addCustomerReturnValue() {
        System.out.println("addCustomerReturnValue() is running");
        return "ab";
    }

    public void addCustomerThrowException() throws Exception {
        System.out.println("add CustomerThrowException() is running");
        throw new Exception("Genereic Error");
    }

    public void addCustomerAround(String name) {
        System.out.println("addCustomerAround() is running, args: " + name);
    }
}
