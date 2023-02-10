package com.safetravels.mvc.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import javax.validation.constraints.*;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="travels")
public class Travel {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
		@Size(min=3, message="Name required.")
		private String name;
		
		@NotEmpty(message="Description required.")
		private String description;
		
		@NotEmpty(message="Vendor required.")
		private String vendor;
		
		@NotNull(message="Price required.")
		private Float price;
		
		@Column(updatable=false)
		@DateTimeFormat(pattern="yyyy-MM-dd")
		private Date created_at;
		
		@DateTimeFormat(pattern="yyyy-MM-dd")
		private Date updated_at;

		public Travel() {
			
		}
		
		public Travel(Long id,@NotEmpty(message = "Vendor required.") String vendor,
				@NotNull(message = "Price required.") Float price, 
				@NotEmpty(message = "Name required.") String name, 
				@NotEmpty(message = "Description required.") String description) {
			this.id = id;
			this.name = name;
			this.description = description;
			this.vendor = vendor;
			this.price = price;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getVendor() {
			return vendor;
		}

		public void setVendor(String vendor) {
			this.vendor = vendor;
		}

		public Float getPrice() {
			return price;
		}

		public void setPrice(Float price) {
			this.price = price;
		}

		public Date getCreated_at() {
			return created_at;
		}

		public void setCreated_at(Date created_at) {
			this.created_at = created_at;
		}

		public Date getUpdated_at() {
			return updated_at;
		}

		public void setUpdated_at(Date updated_at) {
			this.updated_at = updated_at;
		}

		@PrePersist
		protected void onCreate() {
			this.created_at = new Date();
		}
		@PreUpdate
		protected void onUpdate() {
			this.updated_at = new Date();
		}

		

}
