package com.learning.invoicesTask.models;

@lombok.Getter
@lombok.AllArgsConstructor
public class Client {
    private String firstName;
    private String lastName;
    private String personalIdentification;

    @Override
    public String toString(){
        return "****************************************************************" + "\n" +
                "[Client First Name]: " + firstName + "\n" +
                "[Client Last Name]:" + lastName + "\n" +
                "[Client Identification]:" + personalIdentification + "\n" +
                "****************************************************************" + "\n";
    }
}
