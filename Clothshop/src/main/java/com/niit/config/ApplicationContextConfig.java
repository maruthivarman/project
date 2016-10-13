package com.niit.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.niit.model.Cardpayment;
import com.niit.model.Cart;
import com.niit.model.Category;
import com.niit.model.Codpayment;
import com.niit.model.Product;
import com.niit.model.Role;
import com.niit.model.Shippingdetails;
import com.niit.model.Supplier;
import com.niit.model.User;
import com.niit.service.CardpaymentDAOImpl;
import com.niit.service.CartDAOImpl;
import com.niit.service.CategoryDAOImpl;
import com.niit.service.CodpaymentDAOImpl;
import com.niit.service.RoleDAOImpl;
import com.niit.service.ShippingdetailsDAOImpl;
import com.niit.service.SupplierDAOImpl;
import com.niit.service.UserDAOImpl;

@Configuration
@ComponentScan("com.niit.*")
@EnableTransactionManagement
public class ApplicationContextConfig {
	
    @Autowired
    @Bean(name = "datasource")
    public DataSource getH2DataSource(){
    	DriverManagerDataSource dataSource=new DriverManagerDataSource();
    	dataSource.setDriverClassName("org.h2.Driver");
    	dataSource.setUrl("jdbc:h2:tcp://localhost/~/clothshop");
    	       dataSource.setUsername("sa");
    	       dataSource.setPassword("");
		       return dataSource;
    }
    private Properties getHibernateProperties() {
    	Properties properties=new Properties();
    	properties.put("hibernate.show_sql", "true");
    	properties.put("hibernate.hbm2ddl.auto","update");
    	properties.put("hibernate.dialect","org.hibernate.dialect.H2Dialect");
    	properties.put("hibernate.format_sql","true");
    	
		return properties;	
    }
  @Autowired
   @Bean(name = "sessionFactory")
  public SessionFactory getSessionFactory(DataSource datasource)
  {
	LocalSessionFactoryBuilder sessionBuilder = new LocalSessionFactoryBuilder(datasource);
	  sessionBuilder.addProperties(getHibernateProperties());
	  sessionBuilder.addAnnotatedClass(User.class);
	  sessionBuilder.addAnnotatedClass(Role.class);
	  sessionBuilder.addAnnotatedClass(Category.class);
	  sessionBuilder.addAnnotatedClass(Product.class);
	  sessionBuilder.addAnnotatedClass(Cart.class);
	  sessionBuilder.addAnnotatedClass(Supplier.class);
	  sessionBuilder.addAnnotatedClass(Shippingdetails.class);
	  sessionBuilder.addAnnotatedClass(Cardpayment.class);
	  sessionBuilder.addAnnotatedClass(Codpayment.class);
	  return sessionBuilder.buildSessionFactory();	  
  } 
  @Autowired
  @Bean(name = "transationManager")
  public HibernateTransactionManager getTransactionManager(SessionFactory sessionfactory)
  {
	  HibernateTransactionManager transactionManager = new HibernateTransactionManager(sessionfactory);
	return transactionManager; 
  }
  @Autowired(required=true)
  @Bean(name = "userDAO")
  public UserDAOImpl getUserDAO(SessionFactory sessionFactory)
  {
   return new UserDAOImpl(sessionFactory);
  }
 
  
  @Autowired(required=true)
  @Bean(name = "categoryDAO")
  public CategoryDAOImpl getCategoryDAO(SessionFactory sessionFactory)
  {
   return new CategoryDAOImpl(sessionFactory);
  }
  
  @Autowired(required=true)
  @Bean(name = "shippingdetailsDAO")
  public ShippingdetailsDAOImpl getShippingdetailsDAO(SessionFactory sessionFactory)
  {
   return new ShippingdetailsDAOImpl(sessionFactory);
  }

  @Autowired(required=true)
  @Bean(name = "supplierDAO")
  public SupplierDAOImpl getSupplierDAO(SessionFactory sessionFactory)
  {
   return new SupplierDAOImpl(sessionFactory);
  }
  

  @Autowired(required=true)
  @Bean(name = "cartDAO")
  public CartDAOImpl getCartDAO(SessionFactory sessionFactory)
  {
   return new CartDAOImpl(sessionFactory);
  }
  
  @Autowired(required=true)
  @Bean(name = "cardpaymentDAO")
  public CardpaymentDAOImpl getCardpaymentDAO(SessionFactory sessionFactory)
  {
   return new CardpaymentDAOImpl(sessionFactory);
  }
  
  @Autowired(required=true)
  @Bean(name = "codpaymentDAO")
  public CodpaymentDAOImpl getCodpaymentDAO(SessionFactory sessionFactory)
  {
   return new CodpaymentDAOImpl(sessionFactory);
  }
  
  @Autowired(required=true)
  @Bean(name = "roleDAO")
  public RoleDAOImpl getRoleDAO(SessionFactory sessionFactory)
  {
   return new RoleDAOImpl(sessionFactory);
  }
  }
