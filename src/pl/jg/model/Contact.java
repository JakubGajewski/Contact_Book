package pl.jg.model;

public class Contact {
	String firstName;
	String lastName;
	String email;
	Integer landlinePhone;
	Integer mobilePhone;
	String company;
	String department;
	String address;
	
	private String getFirstName() {
		return firstName;
	}
	private void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	private String getLastName() {
		return lastName;
	}
	private void setLastName(String lastName) {
		this.lastName = lastName;
	}
	private String getEmail() {
		return email;
	}
	private void setEmail(String email) {
		this.email = email;
	}
	private Integer getLandlinePhone() {
		return landlinePhone;
	}
	private void setLandlinePhone(Integer landlinePhone) {
		this.landlinePhone = landlinePhone;
	}
	private Integer getMobilePhone() {
		return mobilePhone;
	}
	private void setMobilePhone(Integer mobilePhone) {
		this.mobilePhone = mobilePhone;
	}
	private String getCompany() {
		return company;
	}
	private void setCompany(String company) {
		this.company = company;
	}
	private String getDepartment() {
		return department;
	}
	private void setDepartment(String department) {
		this.department = department;
	}
	private String getAddress() {
		return address;
	}
	private void setAddress(String address) {
		this.address = address;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		result = prime * result + ((department == null) ? 0 : department.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((landlinePhone == null) ? 0 : landlinePhone.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((mobilePhone == null) ? 0 : mobilePhone.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contact other = (Contact) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (department == null) {
			if (other.department != null)
				return false;
		} else if (!department.equals(other.department))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (landlinePhone == null) {
			if (other.landlinePhone != null)
				return false;
		} else if (!landlinePhone.equals(other.landlinePhone))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (mobilePhone == null) {
			if (other.mobilePhone != null)
				return false;
		} else if (!mobilePhone.equals(other.mobilePhone))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Contact [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", landlinePhone="
				+ landlinePhone + ", mobilePhone=" + mobilePhone + ", company=" + company + ", department=" + department
				+ ", address=" + address + "]";
	}
	
	
	
	
}
