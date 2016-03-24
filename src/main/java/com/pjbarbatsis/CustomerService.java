package com.pjbarbatsis;

import com.pjbarbatsis.resources.CustomerResouce;
import com.yammer.dropwizard.Service;
import com.yammer.dropwizard.config.Bootstrap;
import com.yammer.dropwizard.config.Environment;
import io.dropwizard.jdbi.DBIFactory;
import org.skife.jdbi.v2.DBI;

/**
 * Created by Peeta on 3/24/2016.
 */
public class CustomerService extends Service<CustomerConfiguration> {
    public static void main(String[] args) throws Exception {
        new CustomerService().run(args);
    }

    @Override
    public void initialize(Bootstrap<CustomerConfiguration> bootstrap) {

    }

    @Override
    public void run(CustomerConfiguration customerConfiguration, Environment environment) throws Exception {
        environment.addResource(new CustomerResouce());

        @Override
        public void run(ExampleConfiguration config, Environment environment) {
            final DBIFactory factory = new DBIFactory();
            final DBI jdbi = factory.build(environment, config.getDataSourceFactory(), "postgresql");
            final UserDAO dao = jdbi.onDemand(UserDAO.class);
            environment.jersey().register(new UserResource(dao));
        }
    }
}
