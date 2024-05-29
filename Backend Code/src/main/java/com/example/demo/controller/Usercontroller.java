package com.example.demo.controller;

import java.io.IOException;
import java.sql.Date;
import java.time.LocalTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;   
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.entity.Inbox;
import com.example.demo.entity.Profile;
import com.example.demo.entity.Property;
import com.example.demo.entity.PropertyDetails;
import com.example.demo.entity.PropertyMaintenance;
import com.example.demo.entity.PropertyPurcahse;
import com.example.demo.entity.RentalProperty;
import com.example.demo.entity.Rentcollection;
import com.example.demo.entity.Tentant;
import com.example.demo.entity.User;
import com.example.demo.repository.InboxRepository;
import com.example.demo.repository.ProfileRepository;
import com.example.demo.repository.PropertyDetailsRepository;
import com.example.demo.repository.PropertyMaintenanceRepository;
import com.example.demo.repository.PropertyRepository;
import com.example.demo.repository.PurchaseeRepository;
import com.example.demo.repository.RentCollectionRepository;
import com.example.demo.repository.RentalRepository;
import com.example.demo.repository.UserRepository;

import com.example.demo.repository.tentantRepository;
import com.example.demo.service.TenantService;
import com.example.demo.service.Userservice;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins="*")

 
public class Usercontroller {
	
	@Autowired
	private Userservice userservice;
	
	@PostMapping("/register")
	public User Register(@RequestBody User user) {
		return userservice.register(user);
	}
//	@PostMapping("/register")
//    public ResponseEntity<String> registerUser(@RequestBody User user) {
//        try {
//            userservice.registerUser(user);
//            return ResponseEntity.status(HttpStatus.CREATED).body("User registered successfully");
//        } catch (Exception e) {
//            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Registration failed");
//        }
//    }
	@PostMapping("/login")
	public User login(@RequestBody User user)
	{
		return userservice.login(user);
	}
	
//	 @PostMapping("/login")
//	    public ResponseEntity<Object> loginUser(@RequestBody User user) {
//	        try {
//	            User loggedInUser = userservice.loginUser(user.getEmail(), user.getPassword());
//
//	            if (loggedInUser != null) {
//	                // You can return additional user data or a JWT token for authentication
//	                return ResponseEntity.status(HttpStatus.OK).body(loggedInUser);
//	            } else {
//	                return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
//	            }
//	        } catch (Exception e) {
//	            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Login failed");
//	        }
//	    }
//	}
//	@PostMapping("/login")
//	  public ResponseEntity<String> loginUser(@RequestBody User user) {
//	    // Implement login logic to verify credentials and return success/failure
//	    User use = UserRepository.findByEmailAndPassword(user.getEmail(), user.getPassword());
//	    if (user != null) {
//	      return ResponseEntity.ok("Login successful");
//	    } else {
//	      return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Login failed");
//	    }
//	  }
//	
	@Autowired
	private ProfileRepository profilerepository;
	
 	
	@PostMapping("/profile")
	
	public Profile createProfile(@RequestBody Profile profile)
	{
		return profilerepository.save(profile);
	}
	
	@Autowired
	private PropertyRepository propertyrepository;

	@PostMapping("/property")
	
		public PropertyDetails createPropertyDetails(@RequestBody PropertyDetails propertydetails) {
		return propertyrepository.save(propertydetails);
	}
	//fetching based on location
	@GetMapping("/location/{location}")
    public List<PropertyDetails> getPropertyDetailsByLocation(@PathVariable String location) {
        return propertyrepository.findByLocation(location);
    }
	// updating based on id
	@PutMapping("/property/{id}")
    public ResponseEntity<String> updatePropertyDetailsById(
        @PathVariable Long id,
        @RequestBody PropertyDetails updatedPropertyDetails
    ) {
        // Check if the property with the given ID exists
        if (!propertyrepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }

        // Set the ID of the updatedPropertyDetails to the given ID
        updatedPropertyDetails.setId(id);

        // Save the updated property details
        PropertyDetails savedPropertyDetails = propertyrepository.save(updatedPropertyDetails);

        if (savedPropertyDetails != null) {
            return ResponseEntity.ok("Record updated successfully.");
        } else {
            return ResponseEntity.badRequest().body("Failed to update the record.");
        }
    }
	//deleting the record based on id
	 @DeleteMapping("/property/{id}")
	    public ResponseEntity<String> deletePropertyById(@PathVariable Long id) {
	        // Check if the property with the given ID exists
	        if (!propertyrepository.existsById(id)) {
	            return ResponseEntity.notFound().build();
	        }

	        // Delete the property with the given ID
	        propertyrepository.deleteById(id);

	        return ResponseEntity.ok("Record deleted successfully.");
	    }
	@Autowired
	private PropertyMaintenanceRepository propertymaintenancerepository;
	
	 
	@PostMapping("/propertymaintenance")
	
		public PropertyMaintenance createPropertyMaintenance(@RequestBody PropertyMaintenance propertymaintenance ) {
			return propertymaintenancerepository.save(propertymaintenance);
		}
	
	@Autowired
	private tentantRepository tentantrepository;

