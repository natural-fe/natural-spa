package space.qmen.lot.entity;

import lombok.Data;

import java.sql.Date;

@Data
public class Bill {
    private Long id;
    private Integer transactionType;
    private Double billAmount;
    private Long fromAccountId;
    private String fromAccountName;
    private Long toAccountId;
    private Long toAccountName;
    private String description;
    private Date gmtCreate;
    private Date gmtModified;
    private Integer isDeleted;
}
