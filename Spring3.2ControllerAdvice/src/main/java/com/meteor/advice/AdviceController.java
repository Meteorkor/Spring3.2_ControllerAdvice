package com.meteor.advice;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class AdviceController {

	
	
	@ExceptionHandler
	public ModelAndView exception(Exception e,  WebRequest request ){
		
		System.out.println( "e.toString() : " + e.getMessage() );
		
		ModelAndView modelAndView = new ModelAndView("except");
		modelAndView.addObject("errorMsg", e.toString());
		
		return modelAndView;
	}
	
}
