package com.capgemini.accountopening.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageErrorController implements ErrorController {
	 
	@RequestMapping("/error")
    public String handleError(HttpServletRequest request) {
		Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
        String errorType = "";
        
	    if (status != null) {
	        Integer statusCode = Integer.valueOf(status.toString());

	        if(statusCode == HttpStatus.UNAUTHORIZED.value()) {
	        	errorType = "error_401";
	        }else if(statusCode == HttpStatus.INTERNAL_SERVER_ERROR.value()) {
	        	errorType = "error_500";
	        }else if(statusCode == HttpStatus.NOT_FOUND.value()) {
	        	errorType = "error_404";
	        }else {
	        	errorType = "error";
	        }
	    }
        return errorType;
    }

	@Override
	public String getErrorPath() {
		return "/error";
	}
}