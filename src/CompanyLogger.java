import org.apache.log4j.Logger;


public class CompanyLogger implements Observer {
  Logger logger = Logger.getLogger(CompanyLogger.class);
  private String name;

  @Override
  public void update(String text) {
	System.out.printf("User [%s] received tweet: %s\n", name, text);
//	logger.info(text);
//    System.out.printf(text);
  }

  public CompanyLogger(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
}
