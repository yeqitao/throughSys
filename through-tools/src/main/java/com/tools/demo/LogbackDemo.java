package com.tools.demo;


import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LogbackDemo {

	public static void main(String[] args) {
		log.trace("Spring boot启动初始化了 {} 个 Bean", 1);
		log.debug("Spring boot启动初始化了 {} 个 Bean", 2);
		log.info("Spring boot启动初始化了 {} 个 Bean", 3);
		log.warn("Spring boot启动初始化了 {} 个 Bean", 4);
		log.error("Spring boot启动初始化了 {} 个 Bean", 5);
		try {
			int i = 0;
			int j = 1 / i;
		} catch (Exception e) {
			log.error("【SpringBootDemoLogbackApplication】启动异常：", e);
		}
	}

}
