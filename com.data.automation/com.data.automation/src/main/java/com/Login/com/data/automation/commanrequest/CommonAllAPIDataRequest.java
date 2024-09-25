package com.Login.com.data.automation.commanrequest;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CommonAllAPIDataRequest {

	public String company_id;
    public String request_id;
    public String ip_address;
    public String language;
    private String token_user_id;
    private Boolean is_active;
    private Integer skip;
    private Integer limit;
    private Long start_date;
    private Long end_date;
    private String sorting;
    private String search_keyword;
}
