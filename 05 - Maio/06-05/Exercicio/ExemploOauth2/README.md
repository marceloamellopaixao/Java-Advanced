curl --location --request POST 'localhost:8080/user' \
--header 'Content-Type: application/json' \
--data-raw '{
"username": "YOUR_USERNAME",
"password": "YOUR_PASSWORD"
}'


curl --location --request GET 'localhost:8080/pet' \
--header 'Content-Type: application/json' \
--header 'Authorization: Basic dGVzdGVAdGVzdGUuY29tOnRlc3Rl' \
--data-raw ''