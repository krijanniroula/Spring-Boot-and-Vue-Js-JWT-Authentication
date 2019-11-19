package com.npksahakari.system.models.loan;

import com.npksahakari.system.enumconstants.LoanType;
import com.npksahakari.system.enumconstants.Status;
import com.npksahakari.system.models.BaseEntity;
import com.npksahakari.system.models.ShareMember;

import javax.persistence.*;


@Entity
@Table(name = "loan_account",uniqueConstraints = {
        @UniqueConstraint(columnNames = "loanAccountNumber")
}
)
//@EntityListeners(AuditingEntityListener.class)
//@JsonIgnoreProperties(allowGetters = true)
public class LoanAccount extends BaseEntity {

    @ManyToOne(optional = false)
    private ShareMember shareNo;
    @Column(name = "loan_account_number")
    private String loanAccountNumber;
    @Column(name = "loan_type")
    private LoanType loanType;

    @Column(name = "amount")
    private Double amount;

    private Status status;





}
