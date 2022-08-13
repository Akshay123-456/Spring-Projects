package com.informationasset.webservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.informationasset.controller.EmployeeController;
import com.informationasset.model.Account;
import com.informationasset.service.AccountServiceImpl;
import com.informationasset.service.BankService;

@SpringBootApplication(scanBasePackages= {"com.informationasset"})
@EnableAspectJAutoProxy(proxyTargetClass=true)
public class WebServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebServiceApplication.class, args);
//		ConfigurableApplicationContext context = SpringApplication.run(WebServiceApplication.class, args);  
//		BankService bank = context.getBean(BankService.class);  
//		AccountServiceImpl impl=context.getBean(AccountServiceImpl.class);
//		String accnumber = "12345";  
//		bank.displayBalance(accnumber);  
//		Account account;
//		try {
//			account = impl.getAccountbyCustomerId("K2434567");
//			if(account!=null)
//			{
//			System.out.println(account.getAccountName()+"\t"+account.getAccountType());			
//			}
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			System.out.println(e.getMessage());
////			e.printStackTrace();
//		}		
//		context.close();  
	}

}
