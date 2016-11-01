package com.ngocnv.beanScope;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

/**
 * Created by framgia on 01/11/2016.
 */

@Component
@Scope(value = WebApplicationContext.SCOPE_SESSION,
proxyMode = ScopedProxyMode.TARGET_CLASS)
public class ShoppingCart {


}
