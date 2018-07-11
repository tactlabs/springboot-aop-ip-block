package com.gmm.base.rest;
/*
 * Author: Muthu Mariyappan
 * Date : 05.07.2018
 * Aspect class - using this we can block even the public methods of target class
 * In this project I restricted the access to setter methods of RestrictApiController
 * */


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
class RestrictApiAspect {
		// can restrict getter methods by changing set to get
		@Around("(execution(* RestrictApiController.set*(..)))") // restricts setter methods by never letting them execute
		public void blockAPI(ProceedingJoinPoint pjp){
			System.out.println("\n\nRestricted access to Setter methods!. You cannot modify any values!");
		}
}