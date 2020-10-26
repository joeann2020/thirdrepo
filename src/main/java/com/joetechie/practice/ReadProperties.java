package com.joetechie.practice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Configuration
public class ReadProperties {

	@Value("${application.name}")
	public String applicationName;

	
	@Value("${server.port}")
	public String serverPort;
	
	public String getMyApplicationName() {
		return applicationName;
	}
}
