package com.adobe.aem.guides.sam.core.schedulers;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.AttributeType;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition(name="surgeproject",
description="my first code")

public @interface OsgiConfiguration {
@AttributeDefinition(
		name="sanju project",
		description="this one project",
type=AttributeType.STRING)
public String sanjuproject() default"practice";

@AttributeDefinition(
		name="cron Expression",
		description="this one project",
type=AttributeType.STRING)
public String cronExpression () default"0 0/1 * 1/1 * ? *";


}
