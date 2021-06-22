package ru.nikiforov;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * todo Document type MyConfig
 */

@Configuration
@ComponentScan("ru.nikiforov")
@EnableAspectJAutoProxy
public class MyConfig {
}