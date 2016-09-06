package Spring2practise;

import org.springframework.stereotype.Component;


@Component
public class SpringErrorLog {

	private Integer errorNumber;
	private String errortext;

	public SpringErrorLog(Integer errorNumber, String errortext) {
		super();
		this.errorNumber = errorNumber;
		this.errortext = errortext;
	}
	
	public Integer getErrorNumber() {
		return errorNumber;
	}
	
	public void setErrorNumber(Integer errorNumber) {
		this.errorNumber = errorNumber;
	}
	
	public String getErrortext() {
		return errortext;
	}
	
	public void setErrortext(String errortext) {
		this.errortext = errortext;
	}

	@Override
	public String toString() {
		return "SpringErrorLog [errorNumber=" + errorNumber + ", errortext=" + errortext + "]";
	}

	public SpringErrorLog() {
		super();
		// TODO Auto-generated constructor stub
	}


}
