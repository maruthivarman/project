package com.niit.cart;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.model.Cardpayment;
import com.niit.model.Cart;
import com.niit.model.Category;
import com.niit.model.Codpayment;
import com.niit.model.Product;
import com.niit.model.Role;
import com.niit.model.Shippingdetails;
import com.niit.model.Supplier;
import com.niit.model.User;
import com.niit.service.CardpaymentDAO;
import com.niit.service.CartDAO;
import com.niit.service.CategoryDAO;
import com.niit.service.CodpaymentDAO;
import com.niit.service.ProductDAO;
import com.niit.service.RoleDAO;
import com.niit.service.ShippingdetailsDAO;
import com.niit.service.SupplierDAO;
import com.niit.service.UserDAO;

public class UserTest {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		System.out.println("system.....");
		
			
		UserDAO userDAO=(UserDAO) context.getBean("UserDAO");
		User user=(User) context.getBean("user");
		
		RoleDAO roleDAO=(RoleDAO) context.getBean("RoleDAO");
		Role role=(Role) context.getBean("role");
		
		
		/*CategoryDAO categoryDAO=(CategoryDAO) context.getBean("CategoryDAO");	
		Category category=(Category) context.getBean("category");
		
		ProductDAO productDAO=(ProductDAO) context.getBean("ProductDAO");	
		Product product=(Product) context.getBean("product");
		
		ShippingdetailsDAO shippingdetailsDAO=(ShippingdetailsDAO) context.getBean("ShippingdetailsDAO");	
		Shippingdetails shippingdetails=(Shippingdetails) context.getBean("shippingdetails");
		
		SupplierDAO supplierDAO=(SupplierDAO) context.getBean("SupplierDAO");	
		Supplier supplier=(Supplier) context.getBean("supplier");
		
		CartDAO cartDAO=(CartDAO) context.getBean("CartDAO");	
		Cart cart=(Cart) context.getBean("cart");
		
        CardpaymentDAO cardpaymentDAO=(CardpaymentDAO) context.getBean("CardpaymentDAO");	
        Cardpayment cardpayment=(Cardpayment) context.getBean("cardpayment");
        
        CodpaymentDAO codpaymentDAO=(CodpaymentDAO) context.getBean("CodpaymentDAO");	
        Codpayment codpayment=(Codpayment) context.getBean("codpayment");
		*/
		user.setUsername("Ponmuthu");
		user.setPassword("muthu");
		user.setAddress("123,asdf");
		user.setEmailid("ponmuthu@gmail.com");
		user.setGender("male");
		user.setMobile_number(99999999);
		
		role.setRoleid(1);
		role.setRole("user");
		role.setPassword("maruthi");
		role.setEnabled("true");
		
		user.setRole(role);
		role.setUser(user);
		userDAO.insertUser(user);
		userDAO.deleteUser(1);
		
		//roleDAO.insertRole(role);
		//roleDAO.deleteRole(1);
		
		
		/*category.setCategoryname("Men");
		category.setDescription("Tshirt,shirts");
		
		categoryDAO.insertCategory(category);
	
		
		product.setProductname("T-shirt");
		product.setDescription("cotton");
		product.setSize("m");
		product.setColor("red");
		product.setCategoryid(1);
		product.setSupplierid(1);
		product.setPrice(1000);
		
		productDAO.insertProduct(product);
		
	    
		shippingdetails.setProductid(1);
		shippingdetails.setDeliverydate(23);
		shippingdetails.setAddress("123,abc");
		shippingdetails.setStatus("item packed");
		shippingdetails.setAmount(1000);
		
		shippingdetailsDAO.insertShippingdetails(shippingdetails);
		
		supplier.setSuppliername("John karter");
		supplier.setCompanyname("puma");
		supplier.setEmailid("puma@gmail.com");
		supplier.setMobilenumber(765675);
		supplier.setAddress("123,abc");
		
		supplierDAO.insertSupplier(supplier);
		
		cart.setProductid(1);
		cart.setQuantity(4);
		cart.setPrice(1000);
		
		cartDAO.insertCart(cart);
		
		cardpayment.setCardholdername("maruthi");
		cardpayment.setCardnumber(23124233);
		cardpayment.setCardtype("debit card");
		cardpayment.setCvvnumber(555);
		cardpayment.setExpirydate(27);
		
		cardpaymentDAO.insertCardpayment(cardpayment);
		
		codpayment.setCodpaymentid(1);
		codpayment.setAddress("12,abc");
		codpayment.setMobilenumber(32345342);
		codpayment.setAmount(1000);
		
		codpaymentDAO.insertCodpayment(codpayment);*/
	}

}
