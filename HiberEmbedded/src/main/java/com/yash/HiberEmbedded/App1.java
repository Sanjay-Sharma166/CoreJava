package com.yash.HiberEmbedded;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.AnnotationConfiguration;


public class App1 {

    /**
     * @param args
     */
    public static void main(String[] args)
    {
    	AttributeOverrideUser user = new AttributeOverrideUser(); //creating entity type object
        //user.setUserId(1);
        user.setUserName("Sanjay Sharma");
       
        Address address = new Address(); //create an value type object of address class for home address
        address.setStreet("58");
        address.setCity("Kalptaru Vihar");
        address.setState("Ujjain");
        address.setPincode("452010");
        user.setHomeAddress(address); //setting home address
       
        Address address1 = new Address();//create another value type object for the permanent address
        address1.setStreet("14");
        address1.setCity("Modi khana road, Agar");
        address1.setState("MP");
        address1.setPincode("465441");
        user.setPermanentAddress(address1);//setting permanent address
       
        user.setDob(new Date());
        user.setPhone("7415499986");
       
        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate_config.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

		SessionFactory factory = meta.getSessionFactoryBuilder().build();
        //SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory(); //create a session factory object
        Session session = factory.openSession(); //create a session object
        session.beginTransaction(); //transaction object start
        session.save(user); //  save the entity type object user to the database
        session.getTransaction().commit(); //commit the transaction object
        session.close(); //close the session
        }
}