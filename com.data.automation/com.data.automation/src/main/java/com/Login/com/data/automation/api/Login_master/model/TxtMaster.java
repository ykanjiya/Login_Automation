//package com.Login.com.data.automation.api.Login_master.model;
//
//import java.util.Map;
//
//import org.hibernate.annotations.JdbcTypeCode;
//import org.hibernate.type.SqlTypes;
//
//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.Table;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import lombok.experimental.SuperBuilder;
//
//@Getter
//@Setter
//@NoArgsConstructor
//@SuperBuilder
//@Entity
//@Table(name="txn_master")
//public class TXNMaster {
//
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.UUID)
//    @Column(name="_id")
//    private String id;
//
//    @Column(name="txn_number")
//    private String txnNumber;
//    
//    @Column(name="credit_account_type")
//    private int creditAccountType;
//    
//    @Column(name="credit_account_type_id")
//    private String creditAccountTypeId;
//    
//    @Column(name="credit_type")
//    private int creditType;
//    
//    @Column(name="credit_type_id")
//    private String creditTypeId;
//    
//    @Column(name="credit_amount")
//    private Double creditAmount;
//    
//    @Column(name="credit_currency_id")
//    private String creditCurrencyId;
//    
//    @Column(name="debit_account_type")
//    private int debitAccountType;
//    
//    @Column(name="debit_account_type_id")
//    private String debitAccountTypeId;
//    
//    @Column(name="debit_type")
//    private int debitType;
//    
//    @Column(name="debit_type_id")
//    private String debitTypeId;
//    
//    @Column(name="debit_amount")
//    private Double debitAmount;
//    
//    @Column(name="debit_currency_id")
//    private String debitCurrencyId;
//    
//    @Column(name="transaction_by")
//    @JdbcTypeCode(SqlTypes.JSON)
//    private Map<String,Object>transactionBy;
//    
//    @Column(name="txn_code")
//    private String txnCode;
//    
//    @Column(name="txn_type")
//    private int txnType;
//    
//    @Column(name="txn_date")
//    private Long txnDate;
//    
//    @Column(name="txn_status")
//    private int txnStatus;
//    
//    @Column(name="note")
//    private String note;
//    
//    @Column(name="display_text")
//    @JdbcTypeCode(SqlTypes.JSON)
//    private Map<String,Object>  displayText;
//    
//    @Column(name="payment_mode")
//    private int paymentMode;
//
//    @Column(name="txn_amount")
//    private Double txnAmount;
//    
//    @Column(name="debit_account_balance")
//    private Double debitAccountBalance;
//    
//    @Column(name="credit_account_balance")
//    private Double creditAccountBalance;
//    
//    @Column(name="display_end_user")
//    private Boolean displayEndUser;
//    
//    @Column(name="meta_data")
//    @JdbcTypeCode(SqlTypes.JSON)
//    private  Map<String,Object>  metaData;
//   
//    
//}


package com.Login.com.data.automation.api.Login_master.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "txt_master")
public class TxtMaster {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "application_name")
    private String applicationName;

    @Column(name = "ip_or_hostname")
    private String ipOrHostname;

    @Column(name = "username")
    private String username;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    public String getIpOrHostname() {
        return ipOrHostname;
    }

    public void setIpOrHostname(String ipOrHostname) {
        this.ipOrHostname = ipOrHostname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
