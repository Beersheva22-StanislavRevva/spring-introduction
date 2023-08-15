package telran.spring.model;

import com.fasterxml.jackson.annotation.JsonTypeInfo;

import jakarta.validation.constraints.*;

import lombok.Data;

@Data
@JsonTypeInfo(use = JsonTypeInfo.Id.DEDUCTION)
//@JsonSubTypes(value =  {@JsonSubTypes.Type(value = EmailMessage.class),@JsonSubTypes.Type(value = SmsMessage.class) })
public class Message {
@NotEmpty @Pattern(regexp = "[a-z]{3,5}", message = "message mismatches pattern")
public String type;
@NotEmpty
public String text;
}

