package com.springapp.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import reactor.core.Environment
import reactor.core.Reactor
import reactor.core.spec.Reactors

/**
 * Created by Mohsan on 02-07-2014.
 */
@Configuration
public class ReactorConfig {

    @Bean
    Environment reactorEnv() {
        return new Environment()
    }

    @Bean
    Reactor createReactor() {
       Reactors.reactor()
                .env(reactorEnv())
                .dispatcher(Environment.THREAD_POOL)
                .get()
    }
}