	//imagee uploaded
	 @PostMapping("/tentantmanagement")
	    public ResponseEntity<String> uploadImage( @RequestParam("file") MultipartFile file,
	            @RequestParam("contact") String contact,
	            @RequestParam("leaseStart_date") Date leaseStart_date,
	            @RequestParam("leaseEnd_date") Date leaseEnd_date,
	            @RequestParam("security_Deposit") String security_Deposit,
	            @RequestParam("paymentDate") Date paymentDate, 
	            @RequestParam("amount") String amount,
	            @RequestParam("paymentStatus") String paymentStatus
	            ) throws IOException {
	        Tentant image = new Tentant();


	        image.setContact(contact);
	        image.setLeaseStart_date(leaseStart_date);
	        image.setLeaseEnd_date(leaseEnd_date);
	        image.setSecurity_Deposit(security_Deposit);
	        image.setPaymentDate(paymentDate);
	        image.setPaymentStatus(paymentStatus);
	        image.setAmount(amount);
	        image.setTenatant_picture(file.getBytes());
            image.setUploadlease_agreement(file.getBytes());
	        tentantrepository.save(image);

	        return ResponseEntity.ok("Image uploaded successfully");
	    }
	private final tentantRepository tentantRepository; // Inject this repository

    // Constructor injection
    public Usercontroller(tentantRepository tentantRepository) {
        this.tentantRepository = tentantRepository;
    }

    

    
    
    @Autowired
    private PurchaseeRepository purchaserepository;
    @PostMapping("/PurchaseProcessManagement")
    public ResponseEntity<String> uploadImagee( @RequestParam("file") MultipartFile file,
            @RequestParam("buyer_Name") String buyer_Name,
            @RequestParam("buyer_Contact") String buyer_Contact,
            @RequestParam("property_type") String property_type,
            @RequestParam("property_size") String property_size,
            @RequestParam("purchase_Date") Date purchase_Date, 
            @RequestParam("property_Address") String property_Address,
            @RequestParam("down_Payment") String down_Payment,
            @RequestParam("loan_option") String loan_option,
            @RequestParam("purcahse_Price") String purcahse_Price,
            @RequestParam("share_Notes") String share_Notes,
            @RequestParam("time") LocalTime time
            )throws IOException {
   
    	PropertyPurcahse p=new PropertyPurcahse();
    	p.setBuyer_Name(buyer_Name);
    	p.setBuyer_Contact(buyer_Contact);
    	p.setProperty_type(property_type);
    	p.setProperty_size(property_size);
    	p.setPurchase_Date(purchase_Date);
    	p.setProperty_Address(property_Address);
    	p.setProperty_Address(property_Address);
    	p.setDown_Payment(down_Payment);
    	p.setLoan_option(loan_option);
    	p.setPurcahse_Price(purcahse_Price);
    	p.setShare_Notes(share_Notes);
    	p.setTime(time);
    	 p.setPurchase_agrement(file.getBytes());
    	 purchaserepository.save(p);
    	   return ResponseEntity.ok("Purchase Property Successfully");
    }
    
    @Autowired
    private RentalRepository rentalrepository;
    
//    @PostMapping("/propertymaintenance")
//	
//	public PropertyMaintenance createPropertyMaintenance(@RequestBody PropertyMaintenance propertymaintenance ) {
//		return propertymaintenancerepository.save(propertymaintenance);
//	}
    @RequestMapping("Rentalmanagement")
    public RentalProperty createRentalProperty(@RequestBody RentalProperty rentalproperty ) {
    	return rentalrepository.save(rentalproperty);
    }
    @GetMapping("/getPropertyPurchaseById/{id}")
    public ResponseEntity<PropertyPurcahse> getPropertyPurchaseById(@PathVariable long id) {
        PropertyPurcahse propertyPurcahse = purchaserepository.findById(id);
        if (propertyPurcahse != null) {
            return ResponseEntity.ok(propertyPurcahse);
        } else {
            return ResponseEntity.notFound().build();
        }

	
} 
    @Autowired
    private PropertyDetailsRepository propertydetailrepository;
    
    @RequestMapping("PropertyDetail")
    public Property createProperty(@RequestBody Property property) {
    return propertydetailrepository.save( property);
    
}
    @Autowired
    private InboxRepository inboxrepository;
    
    @RequestMapping("Inboxsentmessage")
    public  ResponseEntity<String> InboxSent( @RequestParam("file") MultipartFile file,
    		 @RequestParam("sender_Date") Date sender_Date,
    		 @RequestParam("recipt_Date") Date recipt_Date,
    		 @RequestParam("inboxSent_message") String inboxSent_message
    		 )throws IOException {
    	Inbox a=new Inbox();
    	a.setInboxSent_message(inboxSent_message);
    	a.setSender_Date(sender_Date);
    	a.setRecipt_Date(recipt_Date);
    	a.setAttachFile(file.getBytes());
    	inboxrepository.save(a);
    	return ResponseEntity.ok("Sent Message");
    	
    }
    @Autowired
    private RentCollectionRepository Rentcollectionrepository;
    @PostMapping("RentCollection")
    public  ResponseEntity<String> RentCollection( @RequestParam("file") MultipartFile file,
    		@RequestParam("property_Type") String property_Type,
   		 @RequestParam("location") String location,
   		 @RequestParam("floor") String floor,
   		 @RequestParam("rentAmount") int rentAmount,
   		 @RequestParam("payAmount_Date") Date payAmount_Date,
   		 @RequestParam("time") LocalTime time,
   		 
   		 @RequestParam("paymentType") String paymentType
    		)throws IOException {
    	Rentcollection r=new Rentcollection();
    	r.setProperty_Type(property_Type);
    	r.setLocation(location);
    	r.setFloor(floor);
    	r.setRentAmount(rentAmount);
    	r.setPayAmount_Date(payAmount_Date);
    	r.setTime(time);
    	r.setPaymentType(paymentType);
    	r.setRelavent_paymentDetail(file.getBytes());
    	 Rentcollectionrepository.save(r);
    	 return  ResponseEntity.ok("Rent Amount Successfull");
    }
   

    }
