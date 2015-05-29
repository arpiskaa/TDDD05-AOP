import org.aspectj.lang.JoinPoint;



public class LoggingAspect {
	public void beforeMethodAdvice(JoinPoint joinPoint){
		Logger.entry(joinPoint.getSignature().toString());
	}

	public void afterMethodAdvice(JoinPoint joinPoint){
		Logger.exit(joinPoint.getSignature().toString());
	}
}
