# Keycloak Integration with Spring Boot 3

- This project demonstrates how to secure a Spring Boot application using Keycloak, a powerful open-source Identity and Access Management tool.
- Keycloak is an open-source software product to allow single sign-on with identity and access management aimed

## Features

- Single Sign-On (SSO) with OpenID Connect
- Role-Based Access Control (RBAC)
- Fine-Grained Authorization
- User Federation
- Identity Brokering
- Social Login
- Centralized Management and Admin console
- Client adapters for Java, JavaScript, and other languages


### Keycloak Setup

1. Run the docker-compose file:
    ```bash
    docker-compose up -d
    ```
2. Navigate to [Keycloak Admin UI Console](http://localhost:9090 "Keycloak Admin UI Console")
3. Create a new Real and name ut ```john``` or update the ```application.yml``` file and specify your Realm name
4. Create Roles
5. Create Users
6. Assign roles to users



### Keycloak Terms

- Realm: A realm in Keycloak is a space where you can manage a set of users, applications, and roles. Each realm is isolated from others.
- Client: A client in Keycloak represents an application or service that can authenticate users. It can be a web application, mobile app, or any other service.
- User: A user is an individual who can log in to the application. Users can have roles assigned to them, which determine their permissions.
- Role: A role is a set of permissions that can be assigned to users. Roles can be used to control access to different parts of the application.
- Group: A group is a collection of users. Groups can be used to manage users more easily by assigning roles and permissions to the group as a whole.
- Client Scopes: Client scopes are a way to define a set of attributes that can be included in the access token or ID token. They can be used to control what information is shared with the client.
- Identity Provider: An identity provider is an external service that can be used to authenticate users. Keycloak can integrate with various identity providers, such as Google, Facebook, and LDAP.
- Identity Brokering: Identity brokering is a feature that allows Keycloak to act as a broker between an external identity provider and the application. This allows users to log in using their existing accounts from other services.
- User Federation: User federation is a feature that allows Keycloak to connect to external user databases, such as LDAP or Active Directory. This allows users to log in using their existing credentials from those systems.