package activiti;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.JavaDelegate;

public class SampleJavaDelegate implements JavaDelegate {

	public void execute(DelegateExecution execution) {
		System.out.println(execution);
	}

}
