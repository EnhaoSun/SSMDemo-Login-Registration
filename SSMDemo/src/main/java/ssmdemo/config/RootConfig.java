package ssmdemo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author Enhao Sun
 * @version 2019-04-14.
 */
@Configuration
@ComponentScan(basePackages = {"ssmdemo"},excludeFilters =
        {@ComponentScan.Filter(type = FilterType.ANNOTATION, value = EnableWebMvc.class)})
public class RootConfig {
}
