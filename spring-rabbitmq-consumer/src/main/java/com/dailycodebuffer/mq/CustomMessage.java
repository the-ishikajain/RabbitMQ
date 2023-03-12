package com.dailycodebuffer.mq;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.Setter;
import java.util.Date;
import lombok.Getter;
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Setter
@Getter
public class CustomMessage {

    private String messageId;
    private String message;
    private Date messageDate;
	// TODO Auto-generated method stub
			public void setMessageId(String h) {
	this.messageId=h;
		
	}
		
			public void setMessageDate(Date date) {
				// TODO Auto-generated method stub
				this.messageDate=date;
			}

}