package com.ngocnv.aop;

import org.springframework.stereotype.Component;

/**
 * Created by framgia on 08/11/2016.
 */

public interface CustumerBo {

    void addCustumer() throws Exception;
    String addCustomerReturnValue();
    void addCustomerThrowException() throws Exception;
    void addCustomerAround(String name);

}
