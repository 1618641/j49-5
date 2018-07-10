package org.java.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by 马果 on 2018/7/9.
 */
@Configurable
@ComponentScan(basePackages ="org.java")
public class AppConfig {
}
