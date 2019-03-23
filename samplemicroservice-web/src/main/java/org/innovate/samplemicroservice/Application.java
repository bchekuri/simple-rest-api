package org.innovate.samplemicroservice;

import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 *
 * @author BChekuri
 *
 */

@EnableSwagger2
@SpringBootApplication(scanBasePackages = {"org.innovate.samplemicroservice"})
@EnableAutoConfiguration
@EnableConfigurationProperties
public class Application {

	/**
	 * LOGGER.
	 */
	private static final Logger log = LoggerFactory.getLogger(Application.class);

	/**
	 *
	 * @param args arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	/**
	 * BeanInfo.
	 */
	private void beanInfo() {
		RuntimeMXBean runtimeMXBean = ManagementFactory.getRuntimeMXBean();
		log.info("BootClassPath", runtimeMXBean.getBootClassPath());
		log.info("BootLibraryPath", runtimeMXBean.getLibraryPath());
	}
}
