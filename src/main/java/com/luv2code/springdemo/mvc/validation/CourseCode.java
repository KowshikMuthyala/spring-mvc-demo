package com.luv2code.springdemo.mvc.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = CourseCodeConstraintValidator.class)
@Target({ElementType.METHOD,ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {
	
	//Define default course code
	public String value() default "LUV";
	
	//Define default error message
	public String message() default "must starts with LUV";
	
	//Define default Groups
	public Class <?> [] groups() default {};
	
	//Define default Payload
	
	public Class <? extends Payload>[] payload() default {};

}
