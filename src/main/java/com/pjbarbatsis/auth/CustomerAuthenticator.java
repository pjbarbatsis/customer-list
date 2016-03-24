package com.pjbarbatsis.auth;

import com.google.common.base.Optional;
import com.pjbarbatsis.core.Customer;
import io.dropwizard.auth.AuthenticationException;
import io.dropwizard.auth.Authenticator;
import io.dropwizard.auth.basic.BasicCredentials;

/**
 * Created by Peeta on 3/24/2016.
 */
public class CustomerAuthenticator implements Authenticator<BasicCredentials, Customer> {
    public Optional<Customer> authenticate(BasicCredentials basicCredentials) throws AuthenticationException {
        if("p@ssw0rd".equals(basicCredentials.getPassword())){
            return Optional.of(new Customer());
        }
        return Optional.absent();
    }
}
