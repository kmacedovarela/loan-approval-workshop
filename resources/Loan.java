package com.myspace.loan_approval;

/**
 * This class was automatically generated by the data modeler tool.
 * package com.myspace.loan_approval;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Loan implements java.io.Serializable {

 
	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "Amount")
	private java.lang.Double amount;
	@org.kie.api.definition.type.Label(value = "Duration")
	private java.lang.Integer duration;
	@org.kie.api.definition.type.Label(value = "Interest Rate")
	private java.lang.Double interestRate;
	@org.kie.api.definition.type.Label(value = "Monthly Repayment")
	private java.lang.Double monthlyRepayment;
	@org.kie.api.definition.type.Label(value = "Age PreQualification")
	private boolean agePreQual;
	@org.kie.api.definition.type.Label(value = "Loan PreQualification")
	private boolean loanPreQualification;
	@org.kie.api.definition.type.Label(value = "Comment")
	private java.lang.String comment;

	public Loan() {
	}

	public java.lang.Double getAmount() {
		return this.amount;
	}

	public void setAmount(java.lang.Double amount) {
		this.amount = amount;
	}

	public java.lang.Integer getDuration() {
		return this.duration;
	}

	public void setDuration(java.lang.Integer duration) {
		this.duration = duration;
	}

	public java.lang.Double getInterestRate() {
		return this.interestRate;
	}

	public void setInterestRate(java.lang.Double interestRate) {
		this.interestRate = interestRate;
	}

	public java.lang.Double getMonthlyRepayment() {
		return this.monthlyRepayment;
	}

	public void setMonthlyRepayment(java.lang.Double monthlyRepayment) {
		this.monthlyRepayment = monthlyRepayment;
	}

	public boolean isAgePreQual() {
		return this.agePreQual;
	}

	public void setAgePreQual(boolean agePreQual) {
		this.agePreQual = agePreQual;
	}

	public boolean isLoanPreQualification() {
		return this.loanPreQualification;
	}

	public void setLoanPreQualification(boolean loanPreQualification) {
		this.loanPreQualification = loanPreQualification;
	}

	public java.lang.String getComment() {
		return this.comment;
	}

	public void setComment(java.lang.String comment) {
		this.comment = comment;
	}

	public Loan(java.lang.Double amount, java.lang.Integer duration,
			java.lang.Double interestRate, java.lang.Double monthlyRepayment,
			boolean agePreQual, boolean loanPreQualification,
			java.lang.String comment) {
		this.amount = amount;
		this.duration = duration;
		this.interestRate = interestRate;
		this.monthlyRepayment = monthlyRepayment;
		this.agePreQual = agePreQual;
		this.loanPreQualification = loanPreQualification;
		this.comment = comment;
	}


}