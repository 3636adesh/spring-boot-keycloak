#!/bin/bash

# Fetch the token
TOKEN=$(curl -s --location 'http://localhost:9090/realms/experimental/protocol/openid-connect/token' \
  --data-urlencode 'grant_type=password' \
  --data-urlencode 'client_id=spring-boot-app' \
  --data-urlencode 'username=john' \
  --data-urlencode 'password=123' | jq -r .access_token)

# Call the protected endpoint with the token
curl --location 'http://localhost:8081/admin' \
  --header "Authorization: Bearer $TOKEN"
