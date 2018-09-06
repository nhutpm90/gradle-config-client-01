package com.cloudfx.cloudselect.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class TestController {

	@Value("${app.name: app name}")
	private String appName;
	
	@Value("${app.version: version}")
	private String version;
	
	@Value("${app.copyright: copyright}")
	private String copyright;
	
	@GetMapping(value = "/api/info")
	public String getInfo() {
		return appName + " - " + version + " - " + copyright;
	}
}
