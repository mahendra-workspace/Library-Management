package entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="memberships")
public class Memberships {

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private String membershipId;
	

	private String planName;
	

	private String maxBooks;
	

	private String borrowDuration;
	

	private String penaltyPerDay;

	public String getMembershipId() {
		return membershipId;
	}

	public void setMembershipId(String membershipId) {
		this.membershipId = membershipId;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public String getMaxBooks() {
		return maxBooks;
	}

	public void setMaxBooks(String maxBooks) {
		this.maxBooks = maxBooks;
	}

	public String getBorrowDuration() {
		return borrowDuration;
	}

	public void setBorrowDuration(String borrowDuration) {
		this.borrowDuration = borrowDuration;
	}

	public String getPenaltyPerDay() {
		return penaltyPerDay;
	}

	public void setPenaltyPerDay(String penaltyPerDay) {
		this.penaltyPerDay = penaltyPerDay;
	}
	
	
	
}
