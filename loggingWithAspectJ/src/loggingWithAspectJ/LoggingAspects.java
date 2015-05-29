package loggingWithAspectJ;

	
public aspect LoggingAspects { 
	pointcut publicMethods(): execution(public * *..*(..)); 
	pointcut logObjectCalls(): execution(* Logger.*(..)); 
	pointcut loggableCalls(): publicMethods() && (!logObjectCalls()); 
	before(): loggableCalls() { 
		Logger.entry(thisJoinPoint.getSignature().toString()); 
	} 
	after(): loggableCalls() { 
		Logger.exit(thisJoinPoint.getSignature().toString()); 
	} 
} 

