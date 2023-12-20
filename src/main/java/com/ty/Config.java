package com.ty;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@ComponentScan(basePackages = "com.ty")
@PropertySource(value = "classpath:studentProp.properties ")
public class Config {
}
