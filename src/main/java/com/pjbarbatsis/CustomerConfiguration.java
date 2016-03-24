package com.pjbarbatsis;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.yammer.dropwizard.config.Configuration;
import io.dropwizard.db.DataSourceFactory;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public class CustomerConfiguration extends Configuration {

    public class ExampleConfiguration extends Configuration {
        @Valid
        @NotNull
        private DataSourceFactory database = new DataSourceFactory();

        @JsonProperty("database")
        public void setDataSourceFactory(DataSourceFactory factory) {
            this.database = factory;
        }

        @JsonProperty("database")
        public DataSourceFactory getDataSourceFactory() {
            return database;
        }
    }

}
