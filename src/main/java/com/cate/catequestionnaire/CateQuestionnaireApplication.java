package com.cate.catequestionnaire;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.cate.catequestionnaire.config.ConfigBean;

@SpringBootApplication
@EnableConfigurationProperties({ConfigBean.class})
public class CateQuestionnaireApplication {

	public static void main(String[] args) {
		SpringApplication.run(CateQuestionnaireApplication.class, args);
	}

}
