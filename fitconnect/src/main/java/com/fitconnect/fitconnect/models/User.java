// User.java
package com.fitconnect.fitconnect.models;

@Document(collection = "users")
public class User {
    @Id
    private String id;
    @SuppressWarnings("unused")
    private String username;
    // other fields, constructors, getters, setters
}
