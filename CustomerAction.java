package com.demo.controllers.action;

import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;

import com.demo.entities.Customer;
import com.demo.services.CustomerService;
import com.opensymphony.xwork2.ActionSupport;

@Namespace("/customer")
public class CustomerAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	@Autowired
	private CustomerService customerService;

	private String keyword;
	private List<Customer> customers;

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	
	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	@Action(value = "index", results = {
		@Result(name = SUCCESS, location = "/WEB-INF/views/customer/index.jsp")
	})
	public String index() {
		this.customers = this.customerService.findAll();
		return SUCCESS;
	}

	@Action(value = "search", results = {
		@Result(name = SUCCESS, location = "/WEB-INF/views/customer/index.jsp")
	})
	public String search() {
		this.customers = this.customerService.search(keyword);
		return SUCCESS;
	}

}
