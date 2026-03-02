1. TO RUN USE THIS COMMAND :

.\mvnw.cmd spring-boot:run

2. TO CLEAN BUILD USE THIS COMMAND :
.\mvnw.cmd spring-boot:run

HAPPY CODING!

DOCUMENTATION

FOR FULL USING THE REQUEST AND RESPONSE CALLBACK CHECK THIS POSTMAN COLLECTION :

https://www.postman.com/smartgrapetester/workspace/smartgrapetester-workspace/request/45463665-8bae4751-266a-415c-baea-6c265f0fc4db?action=share&creator=45463665&ctx=documentation

QUICK OVERVIEW

GET ALL USER

http://localhost:8080/api/users

RESPONSE (200) with callback :
{
    "status": "success",
    "data": [
        {
            "age": 12,
            "id": "93ed2037-9482-4784-8cd5-c71f9c71e626",
            "name": "rangga"
        },
        {
            "age": 25,
            "id": "a369824b-726b-4331-923d-bfc3af394e5c",
            "name": "abra"
        }
    ]
}

GET USER BY ID

http://localhost:8080/api/users/93ed2037-9482-4784-8cd5-c71f9c71e626

RESPONSE (200) with callback :
{
    "status": "success",
    "data": {
        "age": 44,
        "id": "93ed2037-9482-4784-8cd5-c71f9c71e626",
        "name": "rangga"
    }
}

POST USER
http://localhost:8080/api/users

REQUEST :
{
    "name" : "rangga",
    "age" : 12
}
RESPONSE (200) with callback :
{
    "status": "success",
    "data": {
        "age": 12,
        "id": "93ed2037-9482-4784-8cd5-c71f9c71e626",
        "name": "rangga"
    }
}

PUT USER
http://localhost:8080/api/users/93ed2037-9482-4784-8cd5-c71f9c71e626

REQUEST :
{
    "name" : "rangga",
    "age" : 44
}
RESPONSE (200) with callback :
{
    "status": "success",
    "data": {
        "age": 44,
        "id": "93ed2037-9482-4784-8cd5-c71f9c71e626",
        "name": "rangga"
    }
}

DELETE USER
http://localhost:8080/api/users/93ed2037-9482-4784-8cd5-c71f9c71e626

RESPONSE :
{
    "status": "success delete user with id 93ed2037-9482-4784-8cd5-c71f9c71e626"
}