package models;

import javax.persistence.Entity;
import javax.persistence.Id;

import play.data.validation.Constraints;


	
	@Entity 
	public class Pedidos extends com.avaje.ebean.Model {

	    private static final long serialVersionUID = 1L;

		@Id
	    public Long id;
	    
	    @Constraints.Required
	public String name;
	    	
	public long cantidad;
    public long precio;
	

}
