package com.chen;



@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class // 关闭mybatis的自动配置
		, MybatisAutoConfiguration.class })
public class Application extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(Application.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
